# Tuesday Jam Notes

## Goal

* Kaggle ditigit recognizer contest.
  * The goal is to automatically recognize.
  * 28x28, grayscale, flattened
  * 1 [0, 0, 255, 0, 255, 0, etc..]
* Build a classifier based on the entries.
  * KNN K-Nearest-Neighbor algorithm
  * Lookup known examples in training set
    * find K closest examples
      * Distance formula
    * Take a majority

## Docs

* [KNN Algorithm]
* [Documentation]

[Documentation]: https://raw.github.com/strangeloop/lambdajam2013/master/jams/learning/Lambda-Jam.txt
[KNN Algorithm]: http://en.wikipedia.org/wiki/K-nearest_neighbor_algorithm

## Solutions

* https://gist.github.com/jenglert/5960901
* https://gist.github.com/bgruber/5960910
* https://github.com/pcorliss/lambdajam2013/blob/master/jams/learning/src/lambada/core.clj
