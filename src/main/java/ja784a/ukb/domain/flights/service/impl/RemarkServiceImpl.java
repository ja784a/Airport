package ja784a.ukb.domain.flights.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ja784a.ukb.domain.flights.model.Remark;
import ja784a.ukb.domain.flights.service.RemarkService;
import ja784a.ukb.repository.RemarkMapper;

@Service
public class RemarkServiceImpl implements RemarkService {
	@Autowired
	private RemarkMapper mapper;
	
	public List<Remark> getRemarks() {
		return mapper.selectRemarks();
	}
}