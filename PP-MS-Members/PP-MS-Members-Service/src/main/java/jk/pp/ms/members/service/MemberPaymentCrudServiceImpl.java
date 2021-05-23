package jk.pp.ms.members.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.pp.engg.foundations.common.service.core.AppCrudServiceImpl;
import jk.pp.ms.members.dao.MemberPaymentCrudDAO;
import jk.pp.ms.members.domain.MemberPayment;
import jk.pp.ms.members.domain.MemberPaymentCrudDTO;

@Service
public class MemberPaymentCrudServiceImpl extends AppCrudServiceImpl<MemberPayment, MemberPaymentCrudDTO>
		implements MemberPaymentCrudService {

	public static final String BEAN_ID = MemberPaymentCrudServiceImpl.class.getSimpleName();

	@Autowired
	public MemberPaymentCrudServiceImpl(MemberPaymentCrudDAO crudDAO) {
		super.setCrudServiceImplRefId(BEAN_ID);
		super.setCrudDAO(crudDAO);
	}
}
