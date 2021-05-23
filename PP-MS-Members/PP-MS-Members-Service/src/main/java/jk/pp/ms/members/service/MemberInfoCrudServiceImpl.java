package jk.pp.ms.members.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.pp.engg.foundations.common.service.core.AppCrudServiceImpl;
import jk.pp.ms.members.dao.MemberInfoCrudDAO;
import jk.pp.ms.members.domain.MemberInfo;
import jk.pp.ms.members.domain.MemberInfoCrudDTO;

@Service
public class MemberInfoCrudServiceImpl extends AppCrudServiceImpl<MemberInfo, MemberInfoCrudDTO>
		implements MemberInfoCrudService {

	public static final String BEAN_ID = MemberInfoCrudServiceImpl.class.getSimpleName();

	@Autowired
	public MemberInfoCrudServiceImpl(MemberInfoCrudDAO crudDAO) {
		super.setCrudServiceImplRefId(BEAN_ID);
		super.setCrudDAO(crudDAO);
	}
}
