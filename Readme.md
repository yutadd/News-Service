##please create database and user follow as
	create database otoiawase;<br>
	create table otoiawase.table(otoi TEXT,name TEXT,kaisya TEXT,phone TEXT,mail TEXT,ip TEXT);<br>
	create user 'mysql'@'%' IDENTIFIED BY 'password';<br>
	grant all on *.* to 'mysql'@'localhost';
## If you got error from this, try this one.
	ALTER USER 'mysql'@'localhost' IDENTIFIED BY 'password';fix readme.md's DB script.And edit html input tag to be better^^.