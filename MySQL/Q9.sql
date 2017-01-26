select Student, (Exam + Practical)/2 as average
from Student_Course_Assignments
Where Exam !='null' or Practical !='null';
