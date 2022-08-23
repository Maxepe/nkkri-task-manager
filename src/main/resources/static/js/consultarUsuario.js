async function consultarUsuario() {
    const request = await fetch('/app/consultarusuario', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        },
    });
    const response = await request.json()
    let usuarios = '';
    for (let usuario of response) {
        let usuarioHTML =  '<tr> <td>' + usuario.id + '</td>' +
                    '<td>' + usuario.nombreUsuario + '</td>' +
                    '<td>' + usuario.email + '</td>' +
                    '<td>' + usuario.telefono + '</td>' +
                    '<td>' + usuario.edad + '</td>' +
                    '<td>' + usuario.habilitado + '</td>' +
                    '<td>' + usuario.bloqueado + '</td>' +
                    '</tr>';
        usuarios += usuarioHTML
    }
    document.querySelector('#tablaUsuarios tbody').outerHTML = usuarios;
}