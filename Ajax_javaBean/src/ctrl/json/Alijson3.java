package ctrl.json;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

public class Alijson3 {
	@Test
	public void test1() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("弟弟","哈哈"));
		list.add(new Student("啊哈","读课"));
		list.add(new Student("问问","哦哦"));
		list.add(new Student("看看","匹配"));
		LL ll = new LL();
		ll.setId("啊哈");
		ll.setList(list);
		String str = JSON.toJSONString(ll);
		System.out.println(str);
	}
	@Test
	public void test2() {
		String json = "{'id':'啊哈','list':[{'age':'哈哈','name':'弟弟'},{'age':'读课','name':'啊哈'},{'age':'哦哦','name':'问问'},{'age':'匹配','name':'看看'}]}";
		LL l = JSON.parseObject(json,LL.class);
		System.out.println(l);
		String json2 = "['123','456','987']";
		String l2 = JSON.parseObject(json2,String.class);
		System.out.println(l2);
	}
}
