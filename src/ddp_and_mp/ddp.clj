(ns ddp-and-mp.ddp
  (:require [ddp-and-mp.ddp.impl :refer :all]
            [ddp-and-mp.ddp.interface :refer :all]))

(install-ddp-rat)

(def one-thrid (make-rat 1 3))

(numer one-thrid)

(denom one-thrid)


