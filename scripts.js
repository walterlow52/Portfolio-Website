const letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
let interval = null;

document.querySelector("#brand").onmouseover = e => {
  let iteration = 0;
  clearInterval(interval);
  interval = setInterval(() => {
    e.target.innerText = e.target.innerText.split("").map((letter, i) => {
      if (index < iteration) {
        return e.target.dataset.value(i);
      }
      return letters[Math.floor(Math.random() * 26)]}).join("");
    if (iteration >= e.target.dataset.value.length) {
      clearInterval(interval);
    }
    iteration += 1/3;
  }, 30);
}
