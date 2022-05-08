const ambiente = document.getElementById("ambiente");
const aparelho = document.getElementById("aparelho");
const nAparelho = document.getElementById("novoAparelho");
const quantidade = document.getElementById("quantidade");
const hora = document.getElementById("hora");
const calcular = document.getElementById("calcular");
const nButton = document.getElementById("nSubmit")
const error = document.getElementById("error");
const nNome = document.getElementById("nNome");
const nMW = document.getElementById("nMw");
const alert = document.getElementById("addAlert");
const dispositivos = document.getElementsByClassName("dispositivos");

aparelho.addEventListener("change",function(){
    if(aparelho.value === "new"){
        nAparelho.style.display = ""
        alert.innerHTML = ""
        nMW.value = "";
        nNome.value = "";
    }
    else{
        nAparelho.style.display = "none"
    };
})



function submit(){
    //Error detector
    error.innerHTML = "";
    let errorDetector = false;
    if(ambiente.value === ""){
        error.innerHTML += "Selecione um ambiente";
        let br = document.createElement("br");
        error.appendChild(br);
        errorDetector = true;
    }
    if(aparelho.value === ""){
        error.innerHTML += "Selecione um Aparelho"
        let br = document.createElement("br");
        error.appendChild(br);
        errorDetector = true;
    }
    if(aparelho.value === "new"){
        error.innerHTML += "Aparelho n&aumlo pode ser 'novo dispositivo'"
        let br = document.createElement("br");
        error.appendChild(br);
        errorDetector = true;
    }
    if(quantidade.value === ""){
        error.innerHTML += "Coloque quantos do mesmo aparelho est&aumlo sendo usandos"
        let br = document.createElement("br");
        error.appendChild(br);
        errorDetector = true;
    }
    if(hora.value === ""){
        error.innerHTML += "Coloque quantas horas o aparelho est&aacute sendo utilizado"
        let br = document.createElement("br");
        error.appendChild(br);
        errorDetector = true;
    }
    if(errorDetector){
        error.style.color = "red";
        return;
    }
    
    error.style.color = "green";
    error.innerHTML = "Dispositivo adicionado!";
} 

function nSubmit(){
    //error detector
    let errorDetector = false;
    alert.innerHTML = "";
    if(nNome.value === ""){
        alert.innerHTML += "adicione um nome para o novo aparelho"
        let br = document.createElement("br");
        alert.appendChild(br);
        errorDetector = true;
    }
    if(nMW.value === ""){
        alert.innerHTML += "adicione os Mw/h do novo aparelho"
        let br = document.createElement("br");
        alert.appendChild(br);
        errorDetector = true;
    }
    if(errorDetector){
        alert.style.color = "red";
        return;
    }

    let nDevice = document.createElement("option");
    nDevice.id = nMW.value;
    nDevice.text = nNome.value;
    nMW.value = "";
    nNome.value = "";
    aparelho.add(nDevice);

    alert.style.color = "green";
    alert.innerHTML = "dispositivo adicionado!"
}

nButton.addEventListener("click", nSubmit);
calcular.addEventListener("click", submit);