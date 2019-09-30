package hilu.kr.domain.inf.command;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public interface CommandDto extends Map<String, Object> {
	public void setString(String iKey, String iVal);
	public void setInt(String iKey, int iVal);
	public void setLong(String iKey, long iVal);
	public void setDouble(String iKey, double iVal);
	public void setBigDecimal(String iKey, BigDecimal iVal);
	
	public String		getString(String iKey);
	public int			getInt(String iKey);
	public long			getLong(String iKey);
	public double		getDouble(String iKey);
	public BigDecimal	getBigDecimal(String iKey);
	
	public Map<String, Object> getVal();
}
