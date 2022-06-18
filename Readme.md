<html>Install
<hr />
<ul>
<li><h2>JDK</h2>
install jdk 11 or recently version.<br>
</li>
<li><h2>Database</h2>
create database otoiawase;<br>
create table otoiawase.table(otoi TEXT,name TEXT,kaisya TEXT,phone TEXT,mail TEXT,ip TEXT);<br>
create user 'mysql'@'localhost' IDENTIFIED BY 'password';<br>
grant all on *.* to 'mysql'@'localhost';<br>
ALTER USER 'mysql'@'localhost' IDENTIFIED BY 'password';<br>
</li>
</ul>
</html>

	