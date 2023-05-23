# hospital-management-system
### The 4 core principles for the hospital managment system are:

- Patient
- Receptionist
- Doctor
- Session


**For better quality both 'PNG' & 'PDF' files are attached**


![hospital-managment-system drawio](https://github.com/JihadKhader/hospital-management-system/assets/105065451/fcda35d5-c121-4c04-b9db-bec627f71f17)

## API Documentation

| HTTP Method | URL Path | HTTP Status Code | Description | Sample Request | Sample Response |
|-------------|----------|-----------------|-------------|----------------|-----------------|
| GET         | /employees/{id} | 200 OK | Get employee by ID | `GET /employees/1` | `{"id": 1, "firstName": "Jihad", "lastName": "Khader", "branch": "Receptionist", "employeeNumber": 1212, "shift": "Day", "isDoctor": false}` |
| POST        | /employees      | 201 Created | Create employee | `POST /employees` | `{"firstName": "Ahmad", "lastName": "Majid", "branch": "Doctor", "employeeNumber": 2211, "shift": "Night", "isDoctor": true}` |
| PUT         | /employees/{id} | 200 OK | Update employee by ID | `PUT /employees/1` | `SUCCESS`  |
| DELETE      | /employees/{id} | 200 OK | Delete employee by ID | `DELETE /employees/1` | `SUCCESS` |

| HTTP Method | URL Path | HTTP Status Code | Description | Sample Request | Sample Response |
|-------------|----------|-----------------|-------------|----------------|-----------------|
| GET         | /doctors/{id}   | 200 OK | Get doctor by ID | `GET /doctors/1` | `{"id": 5, "employeeId": 1, "isAvailable": true, "section": "Cardiology", "roomNumber": 101}` |
| POST        | /doctors        | 201 Created | Create doctor | `POST /doctors` | `{"employeeId": 6, "isAvailable": true, "section": "Pediatrics", "roomNumber": 102}` |
| PUT         | /doctors/{id}   | 200 OK | Update doctor by ID | `PUT /doctors/1` | `SUCCESS` |
| DELETE      | /doctors/{id}   | 200 OK | Delete doctor by ID | `DELETE /doctors/1` | `SUCCESS` |

| HTTP Method | URL Path | HTTP Status Code | Description | Sample Request | Sample Response |
|-------------|----------|-----------------|-------------|----------------|-----------------|
| GET         | /receptionists/{id} | 200 OK | Get receptionist by ID | `GET /receptionists/1` | `{"id": 1, "employeeId": 1}` |
| POST        | /receptionists      | 201 Created | Create receptionist | `POST /receptionists` | `{"employeeId": 7}` |
| PUT         | /receptionists/{id} | 200 OK | Update receptionist by ID | `PUT /receptionists/1` | `SUCCESS` |
| DELETE      | /receptionists/{id} | 200 OK | Delete receptionist by ID | `DELETE /receptionists/1` | `SUCCESS` |

| HTTP Method | URL Path | HTTP Status Code | Description | Sample Request | Sample Response |
|-------------|----------|-----------------|-------------|----------------|-----------------|
| GET         | /patients/{id} | 200 OK | Get patient by ID | `GET /patients/1` | `{"id": 1, "emergencySituation": true, "treatmentNeed": "Emergency treatment", "patientRecord": "4", "doctorId": 1, "receptionistId": 1, "medicineName": "Aspirin"}` |
| POST        | /patients      | 201 Created | Create patient | `POST /patients` | `{"emergencySituation": false, "treatmentNeed": "Regular checkup", "patientRecord": "5", "doctorId": 2, "receptionistId": 2, "medicineName": "Paracetamol"}` |
| PUT         | /patients/{id} | 204 No Content | Update patient by ID | `PUT /patients/1` | `SUCCESS` |
| DELETE      | /patients/{id} | 204 No Content | Delete patient by ID | `DELETE /patients/1` | `SUCCESS` |

| HTTP Method | URL Path | HTTP Status Code | Description | Sample Request | Sample Response |
|-------------|----------|-----------------|-------------|----------------|-----------------|
| GET         | /sessions/{id} | 200 OK | Get session by ID | `GET /sessions/1` | `{"id": 1, "time": "2023-05-23 10:00:00", "roomNumber": 101, "doctorId": 1, "patientId": 1}` |
| POST        | /sessions      | 201 Created | Create session | `POST /sessions` | `{"time": "2023-05-23 11:00:00", "roomNumber": 102, "doctorId": 2, "patientId": 2}` |
| PUT         | /sessions/{id} | 204 No Content | Update session by ID | `PUT /sessions/1` | `SUCCESS` |
| DELETE      | /sessions/{id} | 204 No Content | Delete session by ID | `DELETE /sessions/1` | `SUCCESS` |

| HTTP Method | URL Path | HTTP Status Code | Description | Sample Request | Sample Response |
|-------------|----------|-----------------|-------------|----------------|-----------------|
| GET         | /patient-records/{id} | 200 OK | Get patient record by ID | `GET /patient-records/1` | `{"id": 1, "firstName": "Moe", "lastName": "Ahmad", "recordDate": "2023-05-23", "previousDiseases": "Strong Headache", "bloodType": "A+", "medicineTake": "Acamol", "previousEntries": "2023-05-20", "allergy": "None", "patientId": 1}` |
| POST        | /patient-records      | 201 Created | Create patient record | `POST /patient-records` | `"firstName": "Moe", "lastName": "Ahmad", "recordDate": "2023-05-23", "previousDiseases": "Strong Headache", "bloodType": "A+", "medicineTake": "Acamol", "previousEntries": "2023-05-20", "allergy": "None", "patientId": 1}` |
| PUT         | /patient-records/{id} | 200 OK | Update patient record by ID | `PUT /patient-records/1` | `SUCCESS` |
| DELETE      | /patient-records/{id} | 200 OK | Delete patient record by ID | `DELETE /patient-records/1` | `SUCCESS` |


| HTTP Method | URL Path | HTTP Status Code | Description | Sample Request | Sample Response |
|-------------|----------|-----------------|-------------|----------------|-----------------|
| GET         | /patient-records/{id} | 200 OK | Get patient record by ID | `GET /patient-records/1` | `{"id": 1, "firstName": "Moe", "lastName": "Ahmad", "recordDate": "2023-05-23", ...}` |
| POST        | /patient-records      | 201 Created | Create patient record | `POST /patient-records` | `{"firstName": "Jana", "lastName": "Izhiman", "recordDate": "2023-05-24", ...}` |
| PUT         | /patient-records/{id} | 200 OK | Update patient record by ID | `PUT /patient-records/1` | `SUCCESS`|
| DELETE      | /patient-records/{id} | 200 OK | Delete patient record by ID | `DELETE /patient-records/1` | `SUCCESS` |
