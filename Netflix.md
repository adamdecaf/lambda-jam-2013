# Functional Reactive Programming in the Netflix API

* Ben Christensen (@benjchristensen)

## Functional Reactive Programming

* Functional style and methods
* Reactive function applications

## Sync vs Async code

* How can we move from `public Data getData();` to a more apprpoiate approach?
  * Mobile teams need to pick between sync and async code
  * Found Microsoft's [Rx] (Observable)
* Goes from blocking API's to Observable<T>
* The API chooses where something is blocking or non-blocking
  * And what resources it uses.

[Rx]: http://msdn.microsoft.com/en-us/data/gg577609.aspx

```java
// Iterable      |  Observable
// pull          |  pull
T next()         |  onNext(T)
throws Exception |  onError(Exception)
returns          |  onComplete(T)
```

## Rx Examples

* Make Really nice callbacks in the code
* Contains many common functional methods and procedures
  * merge, zip, map, flatMap, etc..
* Allows easy to create and manage abstractions as part of Rx

```Rx
Observable.create({observer =>
  try {
      observer.onNext(new Video(id));
      observer.onComplete();
  } catch (Exception e) {
      observer.onError(e);
  }
})
```

### Error Handling

* Rx includes passing errors as first class citizens
* Accumulate errors on each level as they appear.
  * `onErrorReturnNext`: Call some other method to finish the total call (send another Observable)
  * `onErrorReturn`: Just finish your Observable

## Why? How? Use Cases?

* Interactions are all Async and declarative.
* Api Impl controlls concurrency behaviour.
* Every abstraction behind the api allows to easy change where data is coming from
  * If it's batched or not, cached anywhere..

## Lessons Learned

* Almost no netflix developer had experience
  * Training was the hardest part (and full of arguments)
* Then we had to convince all other developers (JS, C#, etc..) to force them to change their mindset.
* Onboarding developers to FP and Rx
* Debugging and Tracing: Want to full trace requests all the way throughout the system
* "Don't mutate state outside of functions."
