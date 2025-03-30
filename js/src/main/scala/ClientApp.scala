package sample

import scala.scalajs.js
import scala.scalajs.js.annotation.*

import org.scalajs.dom

// import viteLogo from "/vite.svg"
@js.native @JSImport("/vite.svg", JSImport.Default)
val viteLogo: String = js.native

@main def main(): Unit =
  dom.document.querySelector("#app").innerHTML = s"""
    <div>
      <a href="https://vitejs.dev" target="_blank">
        <img src="$viteLogo" />
      </a>
      <button id="counter" type="button"></button>
    </div>
  """

  setupCounter(dom.document.getElementById("counter"))

def setupCounter(element: dom.Element): Unit =
  var counter = 0

  def setCounter(count: Int): Unit =
    counter = count
    element.innerHTML = s"count is $counter"

  element.addEventListener("click", e => setCounter(counter + 1))
  setCounter(0)
