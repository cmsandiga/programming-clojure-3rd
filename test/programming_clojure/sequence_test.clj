(ns programming-clojure.sequence-test
  (:require [clojure.test :refer :all]
            [programming-clojure.sequence :refer :all]
            ))
(deftest a-test
  (testing "should repeat"
    (is (= (repeat-test)  '("x" "x" "x" "x" "x")))))