(ns clojure-experiment.core)

;
; structure of a block
(def block {:index 1,
            :timestamp 1234345656,
            :transactions [ 
                           {:sender "azezret", :recipient "ererr", :amount 5 } 
                           {:sender "sdfdfd", :recipient "dfdff",  :amount 8}]
            :proof 123456,
            :previous_hash "2cfgghdfdfdfd" })

; root block chain
(defn init-chain 
  [block]
 (let [chain ()]
  (cons chain  block)
  )
 )



(defn get-chain-current-idx 
  [chain]
  (-> (last chain)
      :index)
  )

; create blocki
; timestamp : System/currentTimeMillis
(defn create-block
  [index]
  {:index index, :timestamp (System/currentTimeMillis)}  
  )


; add block function
(defn add-block 
  [chain block]
  (conj chain block)

  )
