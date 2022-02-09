https://v2.jokeapi.dev/joke/Any?lang=fr

$(() => {
    $.get('https://v2.jokeapi.dev/joke/Any?lang=fr', (response) => {
        $('#jock').html(`
            <p>${response.setup}<p/>
            <span>${response.delivery}</span>
        `);
    });
});