
var stateObject = {
    "Country 1": {
        "C1": ["c11", "c12"],
        "C2": ["c21", "c22"]
    },
    "Country 2": {
        "D1": ["d11", "d12"],
        "D2": ["d21", "d22"]
    }
	"Country 3": {
        "D1": ["d11", "d12"],
        "D2": ["d21", "d22"]
    }
}
window.onload = function () {
    var countySel = document.getElementById("countySel"),
        stateSel = document.getElementById("stateSel"),
        citySel = document.getElementById("citySel");
    for (var country in stateObject) {
        countySel.options[countySel.options.length] = new Option(country, country);
    }
    countySel.onchange = function () {
        stateSel.length = 1; // remove all options bar first
        citySel.length = 1; // remove all options bar first
        if (this.selectedIndex < 1) return; // done   
        for (var state in stateObject[this.value]) {
            stateSel.options[stateSel.options.length] = new Option(state, state);
        }
    }
    countySel.onchange(); // reset in case page is reloaded
    stateSel.onchange = function () {
        citySel.length = 1; // remove all options bar first
        if (this.selectedIndex < 1) return; // done   
        var city = stateObject[countySel.value][this.value];
        for (var i = 0; i < district.length; i++) {
            citySel.options[citySel.options.length] = new Option(city[i], city[i]);
        }
    }
}