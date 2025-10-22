const nav=document.querySelector("header.header");
window.addEventListener("scroll",()=>{
 console.log(window.scrollY);
  if(window.scrollY>120){
     nav.style.top=0;
  }
  else{
    nav.style.top="-50px";
  }
});
