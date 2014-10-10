FROM dsw88/go

# Add source to correct go location
ADD ./webapp/ /go/src/github.com/dsw88/docker-examples/go/webapp

# Install app and dependencies
RUN cd /go/src/github.com/dsw88/docker-examples/go/webapp; \
    go get ./...; \
    go install

EXPOSE 3000

CMD go/bin/webapp
