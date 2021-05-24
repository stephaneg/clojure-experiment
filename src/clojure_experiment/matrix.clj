(ns clojure-experiment.matrix
 (:use clojure.core.matrix)
 (:require [clatrix.core :as cl])
 )

(def A (matrix [[0 1 2] [3 4 5]]))
(pm A)

(def B (cl/matrix [[0 1 2] [3 4 5]]))
(pm B)

(matrix? /A)
(cl/matrix? A)
(cl/matrix? B)

(defn square-mat
  "creates a square matrix of size n x n whose elements are all e"
  [n e & {:keys [implementation]
          :or
          {implementation :persistent-vector}
          }]
  (let [repeater #(repeat n %)]
   (matrix implementation (-> e repeater repeater)))
  )

(defn id-mat
  "Creates an identify matrix of n x n size"
  [n]
    (let [init (square-mat n 0 :implementation :clatrix )
          identity-f (fn [i j n]
                      (if (= i j) 1 n))]
   (cl/map-indexed identity-f init))
  )

(x) pm (id-mat 5)
