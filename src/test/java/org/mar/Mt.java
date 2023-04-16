package org.mar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Mt 
{
 public static void main(String[] args) 
 {
   ChromeOptions opts=new ChromeOptions();
   opts.addArguments("-remote-allow-Origins=*");
   WebDriver d=new ChromeDriver(opts);
   d.get("https://www.facebook.com/");
   d.manage().window().maximize();
   WebElement txtusr = d.findElement(By.id("email"));
   txtusr.sendKeys("suresh");
  String curl = d.getCurrentUrl();
  System.out.println(curl);
  String title = d.getTitle();
  System.out.println(title);
  String attr = txtusr.getAttribute("value");
  System.out.println(attr);
  WebElement lb = d.findElement(By.xpath("//button[@name='login']"));
  String ttt = lb.getText();
  System.out.println(ttt);
   }
}
