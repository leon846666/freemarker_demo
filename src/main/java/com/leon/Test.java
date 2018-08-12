package com.leon;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

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
		
		// 6  create writer stream 
		Writer out = new FileWriter("d:\\test.html");
		
		// 7 output
		template.process(map, out);
		
		// 8 close
		out.close();
	}
}
