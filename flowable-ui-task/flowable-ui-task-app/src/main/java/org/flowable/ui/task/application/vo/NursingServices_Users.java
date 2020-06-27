package org.flowable.ui.task.application.vo;



import java.io.Serializable;
import java.util.List;

/**
 * @auther liuji
 * @date 2020/6/18 - 20:44
 */
public class NursingServices_Users implements Serializable {

    private static final long serialVersionUID = -580978288L;

        private String number;
        private String address;
        private String mobilephone;
        private String name;
        private int id;
        private String age;
        private String email;

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getMobilephone() {
            return mobilephone;
        }

        public void setMobilephone(String mobilephone) {
            this.mobilephone = mobilephone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "DataEntity{" +
                    "number='" + number + '\'' +
                    ", address='" + address + '\'' +
                    ", mobilephone='" + mobilephone + '\'' +
                    ", name='" + name + '\'' +
                    ", id=" + id +
                    ", age='" + age + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }


}
