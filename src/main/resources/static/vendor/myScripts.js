//Que las tarjetas de los productos se agregue la clase y aparezca el boton

$(document).ready(function () {
    $('.card').hover(function () {
        $(this).find('.card-img-top').addClass('card-img-top-hover').css('cursor', 'pointer');
        $(this).find('.ver-producto').fadeIn(200);
    }, function () {
        $(this).find('.card-img-top').removeClass('card-img-top-hover');
        $(this).find('.ver-producto').fadeOut(200);
    });
});


