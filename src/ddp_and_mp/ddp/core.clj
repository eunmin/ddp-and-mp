(ns ddp-and-mp.ddp.core
  (:refer-clojure :exclude [get put])
  (:require [ddp-and-mp.ddp.table :refer [get]]))

(defn apply-generic [op & args]
  (let [type-tags (map :type args)]
    (if-let [proc (get op type-tags)]
      (apply proc (map :contents args))
      (throw (ex-info "No method for these types" {:op op :type-tags type-tags})))))
