#!/bin/bash

mvn clean install
docker build -t dsw88-test .
