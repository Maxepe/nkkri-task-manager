async function consultarUsuario() {

    const request = await fetch('/app/consultarusuario', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        },
    });

    const response = await request.json()
    console.log(response)
}
