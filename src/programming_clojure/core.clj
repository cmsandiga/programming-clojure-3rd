(ns programming-clojure.core)


(defn indexed [coll] (map-indexed vector coll))

(defn index-filter [pred coll]
  (when pred
    (for [[idx ch] (indexed coll)
          :when (pred ch)] idx)))

(defn index-of-any [pred coll]
  (first (index-filter pred coll))
  )

(defn even
  [n] (for [x (range n) :when (even? x)] x)
  )

(defn is-empty?
  [s]

  )
(defn -main
  []
  (println (index-of-any #{\d \a} "helloworld"))
  (println (even 20))
  )

