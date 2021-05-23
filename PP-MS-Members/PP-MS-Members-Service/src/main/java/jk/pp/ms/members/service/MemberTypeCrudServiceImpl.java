package jk.pp.ms.members.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.pp.engg.foundations.common.service.core.AppCrudServiceImpl;
import jk.pp.ms.members.dao.MemberTypeCrudDAO;
import jk.pp.ms.members.domain.MemberType;
import jk.pp.ms.members.domain.MemberTypeCrudDTO;

@Service
public class MemberTypeCrudServiceImpl extends AppCrudServiceImpl<MemberType, MemberTypeCrudDTO>
		implements MemberTypeCrudService {

	public static final String BEAN_ID = MemberTypeCrudServiceImpl.class.getSimpleName();

	@Autowired
	public MemberTypeCrudServiceImpl(MemberTypeCrudDAO crudDAO) {
		super.setCrudServiceImplRefId(BEAN_ID);
		super.setCrudDAO(crudDAO);
	}
}
