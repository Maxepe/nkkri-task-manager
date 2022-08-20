async function registrarUsuario() {
    let usuario = {};
    usuario.nombreUsuario = document.getElementById('nombre_usuario').value;
    usuario.contrasena = document.getElementById('contrasena').value;
    usuario.email = document.getElementById('email').value;
    usuario.edad = document.getElementById('edad').value;

    const request = await fetch('app/registrarusuario', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(usuario)
    });

    const response = await request.json();

    console.log(response);
    console.log('head: ' + response.head);
    console.log('body: ' + response.body);
}