package hilu.kr.dao.inf.cons;

import hilu.kr.domain.cls.command.CmdDto;

public interface Con001Dao {
	public CmdDto 	iqryBasicCon001(CmdDto iDto);
	public int 		rgstBasicCon001(CmdDto iDto);
	public int		updtBasicCon001(CmdDto iDto);
	public int		delBasicCon001(CmdDto iDto);
}
