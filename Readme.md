## please create database and user follow as
	create database otoiawase;
	create table otoiawase.table(otoi TEXT,name TEXT,kaisya TEXT,phone TEXT,mail TEXT,ip TEXT);<br>
	create user 'mysql'@'%' IDENTIFIED BY 'password';
	grant all on *.* to 'mysql'@'localhost';
## If you got error from this, try this one.
	ALTER USER 'mysql'@'localhost' IDENTIFIED BY 'password';