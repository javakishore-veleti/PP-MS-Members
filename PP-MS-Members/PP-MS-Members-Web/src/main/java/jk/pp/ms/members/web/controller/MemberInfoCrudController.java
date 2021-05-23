package jk.pp.ms.members.web.controller;

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
}
