package com.packoi.app.service.pg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packoi.app.dao.pg.PgDao;
import com.packoi.app.domain.Fund;

/**
 * @Description: PG库处理逻辑Service
 * @author yuhai.li  
 * @date 2018年1月19日 下午2:35:17
 */
@Service
public class PgService {

	@Autowired
	private PgDao pgDao;
	
	/**
	 * @Description: 测试用，查询前5条数据
	 * @return List<Fund>
	 * @author yuhai.li
	 * @date 2018年1月19日 下午2:29:18
	 */
	public List<Fund> top5Fund(){
		return pgDao.top5List();
	}
	
	/**
	 * @Description: 根据基金代码查询基金
	 * @param fundCode 基金代码
	 * @return Fund
	 * @author yuhai.li
	 * @date 2018年1月19日 下午2:31:05
	 */
	public Fund getFundByCode(String fundCode){
		List<Fund> list = pgDao.getFundByCode(fundCode);
		if(list==null || list.size()==0){
			return null;
		}else {
			return list.get(0);
		}
	}
}
