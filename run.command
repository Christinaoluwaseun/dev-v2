@ECHO	OFF
REM	---------------------------------------------------------------------
REM	the	directory	path	to	java.exe	on	your	machine	may	be	different
REM	from	the	path	I	have	between	the	double	quotes	below	to	this	may
REM	need	to	be	changed	in	order	for	compile	to	work	on	your	machine
REM	IF	JAVA_HOME	is	set	you	do	not	need	to	specify	the	path	just	java
REM	---------------------------------------------------------------------
"C:\Program	Files\Java\jdk1.8\bin\java.exe"	java	-cp	target/theo-v1.jar	com.christinaonasanwo.theo.App
PAUSE

#!/bin/bash
#ref:	https://stackoverflow.com/questions/59895/getting-the-source-directory-of-a-bash-script-from-within
thisDir="$(	cd	"$(	dirname	"${BASH_SOURCE[0]}"	)"	&&	pwd	)"
#	means	the	line	is	a	comment
#	Need	to	put	the	program	into	the	project	folder,	bash	puts	you	in	your	home	directory
#	and	note	target/	infront	of	.jar	as	we	are	in	the	root	folder	of	the	program
#	Uncomment	the	lines	below	if	you	want	to	check	the	directory	you	are	in
#	if	you	to	uncomment	these	then	put	a	#	on	the	clear	command	to	comment	it	out
#	or	you	will	not	see	the	echo's	below.
#	echo	"Current	Dir:"
#	echo	$thisDir
cd	$thisDir
clear
#	logging	level	at	info	default
java	-cp	target/theo-v1.jar	com.christinaonasanwo.theo.App
#	logging	level	at	debug
java	-cp	target/theo-v1.jar	com.christinaonasanwo.theo.App	-v
#	help	text
java	-cp	target/theo-v1.jar	com.christinaonasanwo.theo.App	-help
#	help	text
java	-cp	target/theo-v1.jar	com.christinaonasanwo.theo.App	-version
echo	"Press	ENTER	to	close	window	..."
read	aKey