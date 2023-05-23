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
| GET         | /employees/{id} | 200 OK | Get employee by ID | `GET /employees/1` | `{"id": 1, "firstName": "John", "lastName": "Doe", ...}` |
| POST        | /employees      | 201 Created | Create employee | `POST /employees` | `{"firstName": "Jane", "lastName": "Smith", ...}` |
| PUT         | /employees/{id} | 204 No Content | Update employee by ID | `PUT /employees/1` | - |
| DELETE      | /employees/{id} | 204 No Content | Delete employee by ID | `DELETE /employees/1` | - |
| ...         | ...      | ... | ... | ... | ... |

| HTTP Method | URL Path | HTTP Status Code | Description | Sample Request | Sample Response |
|-------------|----------|-----------------|-------------|----------------|-----------------|
| GET         | /doctors/{id}   | 200 OK | Get doctor by ID | `GET /doctors/1` | `{"id": 1, "employeeId": 1, "isAvailable": true, ...}` |
| POST        | /doctors        | 201 Created | Create doctor | `POST /doctors` | `{"employeeId": 2, "isAvailable": true, ...}` |
| PUT         | /doctors/{id}   | 204 No Content | Update doctor by ID | `PUT /doctors/1` | - |
| DELETE      | /doctors/{id}   | 204 No Content | Delete doctor by ID | `DELETE /doctors/1` | - |
| ...         | ...      | ... | ... | ... | ... |

| HTTP Method | URL Path | HTTP Status Code | Description | Sample Request | Sample Response |
|-------------|----------|-----------------|-------------|----------------|-----------------|
| GET         | /receptionists/{id} | 200 OK | Get receptionist by ID | `GET /receptionists/1` | `{"id": 1, "employeeId": 3}` |
| POST        | /receptionists      | 201 Created | Create receptionist | `POST /receptionists` | `{"employeeId": 4}` |
| PUT         | /receptionists/{id} | 204 No Content | Update receptionist by ID | `PUT /receptionists/1` | - |
| DELETE      | /receptionists/{id} | 204 No Content | Delete receptionist by ID | `DELETE /receptionists/1` | - |
| ...         | ...      | ... | ... | ... | ... |

| HTTP Method | URL Path | HTTP Status Code | Description | Sample Request | Sample Response |
|-------------|----------|-----------------|-------------|----------------|-----------------|
| GET         | /patients/{id} | 200 OK | Get patient by ID | `GET /patients/1` | `{"id": 1, "emergencySituation": false, "treatmentNeed": "Routine check-up", ...}` |
| POST        | /patients      | 201 Created | Create patient | `POST /patients` | `{"emergencySituation": true, "treatmentNeed": "Emergency treatment", ...}` |
| PUT         | /patients/{id} | 204 No Content | Update patient by ID | `PUT /patients/1` | - |
| DELETE      | /patients/{id} | 204 No Content | Delete patient by ID | `DELETE /patients/1` | - |
| ...         | ...      | ... | ... | ... | ... |

| HTTP Method | URL Path | HTTP Status Code | Description | Sample Request | Sample Response |
|-------------|----------|-----------------|-------------|----------------|-----------------|
| GET         | /sessions/{id} | 200 OK | Get session by ID | `GET /sessions/1` | `{"id": 1, "time": "2023-05-23 10:00:00", "roomNumber": 101, ...}` |
| POST        | /sessions      | 201 Created | Create session | `POST /sessions` | `{"time": "2023-05-23 11:00:00", "roomNumber": 102, ...}` |
| PUT         | /sessions/{id} | 204 No Content | Update session by ID | `PUT /sessions/1` | - |
| DELETE      | /sessions/{id} | 204 No Content | Delete session by ID | `DELETE /sessions/1` | - |
| ...         | ...      | ... | ... | ... | ... |

| HTTP Method | URL Path | HTTP Status Code | Description | Sample Request | Sample Response |
|-------------|----------|-----------------|-------------|----------------|-----------------|
| GET         | /patient-records/{id} | 200 OK | Get patient record by ID | `GET /patient-records/1` | `{"id": 1, "firstName": "John", "lastName": "Doe", "recordDate": "2023-05-23", ...}` |
| POST        | /patient-records      | 201 Created | Create patient record | `POST /patient-records` | `{"firstName": "Jane", "lastName": "Smith", "recordDate": "2023-05-24", ...}` |
| PUT         | /patient-records/{id} | 204 No Content | Update patient record by ID | `PUT /patient-records/1` | - |
| DELETE      | /patient-records/{id} | 204 No Content | Delete patient record by ID | `DELETE /patient-records/1` | - |
| ...         | ...      | ... | ... | ... | ... |
