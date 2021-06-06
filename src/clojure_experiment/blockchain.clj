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
; structure of a chain :
; :txs [ ] : transactions
; :blocks ( ) : list of blocks
(defn init-chain
  ([] {:txs [], :blocks '() }) 
  ([block] { :txs [], :blocks (list (eval block))})
  )

; return the current index of the chain
(defn get-chain-current-idx 
  [chain]
  (-> chain :blocks
      last 
      :index)
  )

; create block
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

; add transaction function
;(defn add-tx
;  [chain sender recipient amount]
;  (

; run code
(def chain (init-chain block))
;(def chain (init-chain))
chain
(get-chain-current-idx chain)

