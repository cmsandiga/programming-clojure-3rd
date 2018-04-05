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
(defn mapas []
  (println {:fname "Aaron" :lname "Bedra"})
  (println (first {:fname "Aaron" :lname "Bedra"}))
  (println (rest {:fname "Aaron" :lname "Bedra"}))
  (println (cons [:mname "james"]  {:fname "Aaron" :lname "Bedra"}))
  )

(defn seq [])
(defn -main []
  (println (myfun))
  (println (vectors))
  (println (mapas))

  )

