# Programming for the Expression of Ideas

- Gerald Jay Sussman (gte@mit.edu)

## How programming helps you think

* The problem with learning EE or physics is:
  * Math and physics understand a shared culture of math
  * It's hard to talk across cultures
* Students have to learn the culture _and_ the material.
  * `cos2(pi) == cos(pi)^2` but `cos^(-1)(pi) != 1/cos(pi)`
* What does `F=ma` really mean?
  * The trajectory must satify some other formula. (with a specific force law)
  * Newton's equation is really a macro (with untyped and undeclared paramaters)
* Leibniz notation is troublesum!
  * partial derivatives often have symbols left out.

## Hairy code

* Lagrange equations are real valued functions of:
  * time, generalized coordinates, and generalized velocities
* However, there's a lot of left out symbols in the syntax
* Programming (read: scheme) helps to organize equations and forces you to now have hidden arguments
* The fields of math and physics talk to each other in their common languages
  * They know the implicit parts to their equations
  * Programming (code) forces everything to be somewhere, it allows more people to understand "harder" fields.
