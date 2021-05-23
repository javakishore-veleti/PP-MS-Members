package jk.pp.ms.members.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.pp.engg.foundations.common.service.core.AppCrudServiceImpl;
import jk.pp.ms.members.dao.MemberReimbursementCrudDAO;
import jk.pp.ms.members.domain.MemberReimbursement;
import jk.pp.ms.members.domain.MemberReimbursementCrudDTO;

@Service
public class MemberReimbursementCrudServiceImpl extends AppCrudServiceImpl<MemberReimbursement, MemberReimbursementCrudDTO>
		implements MemberReimbursementCrudService {

	public static final String BEAN_ID = MemberReimbursementCrudServiceImpl.class.getSimpleName();

	@Autowired
	public MemberReimbursementCrudServiceImpl(MemberReimbursementCrudDAO crudDAO) {
		super.setCrudServiceImplRefId(BEAN_ID);
		super.setCrudDAO(crudDAO);
	}
}
