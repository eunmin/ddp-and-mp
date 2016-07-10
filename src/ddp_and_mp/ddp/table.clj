(ns ddp-and-mp.ddp.table
  (:refer-clojure :exclude [key get put type])
  (:require [clojure.string :refer [join]]))

(def ^:private table (atom {}))

(defn- key [op type]
  (keyword (str (name op) "-"
                (if (sequential? type)
                  (join ":" (map name type))
                  (name type)))))

(defn get [op type]
  ((key op type) @table))

(defn put [op type item]
  (swap! table assoc (key op type) item))
