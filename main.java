Webcam.set({
    width: 220,
    height: 190,
    image_format: 'jpeg',
    jpeg_quality: 100,
});
Webcam.attach('#camera');

takeSnapShot = function () {
    Webcam.snap(function (data_uri) {
    document.getElementById('snapShot').innerHTML = 
    '<img src="' + data_uri + '" width="70px" height="50px" />';
    });
}

takeSnapShot = function () {
    Webcam.snap(function (data_uri) {
    downloadImage('arun', data_uri);
    });
}

downloadImage = function (name, datauri) {
    var a = document.createElement('a');
    a.setAttribute('download', name + '.png');
    a.setAttribute('href', datauri);
    a.click();
}