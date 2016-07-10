(ns ddp-and-mp.ddp.impl
  (:require [ddp-and-mp.ddp.table :refer [put]]))

(defn install-ddp-rat []
  (put :numer [:rat]
       (fn [x]
         (first x)))
  (put :denom [:rat]
       (fn [x]
         (second x)))
  (put :make-rat :rat
       (fn [x y]
         {:type :rat
          :contents [x y]}))
  :done)
