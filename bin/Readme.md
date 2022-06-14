#please create database and user follow as
	create database otoiawase;<br>
	create table otoiawase.table(otoi TEXT,name TEXT,phone TEXT,mail TEXT,ip TEXT);<br>
	create user 'mysql'@'%' IDENTIFIED BY 'password';<br>
	grant all on *.* to 'mysql'@'localhost';
