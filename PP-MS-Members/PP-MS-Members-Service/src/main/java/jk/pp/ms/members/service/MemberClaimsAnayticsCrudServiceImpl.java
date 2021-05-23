package jk.pp.ms.members.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.pp.engg.foundations.common.service.core.AppCrudServiceImpl;
import jk.pp.ms.members.dao.MemberClaimsAnalyticsCrudDAO;
import jk.pp.ms.members.domain.MemberClaimsAnalytics;
import jk.pp.ms.members.domain.MemberClaimsAnalyticsCrudDTO;

@Service
public class MemberClaimsAnayticsCrudServiceImpl extends AppCrudServiceImpl<MemberClaimsAnalytics, MemberClaimsAnalyticsCrudDTO>
		implements MemberClaimsAnalyticsCrudService {

	public static final String BEAN_ID = MemberClaimsAnayticsCrudServiceImpl.class.getSimpleName();

	@Autowired
	public MemberClaimsAnayticsCrudServiceImpl(MemberClaimsAnalyticsCrudDAO crudDAO) {
		super.setCrudServiceImplRefId(BEAN_ID);
		super.setCrudDAO(crudDAO);
	}
}
