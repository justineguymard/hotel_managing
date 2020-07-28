package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.dao.IEquipmentDao;
import fr.inti.entities.Equipment;

@Service
@Transactional
public class EquipmentServiceImpl implements IEquipmentService {
	
	@Autowired
	private IEquipmentDao equipmentDao;

	@Override
	public List<Equipment> getAllEquipments() {
		return equipmentDao.findAll();
	}

	@Override
	public Equipment addEquipment(Equipment equipment) {
		return equipmentDao.save(equipment);
	}

	@Override
	public Equipment getEquipmentById(int id) {
		return equipmentDao.getOne(id);
	}

	@Override
	public Equipment updateEquipment(Equipment equipment) {
		return equipmentDao.save(equipment);
	}

	@Override
	public void deleteEquipment(int id) {
		equipmentDao.deleteById(id);
		
	}
	
	

}
