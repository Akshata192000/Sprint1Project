package com.inbox.sevices;

import java.util.List;

import com.inbox.dto.HospitalDto;
import com.inbox.entities.Hospital;

public interface HospitalService {
	//public Hospital addHospitalAndDoctorRecord(HospitalDto hospitalDto);
	public Hospital addHospitalRecord(HospitalDto hospitalDto);
	public Hospital getHospitalDetailsById(Long hospitalId);
	public List<Hospital> displayAll();
	public String updateHospitalRecord(Long hospitalId, HospitalDto params);
	public String deleteHospitalRecordById(Long hospitalId);
	public String deleteAllHospitalRecords();

}