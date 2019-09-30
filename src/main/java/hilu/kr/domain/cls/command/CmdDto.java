package hilu.kr.domain.cls.command;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import hilu.kr.domain.inf.command.CommandDto;

public class CmdDto implements CommandDto {

	private Map<String, Object> hashMap;
	
	public CmdDto() {
		hashMap = new HashMap<String, Object>();
	}
	
	public CmdDto(HashMap<String, Object> iObj) {
		hashMap = iObj;
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object put(String key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map<? extends String, ? extends Object> m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<String> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Object> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Entry<String, Object>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setString(String iKey, String iVal) {
		// TODO Auto-generated method stub
		hashMap.put(iKey, iVal);
	}

	@Override
	public void setInt(String iKey, int iVal) {
		// TODO Auto-generated method stub
		hashMap.put(iKey, iVal);
	}

	@Override
	public void setLong(String iKey, long iVal) {
		// TODO Auto-generated method stub
		hashMap.put(iKey, iVal);
	}

	@Override
	public void setDouble(String iKey, double iVal) {
		// TODO Auto-generated method stub
		hashMap.put(iKey, iVal);
	}

	@Override
	public void setBigDecimal(String iKey, BigDecimal iVal) {
		// TODO Auto-generated method stub
		hashMap.put(iKey, iVal);
	}

	@Override
	public String getString(String iKey) {
		// TODO Auto-generated method stub
		return (String) hashMap.get(iKey);
	}

	@Override
	public int getInt(String iKey) {
		// TODO Auto-generated method stub
		return (int) hashMap.get(iKey);
	}

	@Override
	public long getLong(String iKey) {
		// TODO Auto-generated method stub
		return (long) hashMap.get(iKey);
	}

	@Override
	public double getDouble(String iKey) {
		// TODO Auto-generated method stub
		return (double) hashMap.get(iKey);
	}

	@Override
	public BigDecimal getBigDecimal(String iKey) {
		// TODO Auto-generated method stub
		return (BigDecimal) hashMap.get(iKey);
	}

	@Override
	public Map<String, Object> getVal() {
		return this.hashMap;
	}

}
