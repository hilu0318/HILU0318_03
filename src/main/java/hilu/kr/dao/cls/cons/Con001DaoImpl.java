package hilu.kr.dao.cls.cons;

import java.util.HashMap;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import hilu.kr.dao.inf.cons.Con001Dao;
import hilu.kr.domain.cls.command.CmdDto;

public class Con001DaoImpl implements Con001Dao {

	@Inject
	private SqlSession session;
	
	private static final String namespace = "con001."; 

	@Override
	public CmdDto iqryBasicCon001(CmdDto iDto) {
		// TODO Auto-generated method stub
		return session.selectOne(getNameSpace("iqryBasicCon001"), iDto.getVal());
	}

	@Override
	public int rgstBasicCon001(CmdDto iDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updtBasicCon001(CmdDto iDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delBasicCon001(CmdDto iDto) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private String getNameSpace(String iTxt) {
		return namespace + iTxt;
	}
}
