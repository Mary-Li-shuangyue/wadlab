select s1.Forename, s1.Surname, s2.Forename, s2.Surname
from Staff as s1, Tutor, Staff as s2
where Staff_ID= s1.Staff_No  and s2.Staff_No = s1.Manager;