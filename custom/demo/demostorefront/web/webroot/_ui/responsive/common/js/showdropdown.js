$(document).ready(function(){

	const targetDiv = document.getElementById("dduser");
	const btn = document.getElementById("log");
	btn.onclick = function () {
		if (targetDiv.style.display != "none") {
			targetDiv.style.display = "none";
		} else {
			targetDiv.style.display = "block";
		}
	};
});