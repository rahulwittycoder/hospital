This springboot project is implemented with following endpoints:-

GET http://localhost:8080/patients/{room_no} -> Fetches any patient record with given room number 
Sample Output :- Patient [name=Ramanand, age=22, room=90, doctor_name=Mahesh Mishra, date=20-05-2023, expenses=5000, status=ADMITTED]

GET http://localhost:8080/patients -> Returns list of all patients 
Sample Output:-
[
    {
        "name": "Ramanand",
        "age": 22,
        "room": 90,
        "doctor_name": "Mahesh Mishra",
        "date": "20-05-2023",
        "expenses": 5000,
        "status": "ADMITTED"
    }
]

POST http://localhost:8080/patients -> Adds a new record into tha patient table
Sample Input:-{
    "name" : "Ramanand",
    "age" : 22,
    "room" : 90,
    "doctor_name" : "Mahesh Mishra",
    "date" : "20-05-2023",
    "expenses" : 5000,
    "status" : "ADMITTED"
}
Sample Output:-{
    "name": "Ramananad",
    "age": 22,
    "room": 90,
    "doctor_name": "Mahesh Mishra",
    "date": "20-05-2023",
    "expenses": 5000,
    "status": "ADMITTED"
}

POST http://localhost:8080/signup -> Adds a new record into the staff table
Sample input :- {
    "name" : "Mahesh",
    "username" : "obstinate",
    "password" : "password"
}

Sample Output:-{
    "headers": {},
    "body": {
        "name": "Mahesh Mishra",
        "id": 11,
        "password": "password",
        "userame": "obstinateBrain"
    },
    "statusCode": "OK",
    "statusCodeValue": 200
}

GET http://localhost:8080/login -> Authenticates Staff user
Sample Input:- {
    "username" : "obstinate",
    "password" : "password"
}

Sample Output:- {
    "headers": {},
    "body": "Login Success",
    "statusCode": "OK",
    "statusCodeValue": 200
}


Note :- status should either be "ADMITTED" or "DISCHARGED"

Schema Level validations have been applied as per following rules.
Name :- Cannot be empty and greater than or equal to 3 and less than 21.
Date :- Cannot be empty
Age :- Cannot be empty and should lie between 1-100.
Doctor Name :- Same as name
Room number :- Cannot be empty and should lie between 1-1000
Expenses :- Cannot be empty and should not exceed 100000.
Status : Should either be "ADMITTED" or "DISCHARGED"