package org.flowable.ui.task.application.pojo;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="bedpressures")
public class BedPressures {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer BedpressuresId;
    @Column(name="username")
    private String UserName;
    @Column(name="usernumber")
    private String UserNumber;
    @Column(name="time")
    private Date Time;
    @Column(name="pres")
    private double pres;
    @Column(name="duration")
    private Integer Duration;

    public Integer getBedpressuresId() {
        return BedpressuresId;
    }

    public void setBedpressuresId(Integer bedpressuresId) {
        BedpressuresId = bedpressuresId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserNumber() {
        return UserNumber;
    }

    public void setUserNumber(String userNumber) {
        UserNumber = userNumber;
    }

    public Date getTime() {
        return Time;
    }

    public void setTime(Date time) {
        Time = time;
    }

    public double getPres() {
        return pres;
    }

    public void setPres(double pres) {
        this.pres = pres;
    }

    public Integer getDuration() {
        return Duration;
    }

    public void setDuration(Integer duration) {
        Duration = duration;
    }
}
