package node.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import node.entity.RuoloEntity;
import node.model.RuoloDto;
import node.repository.RuoliRepository;
import node.service.RuoloService;

@Service("RuoloService")
public class RuoloServiceImpl implements RuoloService {
	
	@Autowired
    private RuoliRepository ruoliRepository;

	@Override
	public List<RuoloDto> getAllRuoli() {
		List<RuoloEntity> listRuoliEntity = ruoliRepository.findAll();
		return listRuoliEntity.stream()
				.map(entity -> {
					RuoloDto dto = new RuoloDto();
					dto.setRuolo(entity.getRuolo());
					dto.setDescrizioneRuolo(entity.getDescrizioneRuolo());
					return dto;
				})
			    .collect(Collectors.toList());
		
	}
	
	
}
