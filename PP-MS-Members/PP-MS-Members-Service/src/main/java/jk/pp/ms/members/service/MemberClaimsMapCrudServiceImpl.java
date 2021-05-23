package jk.pp.ms.members.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.pp.engg.foundations.common.service.core.AppCrudServiceImpl;
import jk.pp.ms.members.dao.MemberClaimsMapCrudDAO;
import jk.pp.ms.members.domain.MemberClaimsMap;
import jk.pp.ms.members.domain.MemberClaimsMapCrudDTO;

@Service
public class MemberClaimsMapCrudServiceImpl extends AppCrudServiceImpl<MemberClaimsMap, MemberClaimsMapCrudDTO>
		implements MemberClaimsMapCrudService {

	public static final String BEAN_ID = MemberClaimsMapCrudServiceImpl.class.getSimpleName();

	@Autowired
	public MemberClaimsMapCrudServiceImpl(MemberClaimsMapCrudDAO crudDAO) {
		super.setCrudServiceImplRefId(BEAN_ID);
		super.setCrudDAO(crudDAO);
	}
}
