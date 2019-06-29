package ctrl.json;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Json1 {
	//生成json数据
	@Test
	public void test_1() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("a1","aaa"));
		list.add(new Student("a2","bbb"));
		list.add(new Student("a3","ccc"));
		list.add(new Student("a4","ddd"));
		JSONObject jsonObject = new JSONObject();
		Student  stu = new Student("a1", "aaa");
		jsonObject.put("Student",stu);
		jsonObject.put("list", list);
		//生成json数据
		String str1 = jsonObject.toString();
		System.out.println(str1);
		System.out.println("--------------------");
	}
	//解析json
	@Test
	public void test_2() {
		String json = "{'id':'王二','adsa':'llll','stu':[{'name':'啊啊啊','age':'的撒旦'},{'name':'请问','age':'热'},{'name':'ssss','age':'idasuh'},{'name':'asd','age':'asdad'}]}";
		JSONObject jsonObject = JSONObject.fromObject(json);
		String id = jsonObject.getString("id");
		String name = jsonObject.getString ("adsa");
//		JSONObject jb2 = jsonObject.getJSONObject("stu");
		JSONArray array = jsonObject.getJSONArray("stu");
		for (int i = 0; i < array.size(); i++) {
			JSONObject obj2 = array.getJSONObject(i);
			Student stu = new Student(obj2.getString("name"),obj2.getString("age"));
		System.out.println("姓名："+stu.getName()+"年龄："+stu.getAge());
		}
		System.out.println("id:"+id+"姓名："+name);
		
		String json1 = "{id:[123,456,789]}";
		JSONObject ob3 = JSONObject.fromObject(json1);
		JSONArray array2 =ob3.getJSONArray("id");
		for (int i = 0; i < array2.size(); i++) {
			System.out.println(array2.getString(i));
		}		
	}
	
}
