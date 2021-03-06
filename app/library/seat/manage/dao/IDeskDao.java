package library.seat.manage.dao;

import java.util.List;
import library.seat.manage.dto.DeskInfo;
import library.seat.manage.dto.PageInfo;
import library.seat.manage.exception.DataAccessException;
import library.seat.manage.util.FieldValueCriteria;


/**
 * 
 * @author mahs
 * @version 1.0
 * @created 1-1-2013 22:50:00
 */
public interface IDeskDao {
	
	int add(DeskInfo desk) throws DataAccessException;
	
	void update(DeskInfo desk) throws DataAccessException;
	
	void delete(int deskId) throws DataAccessException;
	
	int getCount(List<FieldValueCriteria> criteria) throws DataAccessException;
	
	List<DeskInfo> findByCriteria(List<FieldValueCriteria> criteria) throws DataAccessException;
	
	PageInfo<DeskInfo> findByCriteria(
			List<FieldValueCriteria> criteria, PageInfo pageInfo) throws DataAccessException;
}
