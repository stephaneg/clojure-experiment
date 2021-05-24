(ns clojure-experiment.core)

(defn empty-board 
  [w h] 
  (vec (repeat w (vec (repeat h nil)))))

(empty-board 3 3)

(defn populate
  [board living-cells]
  (reduce (fn [board coordinates] (assoc-in board coordinates :on))
          board
          living-cells))

(def glider (populate (empty-board 6 6) #{[2 0] [2 1] [2 2] [1 2] [0 1]}))


