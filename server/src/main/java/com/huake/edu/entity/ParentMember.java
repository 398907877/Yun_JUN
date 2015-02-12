package com.huake.edu.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "edu_members_parents")
@DiscriminatorValue("parent")
public class ParentMember extends Member {

}
