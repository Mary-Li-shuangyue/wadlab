select Staff.Forename, Staff.Surname
from Staff, Tutorial_Group
where Tutorial_Room = 11 and Staff_No= Tutor and Status != 'Lecturer';