console.log('here')
// var source = new EventSource("/async");
// source.onmessage = function(ev) {
//   alert('here')
//   console.log("SSE:", ev)
// }

var soc = new WebSocket("ws://nicola.waveaccess.ru:10005/async")
console.log(soc)
soc.onopen = function(ev) {
  console.log('open')
  soc.send('hi')
}
soc.onmessage = function(ev) {
  alert('here', ev)
}
