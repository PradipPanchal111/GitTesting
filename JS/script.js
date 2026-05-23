function getHobby(){
  const a=document.querySelector('input[name="hobby"]:checked')?.value;
  alert(a);
}

function getSub(){
  const a=Array.from(document.querySelectorAll('input[name="subject"]:checked')).map(c=>c.value);
  alert(a);
}

