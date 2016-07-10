# ddp-and-mp

SICP Data-directed Programing and Message Passing Example

## Usage

```clojure
;; Data-directed Programing Example
(ns ddp-and-mp.ddp
  (:require [ddp-and-mp.ddp.impl :refer :all]
            [ddp-and-mp.ddp.interface :refer :all]))

(install-ddp-rat)

(def one-thrid (make-rat 1 3))

(numer one-thrid)

(denom one-thrid)
```

## License

Copyright © 2016 Eunmin Kim

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
