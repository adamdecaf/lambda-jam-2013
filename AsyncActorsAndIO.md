# Async, Actors, and IOC

* Jim Powers (@corruptmemory)

## Problem

* Minimize, reduce, eliminate inversion of control
* Reduce mixing of core logic for solving a particaular problem
* Maintain scailability

## Actors

* Can respond to messages
* Can create other actors
* Can send messages
* No direct access to shared state
* Async communications

```scala
class FooActor extends Actor with ActorLogging {
    def receive = {
        case "test" => log.info("Got test!")
        case u => log.error(s"Unhandled message: $u")
    }
}
```

## Callbacks can be painful

* It can easily become hard to trace where calls are happening and where they're coming from
* Implementation details leak above the layers that they should be encapsulated in.
* No easy way to get a "big picture"
* Could use Future[T] instead, if you wanted.

## scala/async

* Built by typesafe ([scala/async])

[scala/async]: http://github.com/scala/async

```scala
def slowCalc: Future[Int] = /* ... */
def combined = Future[Int] = async {
    await(slowCalc) + await(slowCalc)
}
// Only one blocking call here
val x: Int = Await.result(combined, 5.seconds)
```

Or

```scala
for {
    s1 <- slowCalc
    s2 <- slowCalc2
} yield {
    s1 + s2
}
```

## Akka with Async

* Can we use scala/async in our akka code?
* Just use `async {}` blocks to move asks off the current thread.
* We can get into bad patterns though, with very linear request cycles
* Lifting Future[T]'s in akka actors is an anti pattern (lots of network traffic to specific nodes)

## Experimental Stuff

* Rx (Reactive Excensions)
  * Completely abstracted implementation
* [scala-machines] libraray
  * Ported to Scala from haskell by runar
* [scala/async] Library
  * Created by typesafe
* So, use monadic dsl's to compose network flow
  * Create an AST to then create multiple interpreters

[scala/async]: https://github.com/scala/async
[scala-machines]: https://github.com/runarorama/scala-machines

## Transformations and reactive code

```scala
sealed trait Value[+T]
case class Next[T](value: T) extends Value[T]
case class Error(t: Throwable) extends Value[Throwable]
case object Empty extends Value[Nonthing]
case object Complete extends Value[Nonthing]
```

* Very similar to State[T]
  * But not threading a common state (but reactions)
* Processes represetn the container that execute the transformer function
  * Processes can be linked together
  * So can `for {} yield {}`

## Conclusion

* This is one way to have actos compute strategies across many actor systems
  * Lots of boilerplate..
* Want composability, improve reasoning, testability, robust.
