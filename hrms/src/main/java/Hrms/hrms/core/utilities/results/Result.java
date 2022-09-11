package Hrms.hrms.core.utilities.results;

//import net.bytebuddy.asm.Advice.This;

public class Result {
private boolean success;
private String message;

public Result(boolean success) {
	this.success=success;
}

public Result(boolean success, String message) {
	this(success) ;//tek parametreli olanı çağırır.
	this.message=message;	
}

public boolean isSuccess() {
	return this.success;
}

public String getMessage() {
	return this.message;
}
}
