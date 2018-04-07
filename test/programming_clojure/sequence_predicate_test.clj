(ns programming-clojure.sequence-predicate-test
  (:require [clojure.test :refer :all]
            [midje.sweet :refer :all]
            ))


(fact "should predicate"
      (every? odd? [1 3 5]) => true
      (every? odd? [1 3 5 8]) => false
      (every? even? [2 4 6 8 10]) => true
      )


(fact "some"
      (some even? [2 4 6]) => true
      (some #{3} (range 20)) => 3
      )
