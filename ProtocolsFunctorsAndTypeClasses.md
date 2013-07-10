# Protocols, Functors, and Type Classes

* Creighton Kirkendall (@crkirkendall)

## What's this about?

* Building libraries
* Expression Problem
  * Square peg, round hole
* Fundamental differences between OO

## Problem

* Take a single problem and show it in four languages.
  * Sum over a list of integers and strings
  * Requires `Addable` and `Foldable` concepts over the list

## Clojure

* Define a protocol for Addable and Foldable over `java.lang.Number` and `java.lang.String`
* Implement instances for each one of them.
* We're getting in a Tree, so we have to handle types and process the tree

## Ocaml

* Staticly typed, so we don't have to cover the outside type cases
* Define a module for Addable and Foldable over `java.lang.Number` and `java.lang.String`
* Have to specify extra modules to lift out which ever Foldable we want.

## Haskell

* Define typeclasses for Addable and Foldable
* Very short code (obviously)

## Scala

* type classes for Addable and Foldable
* Implicit instances are created to import.

## Take Aways

* Lib developers have to plan to be extendable
* Functional OO is about extending libraries vs wrapping data
* While certain languages offer features the basic concept is the same
