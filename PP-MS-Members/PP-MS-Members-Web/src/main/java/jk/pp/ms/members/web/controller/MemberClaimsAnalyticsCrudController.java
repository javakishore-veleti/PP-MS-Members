package jk.pp.ms.members.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.ms.members.domain.MemberClaimsAnalytics;
import jk.pp.ms.members.domain.MemberClaimsAnalyticsCrudDTO;
import jk.pp.ms.members.service.MemberClaimsAnalyticsCrudService;

@RestController
@RequestMapping(path = "/api/services/ms/members/memberclaimsanalytics/crud", produces = "application/json")
public class MemberClaimsAnalyticsCrudController
		extends AppCrudController<MemberClaimsAnalytics, MemberClaimsAnalyticsCrudDTO> {

	@Autowired
	public MemberClaimsAnalyticsCrudController(MemberClaimsAnalyticsCrudService service) {
		super.setCrudService(service);
	}
}
