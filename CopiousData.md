# Copious Data: The iller app for functional programming

- Dean Wampler (@deanwampler)

## Copious Data

* Data so big that traditional scale doens't work
* Trends are that data is increasing
* Formal Schemas are decreasing
* Data driven models and programs (which are constantly driven by data) are increasing

## MapReduce

* flatMap and reduce
* hadoop is the major platform for doing this right now.
* Classic MapReduce doesn't handle multiple maps very well

## How to use this?

* Java api is hard to use.
* Cascading view is a bit nicer since it's at a higher level
* Scalding (scala api) for cascading -- short because of scala's syntax
* Cascalog (clojure api) for cascasding -- short because it's clojure
* Crunch (Java), Scrunch (Scala), Scoobi (Scala)

## Or?

* Spark: It's a hadoop mapreduce alternative
* Spark: Distributed computing with in memory caching, 30x faster then MapReduce
* Hive: SQL ontop of MapReduce

## Back to functional programming

* Combinators: Why are scala, clojure, and sql so concise?
* Programming is math! (duh) (Algebra, Linear Algebra, Set Theory)
* Relational models have combinators without us really knowing them
