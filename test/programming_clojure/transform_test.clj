(ns programming-clojure.transform_test
  (:require [clojure.test :refer :all]
            [midje.sweet :refer :all]
            ))


(fact
  (map #(format "<p>%s</p>" %) ["a" "b"]) => '("<p>a</p>" "<p>b</p>")
  (map #(format "<%s>%s</%s>" %1 %2 %1) ["h1" "h2"] ["a" "b"]) => '("<h1>a</h1>" "<h2>b</h2>")

  (reduce + '(1 2 3 4)) => 10
  (sort '(10 5 1 4 6)) => '(1 4 5 6 10)
  )
(def whole-numbers (iterate inc 1))
(fact
  (for [word ["a" "b"]] (format "<p>%s</p>" word)) => '("<p>a</p>" "<p>b</p>")
  (take 10 (for [n whole-numbers :when (even? n)] n)) => '(2 4 6 8 10 12 14 16 18 20)
  ;(for [file "ABCDEFGH" rank (range 1 9)] (format "%c%d" file rank)) => '(​"A1"​ ​"A2"​ ... elided ... ​"H7 ""H8")
  )
