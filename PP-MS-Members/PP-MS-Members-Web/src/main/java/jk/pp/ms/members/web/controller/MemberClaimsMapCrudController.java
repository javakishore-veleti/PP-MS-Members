package jk.pp.ms.members.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.ms.members.domain.MemberClaimsMap;
import jk.pp.ms.members.domain.MemberClaimsMapCrudDTO;
import jk.pp.ms.members.service.MemberClaimsMapCrudService;

@RestController
@RequestMapping(path = "/api/services/ms/members/memberclaimsmap/crud", produces = "application/json")
public class MemberClaimsMapCrudController extends AppCrudController<MemberClaimsMap, MemberClaimsMapCrudDTO> {

	@Autowired
	public MemberClaimsMapCrudController(MemberClaimsMapCrudService service) {
		super.setCrudService(service);
	}
}
