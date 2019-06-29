package ctrl.json;

import java.util.ArrayList;
import java.util.List; 

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Gson2 {
	@Test
	public void test1() {
		Gson gson = new Gson();
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("弟弟","哈哈"));
		list.add(new Student("啊哈","读课"));
		list.add(new Student("问问","哦哦"));
		list.add(new Student("看看","匹配"));
		LL ll = new LL();
		ll.setId("啊哈");
		ll.setList(list);
		String str = gson.toJson(ll);
		System.out.println(str);
	}
	@Test
	public void test2() {
		String json = "{'bh':'001',list:[{'name':'001','age':'99'},{'name':'001','age':'99'},{'name':'001','age':'99'}]}";
		Gson gson = new Gson();
		LL stu = gson.fromJson(json, LL.class);
		System.out.println(stu);
		String json2 = "['123','456','789']";
		ArrayList<String> ss = gson.fromJson(json2, new TypeToken<ArrayList<String>>(){}.getType());
		System.out.println(ss);
	}
}