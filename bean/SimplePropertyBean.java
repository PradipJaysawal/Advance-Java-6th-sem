package bean;

import java.io.Serializable;
public class SimplePropertyBean implements Serializable
{
 public SimplePropertyBean()
 {

 }
 private int length;
 private int breadth;
 private int height;
 public int getLength() {
 return length;
 }
 public void setLength(int length) {
 this.length = length;
 }
 public int getBreadth() {
 return breadth;
 }
 public void setBreadth(int breadth) {
 this.breadth = breadth;
 }
 public int getHeight() {
 return height;
 }
 public void setHeight(int height) {
 this.height = height;
 }
}


