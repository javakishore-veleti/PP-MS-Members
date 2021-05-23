package jk.pp.ms.members.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.ms.members.domain.MemberDashboard;
import jk.pp.ms.members.domain.MemberDashboardCrudDTO;
import jk.pp.ms.members.service.MemberDashboardCrudService;

@RestController
@RequestMapping(path = "/api/services/ms/members/memberdashboard/crud", produces = "application/json")
public class MemberDashboardCrudController extends AppCrudController<MemberDashboard, MemberDashboardCrudDTO> {

	@Autowired
	public MemberDashboardCrudController(MemberDashboardCrudService service) {
		super.setCrudService(service);
	}
}
