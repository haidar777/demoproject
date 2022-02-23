$(document).ready(function(){

	const targetDiv = document.getElementById("dduser");
	const btn = document.getElementById("log");
	let count=1;
	btn.onclick = function () {
		if (count==1) {
			count = 0;
			element.setAttribute("style", "display: none;");
		} else {
			count=1;
			element.setAttribute("style", "display: block;");

		}
	};
});