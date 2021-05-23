package jk.pp.ms.members.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import jk.pp.engg.foundations.common.domain.core.BaseDomainUniqueNameDesc;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity(name = "MemberType")
@Table(name = "member_type")
public class MemberType extends BaseDomainUniqueNameDesc {

	private static final long serialVersionUID = 1L;

}