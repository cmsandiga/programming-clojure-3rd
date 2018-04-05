(ns programming-clojure.sequence)

(defn myfun []
  (sorted-map :c 3 :b 2 :a 5)
  )

(defn vectors []
  (println (next (next [1 2 3])))
  (println (cons 20 '(1 2 3)))
  (println (conj '(1 2 3) 20))
  (println (seq? (rest [1 2 3])))
  )
(defn maps []
  (println {:fname "Aaron" :lname "Bedra"})
  (println (first {:fname "Aaron" :lname "Bedra"}))
  (println (rest {:fname "Aaron" :lname "Bedra"}))
  (println (cons [:mname "james"] {:fname "Aaron" :lname "Bedra"}))
  )

(defn sets []
  (println (first #{:the :quick :brown :fox}))
  (println (rest #{:the :quick :brown :fox}))
  (println (cons :jumped #{:the :quick :brown :fox}))
  (println (conj #{:the :quick :brown :fox} :jumped))
  (println (sorted-set :the :quick :brown :fox :a :b :z :d :f :y :w))
  )

(defn sequences []
  (println (range 10))
  (println (range 10 20 2))
  )

(defn repeat-test []
    (repeat 5 "x")
  )
(defn -main []
  (println (myfun))
  (println (vectors))
  (println (maps))
  (println (sets))
  (println (sequences))
  (repeat-test)
  )

