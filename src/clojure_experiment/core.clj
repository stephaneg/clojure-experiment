(ns clojure-experiment.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))



(defn messenger [msg]
  (let [a 7
        b 5
        c (clojure.string/capitalize msg)]
    (println a b c)
    )
  
  )
(messenger "steph")

(defn messenger-builder [greeting]
  (fn [who] (println greeting who))
  )

(def hello-er (messenger-builder "Hello"))

(hello-er "world !")

(defn random-ints 
  [limit]   
  (lazy-seq
     (println "realizing random number") 
     (cons (rand-int limit)
           (random-ints limit)
     )
  )
) 

(take 10 (random-ints 50))
