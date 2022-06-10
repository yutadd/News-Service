package com.yuta.news;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@Autowired
    Myrepository userService;
	File f=new File("database.csv");
	@RequestMapping({"/","/top"})
	public String top() {
		return "top";
	}
	@RequestMapping(value={"/result"},method=RequestMethod.POST)
	public String resultrest(HttpServletRequest request,@RequestParam("otoi") String o,@RequestParam("name") String n,@RequestParam("kaisya") String k,@RequestParam("phone") String p,@RequestParam("mail") String m) {
		try {
		userService.insertOne(o,n,k,p,m,request.getRemoteAddr());
		}catch(Exception e) {
			try {
				FileWriter fw=new FileWriter(f,true);
				fw.write(o+","+n+","+k+","+p+","+m+","+request.getRemoteAddr()+"\r\n");
				fw.close();
			} catch (IOException e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
			}
		}
		return "result";
	}
	@RequestMapping(value={"/result"},method=RequestMethod.GET)
	public String resultget() {
		return "top";
	}
	@RequestMapping(value={"/otoi"},method=RequestMethod.GET)
	public String otoiget() {
		return "otoi";
	}
	@RequestMapping({"/live"})
	public String live() {
		return "live";
	}
	@RequestMapping({"/travel"})
	public String travel() {
		return "travel";
	}
}
