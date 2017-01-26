select Student_Course_Assignments.Student, (Exam + Practical)/2 as average
from Student_Course_Assignments, Student
where (surname = 'Smith' or surname = 'Saunders')and Matric_no = Student;