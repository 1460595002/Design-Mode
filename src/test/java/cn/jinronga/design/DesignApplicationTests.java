package cn.jinronga.design;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@SpringBootTest
class DesignApplicationTests {

	@Test
	void contextLoads() {
		Map<String, Integer> sortMap = new HashMap<>();
		sortMap.put("phe-12f-b1",23);
		sortMap.put("phe-12f-b3",22);
		sortMap.put("phe-12f-b4",47);
		sortMap.put("phe-12f-b2",427);
		sortMap.put("pht-2f-b12",457);
		sortMap.put("pht-2f-b1",422);
		sortMap.put("pht-2f-b7",421);
		sortMap.put("pht-2f-b6",363);
		sortMap.put("phw-12f-b3",4545);
		sortMap.put("phw-12f-b4",34545);
		sortMap.put("phw-12f-b2",3254);
		sortMap.put("sh-1f-b2",454);
		sortMap.put("sh-az2-b1",572);
		sortMap.put("sh-az2-b6",5262);
		sortMap.put("sh-az2-b5",862);
		sortMap.put("sh-az2-b4",5265);
		sortMap.put("sh-az2-b3",5612);
		sortMap.put("sh-az2-b2",8621);
		sortMap.put("sh-az1-b1",2753);
		sortMap.put("sh-1f-b1",8622);
		sortMap.put("sk-4f-b8",6514);
		sortMap.put("sk-4f-b9",26785);
		sortMap.put("sk-4f-b10",2674);
		sortMap.put("sk-4f-b7",2728);
		sortMap.put("sk-4f-b15",2746);
		sortMap.put("sk-4f-b12",27721);
		sortMap.put("sk-3f-b1",2751);
		sortMap.put("sk-3f-b2",6165);
		sortMap.put("sk-4f-b4",2675);
		sortMap.put("sk-4f-b5",2625);
		sortMap.put("sk-4f-b6",5616);
	}
//
//	private List<String> strTest(String target){
//		LinkedList<String> strings = new LinkedList<>();
//		String[] split = target.split(",");
//		for (int i = 0; i < split.length; i++) {
//			strings.add(split)
//		}
//		return "" ;
//	}
}
