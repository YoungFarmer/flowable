package org.flowable.ui.task.application.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @author LyuBo
 * @create 2020-05-15 23:39
 */
public class ResultData implements Serializable{

    /**
     * msg : 成功
     * code : 200
     * data : [{"number":"001","address":"北京市石景山区北方工业大学","mobilephone":"15601235299","name":"张三","id":1,"age":"23","email":"1335252@qq.com"},{"number":"002","address":"北京市石景山区北方工业大学","mobilephone":"15601235299","name":"李四","id":2,"age":"21","email":"1335222@qq.com"},{"number":"003","address":"北京市石景山区北方工业大学","mobilephone":"15601235200","name":"王五","id":3,"age":"29","email":"11235222@qq.com"}]
     */
    private static final long serialVersionUID = -5809782578272943999L;
    private String msg;
    private String code;
    private List<DataEntity> data;

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

    public class DataEntity implements Serializable {
        /**
         * number : 001
         * address : 北京市石景山区北方工业大学
         * mobilephone : 15601235299
         * name : 张三
         * id : 1
         * age : 23
         * email : 1335252@qq.com
         */
        private static final long serialVersionUID = -123L;
        private String number;
        private String address;
        private String mobilephone;
        private String name;
        private int id;
        private String age;
        private String email;

        public void setNumber(String number) {
            this.number = number;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setMobilephone(String mobilephone) {
            this.mobilephone = mobilephone;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getNumber() {
            return number;
        }

        public String getAddress() {
            return address;
        }

        public String getMobilephone() {
            return mobilephone;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public String getAge() {
            return age;
        }

        public String getEmail() {
            return email;
        }
    }
}
