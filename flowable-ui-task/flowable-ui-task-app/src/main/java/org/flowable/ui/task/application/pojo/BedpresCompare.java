package org.flowable.ui.task.application.pojo;


import javax.persistence.*;

@Entity
@Table(name="bedprescompare")
public class BedpresCompare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer BedpresCompareId;
    @Column(name="username")
    private String UserName;
    @Column(name="usernumber")
    private String UserNumber;
    @Column
    private boolean alarm;
}
