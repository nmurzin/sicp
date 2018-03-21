FROM clojure:alpine
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
COPY src/ /usr/src/app
COPY project.clj /usr/src/app/project.clj
RUN lein deps