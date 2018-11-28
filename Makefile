dir=${CURDIR}
image=clojure-sicp

build:
	docker build -t $(image) .

exec:
	docker run -it --rm --name running-sicp-clj-app -v "$(dir)/src":/usr/src/app $(image)