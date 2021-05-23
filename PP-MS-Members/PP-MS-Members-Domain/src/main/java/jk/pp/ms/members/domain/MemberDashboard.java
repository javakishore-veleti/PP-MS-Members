package jk.pp.ms.members.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity(name = "MemberDashboard")
@Table(name = "member_dashboard")
public class MemberDashboard extends MemberBaseDomain {

	private static final long serialVersionUID = 1L;

}