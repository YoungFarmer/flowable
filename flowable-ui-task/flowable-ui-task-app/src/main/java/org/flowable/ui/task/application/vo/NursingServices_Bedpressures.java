package org.flowable.ui.task.application.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @auther liuji
 * @date 2020/6/18 - 21:05
 */
public class NursingServices_Bedpressures implements Serializable {
    private static final long serialVersionUID = -612534234226276240L;


        private DataBeanEntity dataBean;
        private UserBeanEntity userBean;

        public DataBeanEntity getDataBean() {
            return dataBean;
        }

        public void setDataBean(DataBeanEntity dataBean) {
            this.dataBean = dataBean;
        }

        public UserBeanEntity getUserBean() {
            return userBean;
        }

        public void setUserBean(UserBeanEntity userBean) {
            this.userBean = userBean;
        }

        public class DataBeanEntity implements Serializable{
            private int duration;
            private double pres;
            private String time;

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public double getPres() {
                return pres;
            }

            public void setPres(double pres) {
                this.pres = pres;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            @Override
            public String toString() {
                return "DataBeanEntity{" +
                        "duration=" + duration +
                        ", pres=" + pres +
                        ", time='" + time + '\'' +
                        '}';
            }
        }

        public class UserBeanEntity implements Serializable{
            private static final long serialVersionUID = -6734231098459689L;

            private String number;
            private String name;

            public String getNumber() {
                return number;
            }

            public void setNumber(String number) {
                this.number = number;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return "UserBeanEntity{" +
                        "number='" + number + '\'' +
                        ", name='" + name + '\'' +
                        '}';
            }
        }

}
