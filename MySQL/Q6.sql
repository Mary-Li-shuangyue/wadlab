select Forename, Surname
from Staff, Lecturer_Course_Assignments
where course = '7ZFG' and Staff_ID = Staff_No and Status = 'Professor';