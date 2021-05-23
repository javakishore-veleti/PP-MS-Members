package jk.pp.ms.members.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity(name = "MemberReimbursement")
@Table(name = "member_reimbursement")
public class MemberReimbursement extends MemberBaseDomain {

	private static final long serialVersionUID = 1L;

}
