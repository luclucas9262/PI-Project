const ambiente = document.getElementById("ambiente");
const aparelho = document.getElementById("aparelho");
const nAparelho = document.getElementById("novoAparelho");
const quantidadeP = document.getElementById("quantidadeP");
const horasP = document.getElementById("horasP");
const calcular = document.getElementById("calcular");

aparelho.addEventListener("change",function(){
    if(aparelho.value === "new"){
        nAparelho.style.display = "list-item"
    };
})

function update(){
    
} 

calcular.addEventListener("click", update);