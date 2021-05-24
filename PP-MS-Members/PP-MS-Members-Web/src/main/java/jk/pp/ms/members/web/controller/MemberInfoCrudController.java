package jk.pp.ms.members.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.ms.members.domain.MemberInfo;
import jk.pp.ms.members.domain.MemberInfoCrudDTO;
import jk.pp.ms.members.service.MemberInfoCrudService;

@RestController
@RequestMapping(path = "/api/services/ms/members/memberinfo/crud", produces = "application/json")
public class MemberInfoCrudController extends AppCrudController<MemberInfo, MemberInfoCrudDTO> {

	@Autowired
	public MemberInfoCrudController(MemberInfoCrudService service) {
		super.setCrudService(service);
	}

	@Override
	public List<MemberInfoCrudDTO> populateInitialDataDomais() {

		List<MemberInfoCrudDTO> initialDataDomains = new ArrayList<MemberInfoCrudDTO>();

		MemberInfoCrudDTO crudDTO = null;
		MemberInfo asset = null;

		int length = 25;
		boolean useLetters = true;
		boolean useNumbers = false;
		String generatedString = null;

		for (int ctr = 1; ctr <= 10; ++ctr) {
			crudDTO = new MemberInfoCrudDTO();

			asset = new MemberInfo();

			generatedString = RandomStringUtils.random(length, useLetters, useNumbers);

			asset.setFirstName(generatedString);

			generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
			asset.setLastName(generatedString);

			generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
			asset.setEmail(generatedString);

			generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
			asset.setUserName(generatedString);
			
			crudDTO.setDomain(asset);

			initialDataDomains.add(crudDTO);
		}

		return initialDataDomains;
	}
}
