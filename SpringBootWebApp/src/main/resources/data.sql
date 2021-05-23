insert into student(id, name, email, age) values (101, 'Hank Pym', 'hank@antman.ant', 50);
insert into student(id, name, email, dob, age) values (102, 'Bruce Banner', 'bb@gamma.rays', '1980-10-20', 40);
insert into student(id, name, email, dob, age) values (103, 'Hawk Eye', 'arrowGuy77@nevermisses.net', '1977-11-03', 43);

INSERT INTO instructor(id, name, dob) VALUES (999, 'Farnsworth, Jethro', '1980-06-17');
INSERT INTO instructor(id, name, dob) VALUES (888, 'OverStreet, Grover', '1988-11-23');
INSERT INTO instructor(id, name, dob) VALUES (777, 'Kirk, James Tiberius', '1960-06-14');
INSERT INTO instructor(id, name, dob) VALUES (555, 'Paladin, Jeffrey', '1911-12-17');

INSERT INTO course(id, name, department, instructor_id, student_id) VALUES (900, 'Western Civilization', 'History', 999, 102);
INSERT INTO course(id, name, department, instructor_id, student_id) VALUES (901, 'Organic Chemistry', 'Chemistry', 888, 103);
INSERT INTO course(id, name, department, instructor_id, student_id) VALUES (902, 'The History of Star Trek', 'Astrophysics', 777, 102);
INSERT INTO course(id, name, department, instructor_id, student_id) VALUES (904, 'Magic the Gathering - Intro to Basics', 'Magic', 555, 101);
