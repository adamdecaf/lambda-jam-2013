# Systems That forever run and scale

* Joe Armstrong (@joeerl)

## Problem Domain

* Go from sequential programming to distributed systems
* Lots of computers, distributed and parallel programming, fault detection, failure repair
* Systems that scale down (instead of up)
* We can't stop big systems, or distributed systems (where _does_ it stop?)
* Distributed programming is hard
    * Systems are homogeneous, testing them can be hard
    * They sometimes require special hardware (and a lot of it!)

## Arch / Algo

* Where is my data on a distributed system? [Chord algo]
* Send out an odd number of copies and vote on them! (Sure, it seems easy)
* With distributed systems it's easy to lose or corrupt data.
* Distributed Leadership ([Paxos algo])

[Chord algo]: http://en.wikipedia.org/wiki/Chord_(peer-to-peer)
[Paxos algo]: http://en.wikipedia.org/wiki/Paxos_(computer_science)

## Six rules for making systems

* Isolation: Computations must be isolated
  * Gives us: fault-tolerance, scailability, readability, testability,
  * comprehensibility, code upgrade
* Concurrency: Can I describe a computation as concurrent processes
  * Many problems are embarrassingly parallel. (Ex. the world)
* Failure Detection: If you can't detect when something fails (or dies) you can't handle it
  * Has to work across all boundries
  * Implies no shared state, async messages
* Fault Identification: Knowledge of why a process crashed or failed.
* Live Code Upgrade: Can't really stop 10000 machines
* Stable Storage: Can't have hardware losing data.
  * Store it forever
  * Implies multiple copies

## Quotes

* No Shared Sate
* Fail Fast & Quickly & Early
* "Let it crash" -- all sequential languages get error handling wrong.

## How the six rules are programmed in erlang

* Functional language
* OTP Design Principals
* Virtual Machine (BEAM)
* User a library that does this!

__Rules__

* Isolation
  * Erlang processes are isolated
  * One earlang node can have millions of processes
  * No shared memory
* Concurrency
  * Erlang processes are concurrent
  * Erlang spreads over across cores as provided.
* Failure Detection
  * Processes can have Supervision over other processes
  * Fix the error somewhere else with some other process
* Fault Detection
  * Erlang error symbols contain error descriptors.
* Live code upgrade
  * erlang can be modified as it runs
* Stable storage

## Conclusion

* Fault tolerance and isolation implies stability
* When you build parallel by default you gain many advantages.
* Elixir

[Elixir]: http://elixir-lang.org
