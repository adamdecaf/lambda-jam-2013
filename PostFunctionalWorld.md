# Life in a Post-Functional World

- Daniel Spiewak (@djspiewak)

## Definitons

* Functional Programming
  * Functions as the primary unit abstraction
* Object Oriented Programming
  * Objects as the primary unit of abstraction

## Modules / Functions

* Real systems have lots of functions
* A set of functions is not a function
* Namespacing is not sufficient
* Depenencies should be expressed
* Concret binding should be deferred
* Functors allow module deps

## Scala

* Traits are modules
* Type abstraction
* Deps via inheritance
* Instanted traits are modules

## Noteworthy

* In SML, the function is first-class
* In Scala, the module s first-class
  * functions are modules

## Expression Problem

* Define a datatype be cases
* Add new cases to the datatype
* Add new functions over the datatype
* Don't recompile!

## Subtype Polymorphism

* Smart cases
* Easy to add cases
* Hard to add methods

## Expression Problem vs

* There is no "solution" to the problem
* Pick and choose our technique
* Objects (or some near approximation) become essential
* Pattern matching is also essential

## Clojure

* Protocols unify typeclasses and classes
* Oliveira and Solzmann, 2008
* `todo:` add code example

## Protocols

* A special case of multi-methods
* Part of record definiton
* support for many of the OO evils

## Conclusion

* Modules are vital #haskellfail
* Objects help address expression problem
* Not everything OO / procedural is evil
* Traditional notions of FP are naive
