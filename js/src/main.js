import './style.css'
import viteLogo from '/vite.svg'
import { setupCounter } from './counter.js'

document.querySelector('#app').innerHTML = `
  <div>
    <a href="https://vite.dev" target="_blank">
      <img src="${viteLogo}" />
    </a>
    <button id="counter" type="button"></button>
  </div>
`

setupCounter(document.querySelector('#counter'))
