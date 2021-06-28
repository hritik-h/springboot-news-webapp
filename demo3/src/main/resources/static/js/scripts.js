$(document).ready(function(){
    $('.post-wrapper').slick({
        slidesToShow: 3,
        slidesToScroll: 1,
        autoplay: true,
        autoplaySpeed: 2000,
        nextArrow: $('.next'),
        prevArrow: $('.next')
      });
});

/*
let divelement = document.getElementsByClassName('post')[6];
//let divelement = document.createElement('div');
//console.log(divelement);
let textNode = document.createTextNode('This is the text Node');
//console.log(divelement);
divelement.appendChild(textNode);
let mainContent = document.querySelector('.main-content');
//console.log(mainContent);
let newPost = divelement.cloneNode(true);
//let newPost = divelement.getElementsByTagName('img').src = 'https://cdn.pixabay.com/photo/2016/12/28/09/36/web-1935737_960_720.png';
mainContent.append(newPost);

//console.log(mainContent);

var message = `${jsonString}`;
console.log(message)

*/