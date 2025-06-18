package ja784a.ukb.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ja784a.ukb.domain.flights.model.Area;

@Mapper
public interface AreaMapper {
	public List<Area> selectDomAreas();
	
	public List<Area> selectIntAreas();
}