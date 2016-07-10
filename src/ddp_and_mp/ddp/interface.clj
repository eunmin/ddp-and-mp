(ns ddp-and-mp.ddp.interface
  (:refer-clojure :exclude [get])
  (:require [ddp-and-mp.ddp.core :refer [apply-generic]]
            [ddp-and-mp.ddp.table :refer [get]]))

(defn numer [x]
  (apply-generic :numer x))

(defn denom [x]
  (apply-generic :denom x))

(defn make-rat [x y]
  ((get :make-rat :rat) x y))
