function printFormData(event){
    
   event.preventDefault();
    const firstName = document.getElementById("firstName").value;
    const lastName = document.getElementById("lastName").value;
    const contact = document.getElementById("contact").value;
    const email = document.getElementById("email").value;

    const details = document.getElementById("details");

    details.innerHTML = `
    <p><strong>First Name : ${firstName}</strong></p>
    <p><strong>Last Name : ${lastName}</strong></p>
    <p><strong>Contact Number : ${contact}</strong></p>
    <p><strong>Email ID : ${email}</strong></p>
    `;

}