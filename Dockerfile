FROM clojure:alpine
VOLUME ["src/", "/usr/src/app"]
COPY project.clj /usr/src/app/project.clj
WORKDIR /usr/src/app
RUN lein deps