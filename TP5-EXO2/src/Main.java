


A {
	f(double)
}

B {
	f(double)
}

C {
	f(double)
	f(long)
}

D {
	f(double)
	f(long)
	f(int)
}

E {
	f(double)
}

F {
	f(double)
	f(long)
	f(float)
	f(int)
}


OUTPUTS:
	
	A : 1.0 (byte to double) , 5.0 (float to double)
	B : 1.0 (byte to double) , 5.0 (float to double)
	C : 1   (byte to long)   , 4   (long to long) , 5.0 (float to double)
	D : 1   (byte to int)    , 4   (long to long) , 6.0 (double to double)
	E : 1.0 (byte to double) , 4.0 (long to double), 6.0 (double to double)
	F : 1   (byte to int), 3  (int to int) , 5.f (float to float), 6.0 (double to double), 2 (short to int)
	
	
	
	
	
	
	