package main

import (
  "github.com/codegangsta/martini"
)

func main() {
  m := martini.Classic()

  m.Get("/", RespondHello)

  m.Get("/healthcheck/heartbeat", RespondHello)

  m.Run()
}

func RespondHello() string {
  return "Hello There"
}
