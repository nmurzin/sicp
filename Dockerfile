FROM clojure:alpine
VOLUME ["src/", "/usr/src/app"]
WORKDIR /usr/src/app
RUN lein deps