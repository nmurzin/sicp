* Build container `docker build -t clojure-sicp .`
* Run container `docker run -it --rm --name running-sicp-clj-app -v "$PWD"/src:/usr/app/src clojure-sicp`
* Execute `.clj` files inside container `lein exec filename.clj`