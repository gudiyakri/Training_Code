package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

@Value("#{22+11}")	
private int x;
private int y;

@Value("#{T(java.lang.Math).sqrt(25)}")
private double z;
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}

public double getZ() {
	return z;
}
public void setZ(double z) {
	this.z = z;
}
//@Override
//public String toString() {
//	return "Demo [x=" + x + ", y=" + y + "]";
//}
@Override
public String toString() {
	return "Demo [x=" + x + ", y=" + y + ", z=" + z + "]";
}



}
