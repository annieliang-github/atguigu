package generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Dao<T> {
	
	private Map<String, T> map = new HashMap<>();
	
	//保存 T 类型的对象到 Map 成员变量中
	public void save(String id, T entity) {
		map.put(id, entity);
	}
	
	//从 map 中获取 id 对应的对象
	public T get(String id) {
		return map.get(id);
	}
	
	//替换 map 中 key 为 id 的内容,改为 entity 对象
	public void update(String id, T entity) {
		if (map.containsKey(id)) {
			map.put(id, entity);
		}
	}
	
	//返回 map 中存放的所有 T 对象
	public List<T> list() {
		List<T> list = new ArrayList<>();
		Collection<T> values = map.values();
		Iterator<T> iterator = list.iterator();
		while(iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list;
	}
	
	//删除指定 id 对象
	public void delete(String id) {
		map.remove(id);
	}
	
	
}
