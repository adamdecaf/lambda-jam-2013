# Domain Specific Languages (and towers of abstraction)

* Gershom Bazerman

## Numbers

* Can make a great dsl, naturals and reals
* forget -> celi (renamed)
* Galois Connections
* Adjunctions can be used in DSL's to shorten dialects
* Adjoint functors have closue undrer their category, (so we can parse -> pretty print)

## Adjunctions and Programming Languages

* Every language has a theory (model theory)
* A good theory has the ability to partially compute results
* Adjunction between syntax and semantics

```haskell

  Model: Sentence -> a
  Theory: set sentence

  Syntax: Model -> Theory
  Semantics: Theory -> Model
```

* Models have adjoints (if the trees are kept small you can just find the minimum functor)
* This causes normalization by evaluation in our language

```haskell
  semantics :: Test a -> Set (Sentence f) -> Set (Model f a)
  syntax :: Test 1 -> Set (Model f a) -> Set (Senteence f)
```

* More models = fewer theories
* More theories = fewer models
* This is the _correct_ way to write DSL's (as everyone's codomain is someone's domain)
* How do we do this? (And handle recursion) Denotational Semantics

## Actual Lessons for DSL

* Start with your combinators, the meanings that people want to express
* Write each level (and their models) to disallow more semantics and providing more rules
* Keep the AST around, to allow multiple interpretations
* adf-fda: Applicative combinators -> monadic transistion collections -> transition collections -> llvm -> assembly
* Abstract interpretation: can use galois connections, find extremum, check/infert types, partial evaluation

## Papers
* Smith, Peter "The Galois Connection Between Syntax and Semantics" 2010
