package jk.pp.ms.members.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.ms.members.domain.MemberPayment;
import jk.pp.ms.members.domain.MemberPaymentCrudDTO;
import jk.pp.ms.members.service.MemberPaymentCrudService;

@RestController
@RequestMapping(path = "/api/services/ms/members/MemberPayment/crud", produces = "application/json")
public class MemberPaymentCrudController extends AppCrudController<MemberPayment, MemberPaymentCrudDTO> {

	@Autowired
	public MemberPaymentCrudController(MemberPaymentCrudService service) {
		super.setCrudService(service);
	}
}
