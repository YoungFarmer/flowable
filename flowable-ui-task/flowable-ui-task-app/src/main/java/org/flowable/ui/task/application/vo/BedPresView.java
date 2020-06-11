package org.flowable.ui.task.application.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @author LyuBo
 * @create 2020-05-16 14:46
 */
public class BedPresView implements Serializable {

    private static final long serialVersionUID = -6125262768016982240L;

    /**
     * msg : 成功
     * code : 200
     * data : [{"dataBean":{"duration":70,"pres":41.1,"time":"2020-05-16T06:45:21.030+0000"},"userBean":{"number":"001","name":"张三"}},{"dataBean":{"duration":30,"pres":31.1,"time":"2020-05-16T06:45:21.051+0000"},"userBean":{"number":"002","name":"李四"}}]
     */
    private String msg;
    private String code;
    private List<DataEntity> data;
    private int size;

    public int getSize() {
        return 0;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public String getCode() {
        return code;
    }

    public List<DataEntity> getData() {
        return data;
    }

    public class DataEntity implements Serializable{
        /**
         * dataBean : {"duration":70,"pres":41.1,"time":"2020-05-16T06:45:21.030+0000"}
         * userBean : {"number":"001","name":"张三"}
         */
        private static final long serialVersionUID = -5809799L;

        private DataBeanEntity dataBean;
        private UserBeanEntity userBean;

        @Override
        public String toString() {
            return "DataEntity{" +
                    "dataBean=" + dataBean +
                    ", userBean=" + userBean +
                    '}';
        }

        public void setDataBean(DataBeanEntity dataBean) {
            this.dataBean = dataBean;
        }

        public void setUserBean(UserBeanEntity userBean) {
            this.userBean = userBean;
        }

        public DataBeanEntity getDataBean() {
            return dataBean;
        }

        public UserBeanEntity getUserBean() {
            return userBean;
        }

        public class DataBeanEntity implements Serializable{
            /**
             * duration : 70
             * pres : 41.1
             * time : 2020-05-16T06:45:21.030+0000
             */
            private int duration;
            private double pres;
            private String time;

            @Override
            public String toString() {
                return "DataBeanEntity{" +
                        "duration=" + duration +
                        ", pres=" + pres +
                        ", time='" + time + '\'' +
                        '}';
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public void setPres(double pres) {
                this.pres = pres;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public int getDuration() {
                return duration;
            }

            public double getPres() {
                return pres;
            }

            public String getTime() {
                return time;
            }
        }

        public class UserBeanEntity implements Serializable{
            /**
             * number : 001
             * name : 张三
             */
            private static final long serialVersionUID = -678453424546546L;

            private String number;
            private String name;

            @Override
            public String toString() {
                return "UserBeanEntity{" +
                        "number='" + number + '\'' +
                        ", name='" + name + '\'' +
                        '}';
            }

            public void setNumber(String number) {
                this.number = number;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getNumber() {
                return number;
            }

            public String getName() {
                return name;
            }
        }
    }
}
