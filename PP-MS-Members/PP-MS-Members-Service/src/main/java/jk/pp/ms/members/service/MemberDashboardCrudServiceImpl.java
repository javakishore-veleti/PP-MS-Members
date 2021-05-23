package jk.pp.ms.members.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.pp.engg.foundations.common.service.core.AppCrudServiceImpl;
import jk.pp.ms.members.dao.MemberDashboardCrudDAO;
import jk.pp.ms.members.domain.MemberDashboard;
import jk.pp.ms.members.domain.MemberDashboardCrudDTO;

@Service
public class MemberDashboardCrudServiceImpl extends AppCrudServiceImpl<MemberDashboard, MemberDashboardCrudDTO>
		implements MemberDashboardCrudService {

	public static final String BEAN_ID = MemberDashboardCrudServiceImpl.class.getSimpleName();

	@Autowired
	public MemberDashboardCrudServiceImpl(MemberDashboardCrudDAO crudDAO) {
		super.setCrudServiceImplRefId(BEAN_ID);
		super.setCrudDAO(crudDAO);
	}
}
