function getSingleEmployeeDetails(){
	var singleEmployeeID = document.getElementById('singleEmployeeID').value;
	$.ajax({
		type :'GET',
		url : '/employee/'+singleEmployeeID,
		success: function(employee) {
				
			$('#singleEmployee').append("<li>"+employee.empID+"        "+employee.name+"        "+employee.address+"</li>"+"<br>");
		},
		error: function(){
			alert('error displaying employee');
		}
	});
};



function submitData() {
	var empID = document.getElementById('employeeId').value;
	var name = document.getElementById('employeeName').value;
	var address = document.getElementById('address').value;

    var employeeDetails = {
    empID ,
	name,
	address
    };

	$.ajax({
		type : 'POST',
		url : '/employee',
		data : JSON.stringify(employeeDetails),
		beforeSend: function(xhr) {
					xhr.setRequestHeader("Accept", "application/json");
					xhr.setRequestHeader("Content-Type", "application/json");
				},
		success: function(){
			$('#employeeList').append("<li>"+empID+"        "+name+"        "+address+"</li>"+"<br>");		
		},
		error: function(){
			alert('error saving employee');
		}
	});
	
};

function getAllEmployeeDetails(){


	$.ajax({
		type : 'GET',
		url : '/employee',
		success: function(employees) {
					
			for (var i = 0; i < employees.length; i++) {

				$('#employeeList').append("<li>"+employees[i].empID+"        "+employees[i].name+"        "+employees[i].address+"</li>"+"<br>");

			}
			
				
			
		}
	});
};