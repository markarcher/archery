function showRegisterForm() {

    var elem = document.getElementById('showRegistrationForm');
    elem.style.visibility = 'visible';

    var elemUserName = document.getElementById('Username');
    elemUserName.disabled = true;

    var elemPassword = document.getElementById('Password');
    elemPassword.disabled = true;

    var elemLoginButton = document.getElementById('loginButton');
    elemLoginButton.disabled = true;

}