package ctrl.json;

import java.util.ArrayList;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

import net.sf.json.JSONObject;

public class Work1 {
	@Test
	public void work1_1() {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("110");
		a1.add("120");
		a1.add("119");
		ArrayList<String> a2 = new ArrayList<String>();
		a1.add("1010");
		a1.add("0101");
		a1.add("1100");
		DHB dh = new DHB("张三", "110","三",a1 , a2);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("dhb",dh);
		//生成json数据
		String str1 = jsonObject.toString();
		System.out.println(str1);
	}
	@Test
	public void work2_1() {
		String json = "{'name':'张三','phone':['110','120'],'qq':['1010','0101'],'wx':'110','bz':'三'}";
		DHB d = JSON.parseObject(json,DHB.class);
		System.out.println(d);
	}
}
