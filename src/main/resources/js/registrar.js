$(document).ready(function() {
    loadUsers();
});

async function loadUsers() {
    const userRequest = await fetch('usuario/iniciarSesion/1', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
    });
}