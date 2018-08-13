package com.leon;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.core.Macro;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class Test {

	public static void main(String[] args) throws IOException, TemplateException {
		// 1. create configuration object
		Configuration configuration = new Configuration(Configuration.getVersion());
		
		// 2 set the directory of the template
		configuration.setDirectoryForTemplateLoading(new File("C:\\Users\\Leon\\youpinhui\\freemarker_demo\\src\\main\\resources"));
		
		// 3  char set 
		configuration.setDefaultEncoding("utf-8");
		
		// 4 get template object
		Template template = configuration.getTemplate("test.ftl");
		
		// 5 data model
		Map map = new HashMap();
		map.put("name", "John");
		map.put("msg", "nice to meet you");
		map.put("success", false);
		
		
		List goodsList=new ArrayList();
		
		Map goods1=new HashMap();
		goods1.put("name", "apple");
		goods1.put("price", 5.8);
		
		Map goods2=new HashMap();
		goods2.put("name", "banana");
		goods2.put("price", 2.5);
		
		Map goods3=new HashMap();
		goods3.put("name", "orange");
		goods3.put("price", 3.2);
		
		goodsList.add(goods1);
		goodsList.add(goods2);
		goodsList.add(goods3);
		map.put("goodsList", goodsList);
		
		map.put("today", new Date());
		map.put("point", 123321123);
		
		// 6  create writer stream 
		Writer out = new FileWriter("d:\\test.html");
		
		// 7 output
		template.process(map, out);
		
		// 8 close
		out.close();
	}
}
