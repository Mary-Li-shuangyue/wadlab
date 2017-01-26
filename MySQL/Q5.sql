select Surname, Forename, Exam
from Student, Student_Course_Assignments ,Course
where Student=Matric_No and Title = 'CS-1Q' and Course = Code 
order by Surname; 