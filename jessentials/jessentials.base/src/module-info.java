module jessentials.base {
	requires java.base;
	requires jessentials.test;
	
	exports ru.kpss.jessentials.tuples;
	exports ru.kpss.jessentials.util;
}