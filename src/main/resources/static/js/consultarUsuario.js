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
        let borrar = '<button href="#" onclick="eliminarUsuario('+ usuario.id +')" class="btn btn-danger" ><i class="fas fa-trash"> </i> </button>'
        let editar = '<button href="#" onclick="editarUsuario('+ usuario.id +')" class="btn btn-danger" ><i class="fas fa-trash"> </i> </button>'

        let usuarioHTML =  '<tr> <td>' + usuario.id + '</td>' +
                    '<td>' + usuario.nombreUsuario + '</td>' +
                    '<td>' + usuario.email + '</td>' +
                    '<td>' + usuario.telefono + '</td>' +
                    '<td>' + usuario.edad + '</td>' +
                    '<td>' + usuario.habilitado + '</td>' +
                    '<td>' + usuario.bloqueado + '</td>' +
                    '<td>' + borrar + editar + '</td>' +
                    '</tr>';
        usuarios += usuarioHTML
    }
    document.querySelector('#tablaUsuarios tbody').outerHTML = usuarios;
}

async function eliminarUsuario(idusuario){

    if(!confirm("Seguro quiere eliminar usuario?")){
        return
    }

    const request = await fetch('app/eliminarusuario/'+idusuario, {
        method: 'DELETE',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        },
    });
    window.location.reload()
}

function editarUsuario(idUsuario){

    window.location='http://localhost:8080/editarUsuario.html?idusuario='+idUsuario

}