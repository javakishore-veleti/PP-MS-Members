package jk.pp.ms.members.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.pp.engg.foundations.common.service.core.AppCrudServiceImpl;
import jk.pp.ms.members.dao.MemberAnalyticsCrudDAO;
import jk.pp.ms.members.domain.MemberAnalytics;
import jk.pp.ms.members.domain.MemberAnalyticsCrudDTO;

@Service
public class MemberAnalyticsCrudServiceImpl extends AppCrudServiceImpl<MemberAnalytics, MemberAnalyticsCrudDTO>
		implements MemberAnalyticsCrudService {

	public static final String BEAN_ID = MemberClaimsAnayticsCrudServiceImpl.class.getSimpleName();

	@Autowired
	public MemberAnalyticsCrudServiceImpl(MemberAnalyticsCrudDAO crudDAO) {
		super.setCrudServiceImplRefId(BEAN_ID);
		super.setCrudDAO(crudDAO);
	}
}
