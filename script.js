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

const dispositivos = document.getElementsByClassName("dispositivos")[0];
const quantidades = document.getElementsByClassName("quantidades")[0];
const aparelhos = document.getElementsByClassName("aparelhos")[0];
const horas = document.getElementsByClassName("horas")[0];
const kwHs = document.getElementsByClassName("KwHs")[0];
const valor = document.getElementsByClassName("valor")[0];


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

class Dispositivo{
    constructor(room,quantity,device,hours){
        this.quantity = quantity.value;
        this.device = device.options[device.selectedIndex].text;
        this.hours = hours.value;
        this.kw = device.value;
        this.room = room.value;
        this.value = parseInt(this.kw) * 0.9;
    }

    addList(){
        let element = document.createElement("p")
        element.className = "block";
        element.innerHTML = this.quantity;
        quantidades.appendChild(element);

        element = document.createElement("p")
        element.className = "block";
        element.innerHTML = this.device;
        aparelhos.appendChild(element);

        element = document.createElement("p")
        element.className = "block";
        element.innerHTML = this.hours;
        horas.appendChild(element);

        element = document.createElement("p")
        element.className = "block";
        element.innerHTML = this.kw;
        kwHs.appendChild(element);

        element = document.createElement("p")
        element.className = "block";
        element.innerHTML = this.room;
        ambiente.appendChild(element);

        element = document.createElement("p")
        element.className = "block";
        element.innerHTML = this.value;
        valor.appendChild(element);
    }
}

let devices = [];

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
    
    devices.push(new Dispositivo(ambiente,quantidade,aparelho,hora));
    devices[0].addList();

    console.log(devices);
    console.log(aparelho);

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
    nDevice.value = nMW.value;
    nDevice.text = nNome.value;
    nMW.value = "";
    nNome.value = "";
    aparelho.add(nDevice);

    alert.style.color = "green";
    alert.innerHTML = "dispositivo adicionado!"
}

nButton.addEventListener("click", nSubmit);
calcular.addEventListener("click", submit);