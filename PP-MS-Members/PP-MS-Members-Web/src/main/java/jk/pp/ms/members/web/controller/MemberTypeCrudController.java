package jk.pp.ms.members.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.ms.members.domain.MemberType;
import jk.pp.ms.members.domain.MemberTypeCrudDTO;
import jk.pp.ms.members.service.MemberTypeCrudService;

@RestController
@RequestMapping(path = "/api/services/ms/members/membertype/crud", produces = "application/json")
public class MemberTypeCrudController extends AppCrudController<MemberType, MemberTypeCrudDTO> {

	@Autowired
	public MemberTypeCrudController(MemberTypeCrudService service) {
		super.setCrudService(service);
	}
}
