async function consultarUsuario() {

    const request = await fetch('/app/consultarusuario', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        },
    });

    const response = await request.json()
    console.log(response.nombreUsuario)
    let tr = $('<tr/>');
    tr.append("<td>" + '' + "</td>");
    tr.append("<td>" + '' + "</td>");
    tr.append("<td>" + '' + "</td>")
    // result["response"].parameter_name
    console.log(response)
    result["response"].status
    $('#tablaUsuarios tbody').append(tr);
}
