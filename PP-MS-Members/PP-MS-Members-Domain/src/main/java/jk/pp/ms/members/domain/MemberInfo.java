package jk.pp.ms.members.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import jk.pp.engg.foundations.common.domain.core.BaseDomain;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity(name = "MemberInfo")
@Table(name = "member_info")
public class MemberInfo extends BaseDomain {

	private static final long serialVersionUID = 1L;

}
