package struts2_04scope;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.yztc.demo.entity.Dept;
import com.yztc.demo.entity.Emp;

import ognl.Ognl;
import ognl.OgnlException;


public class TestOGNL {
	
	@Test
	public void test01() throws OgnlException{
		
		Emp emp = new Emp();
		emp.setId(1001);
		emp.setName("张三");
		emp.setSal(6000);
		
		Dept dept = new Dept();
		dept.setId(10);
		dept.setName("财务部");
		
		emp.setDept(dept);
		
		
		
		String name = (String) Ognl.getValue("name", emp);
		System.out.println(name);		
		String dname = (String) Ognl.getValue("dept.name", emp);
		System.out.println(dname);
		
		double newSal = (double) Ognl.getValue("sal+2000", emp);
		System.out.println(newSal);
		
		System.out.println(Ognl.getValue("@@round(3.4)", emp));
		
		Map<String,Object> context = new HashMap<String,Object>();
		context.put("request", "requestValue");
		context.put("session", "sessionValue");
		context.put("servletContext", "servletContextValue");
		
		String request = (String) Ognl.getValue("#request", context,new Object());
		System.out.println(request);
		Ognl.setValue("name", emp, "otherName");
		
	}
}
