
function display(){
	var hd = document.getElementById('hellodiv');
	hd.innerHTML = 'Clicked...';
}

function greeting(){
	myfn(7,3);	
	myfn('7','3');
}

var myfn = function sum(n1,n2){
	alert(n1+n2)
}

function test1(){
 var1=1;
}

test1();

function test2(){
	alert(var1);
}

test2();
