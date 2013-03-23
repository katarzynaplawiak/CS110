package assignment.chap8;

import java.util.Date;

public class StopWatch {
private long startTime;
private long endTime;
Date date = null;



StopWatch(){
	date = new Date();
	startTime = date.getTime();
}
public long getStartTime(){
	return startTime;
}
public long getEndTime(){
	return endTime;
}
public void start(){
	date= new Date();
	startTime = date.getTime();

}
public void stop(){
	date = new Date();
	endTime = date.getTime();
}
public long getElapsedTime(){
	return endTime - startTime;
}
}

 