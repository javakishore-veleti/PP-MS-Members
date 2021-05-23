package jk.pp.ms.members.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.ms.members.domain.MemberAnalytics;
import jk.pp.ms.members.domain.MemberAnalyticsCrudDTO;
import jk.pp.ms.members.service.MemberAnalyticsCrudService;

@RestController
@RequestMapping(path = "/api/services/ms/members/memberanalytics/crud", produces = "application/json")
public class MemberAnalyticsCrudController extends AppCrudController<MemberAnalytics, MemberAnalyticsCrudDTO> {

	@Autowired
	public MemberAnalyticsCrudController(MemberAnalyticsCrudService service) {
		super.setCrudService(service);
	}
}
