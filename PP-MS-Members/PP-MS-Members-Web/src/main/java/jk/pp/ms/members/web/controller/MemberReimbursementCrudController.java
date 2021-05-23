package jk.pp.ms.members.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.ms.members.domain.MemberReimbursement;
import jk.pp.ms.members.domain.MemberReimbursementCrudDTO;
import jk.pp.ms.members.service.MemberReimbursementCrudService;

@RestController
@RequestMapping(path = "/api/services/ms/members/memberreimbursement/crud", produces = "application/json")
public class MemberReimbursementCrudController
		extends AppCrudController<MemberReimbursement, MemberReimbursementCrudDTO> {

	@Autowired
	public MemberReimbursementCrudController(MemberReimbursementCrudService service) {
		super.setCrudService(service);
	}
}
