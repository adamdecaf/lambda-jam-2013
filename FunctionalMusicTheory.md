# Functional Composition

* Chris Ford (@ctford)

## Sheet Music

* Is a DSL used to tell what specific note to play next.
* Isn't very expandable or extensible

## Harmonics

* Our brains can fill in the series of frequencies as they are created, even if some are missing
* Building up this knowledge will allow us to play notes.

## Scale

* We don't play every note, but choose to play specific notes for effect
  * Our brains can fill in the rest
* Given the intervals we can build a midi. (Relative measure)
* Missing or adding just one note can change the meaning (read: the human understanding)

## Building Frames

* Then, create `(note (timing, pitch))` which can be joined together.
* Thus, we can build scales (minor, major, etc..) to play, which are very musical.
* From scales creating longer phrases isn't much of a jump

## Canon

* Series of notes with a functional transformation on themseleves
  * `(defn canon (f notes) (concat notes (f notes)))`
* mirrors (negation), identiy, crab (time analog of mirror)
  * They are all pure functions
* table canon is a mirror composed with a crab.

## DSL's

* Runs are just progressions from note a to b, which can be represented without needing to specify the intermediate notes
  * Just cycle through them, [0, 1, 2, 3, 2, 1, 0]
* Our techniques are made to take inhuman systems and create very human understandable systems
