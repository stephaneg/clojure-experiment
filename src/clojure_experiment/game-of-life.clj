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

(pprint glider)

(defn neighbours
  [[x y]]
  (for [dx [-1 0 1] dy [-1 0 1] :when (not= 0 dx dy)] [(+ dx x) (+ dy y)]))


(neighbours [[1 1]])

