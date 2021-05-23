package jk.pp.ms.members.domain;

import javax.persistence.MappedSuperclass;

import jk.pp.engg.foundations.common.domain.core.BaseDomain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class MemberBaseDomain extends BaseDomain {

	private static final long serialVersionUID = 1L;

	private Long memberPK;
}
