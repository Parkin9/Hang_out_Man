var yes = new Audio("sound/yes.wav");
var no = new Audio("sound/no.wav");
var win = new Audio("sound/win.wav");
var defeat = new Audio("sound/defeat.wav");
var pictureNum = 0;

var password = document.getElementById("model").value;
password = password.toUpperCase();
//console.log(password);


var passwordDash = "";
for(var i = 0; i<password.length; i++) {

    if(password.charAt(i) === " ") {

        passwordDash = passwordDash + " ";
    } else {

        passwordDash = passwordDash + "-";
    }
}


function writePassword() {

    document.getElementById("board").innerHTML = passwordDash;
}


var letters = new Array(35);
letters[0] = "A"; letters[1] = "Ą"; letters[2] = "B";
letters[3] = "C"; letters[4] = "Ć"; letters[5] = "D";
letters[6] = "E"; letters[7] = "Ę"; letters[8] = "F";
letters[9] = "G"; letters[10] = "H"; letters[11] = "I";
letters[12] = "J"; letters[13] = "K"; letters[14] = "L";
letters[15] = "Ł"; letters[16] = "M"; letters[17] = "N";
letters[18] = "Ń"; letters[19] = "O"; letters[20] = "Ó";
letters[21] = "P"; letters[22] = "Q"; letters[23] = "R";
letters[24] = "S"; letters[25] = "Ś"; letters[26] = "T";
letters[27] = "U"; letters[28] = "V"; letters[29] = "W";
letters[30] = "X"; letters[31] = "Y"; letters[32] = "Z";
letters[33] = "Ż"; letters[34] = "Ź";


window.onload = start;


function start() {

    var divContent = "";
    for(var i = 0; i < 35; i++) {

        var element = "lett" + i;
        divContent = divContent + '<div class="letter" onclick="checkLetter('+ i +')" id="'+ element +'">'+ letters[i] +'</div>';
        if((i+1) %7 === 0) {

            divContent = divContent + '<div style="clear: both;"></div>';
        }
    }

    document.getElementById("alphabet").innerHTML = divContent;
    writePassword();
}


String.prototype.setCharAt = function(charPlace, newChar) {

    if(charPlace > this.length -1) {

        return this.toString();
    } else {

        return this.substr(0, charPlace) + newChar + this.substr(charPlace + 1);
    }
};


function checkLetter(num) {

    var element;
    var hitLetter = false;

    for (i = 0; i < password.length; i++) {

        if (password.charAt(i) === letters[num]) {

            passwordDash = passwordDash.setCharAt(i, letters[num]);
            hitLetter = true;
        }
    }

    if (hitLetter === true) {

        yes.play();

        element = "lett" + num;
        document.getElementById(element).style.background = "#003300";
        document.getElementById(element).style.color = "#00C000";
        document.getElementById(element).style.border = "3px solid #00C000";
        document.getElementById(element).style.cursor = "default";

        writePassword();
    } else {

        no.play();

        element = "lett" + num;
        document.getElementById(element).style.background = "#330000";
        document.getElementById(element).style.color = "#C00000";
        document.getElementById(element).style.border = "3px solid #C00000";
        document.getElementById(element).style.cursor = "default";
        document.getElementById(element).setAttribute("onclick", ";");

        pictureNum++;
        document.getElementById("picture").innerHTML = '<img src="img/s'+ pictureNum +'.jpg" alt=""/>'
    }

    //win
    if(password === passwordDash) {
        win.play();
        document.getElementById("alphabet").innerHTML = 'Udało się! <br/>'+ password + '<br/><br/><span class="reset" onclick="location.reload()">Jeszcze raz?</span>';
    }

    //defeat
    if(pictureNum >= 9) {
        defeat.play();
        document.getElementById("alphabet").innerHTML = 'Przegrana... <br/>'+ password + '<br/><br/><span class="reset" onclick="location.reload()">Jeszcze raz?</span>';
    }
}