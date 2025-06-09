package ja784a.ukb.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ja784a.ukb.domain.flights.model.Remark;

@Mapper
public interface RemarkMapper {
	public List<Remark> selectRemarks();
}