$(document).ready(function()){
    $("#form-login").submit(event){
      event.preventDefault()  ;
      aunteticarUsuario();
   });
});

function auntenticarUsuario(){
    let username = $("#usuario").val();
    let contrasena = $("#contrasena").val();
     $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletTest",
        data: $.param({
            username : username,
            contrasena : contrasena
        }),
        success: function(result){
            let parsedResult = JSON.parsed(result);
        if(parsedResult != false)  {
            $("#login-error").addClass("d-none");
            let username = parsedResult['username'];
            document.location.href = "home.html?username= " +username;
        }else{
          $("#login-error").removeClass("d-none");  
        }
    });
}