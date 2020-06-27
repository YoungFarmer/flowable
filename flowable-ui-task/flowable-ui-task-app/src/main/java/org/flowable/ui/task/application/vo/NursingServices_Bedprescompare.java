package org.flowable.ui.task.application.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @auther liuji
 * @date 2020/6/18 - 21:11
 */
public class NursingServices_Bedprescompare implements Serializable {
    private static final long serialVersionUID = -48391378782955L;

        private String name;
        private String number;
        private boolean alarm;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public boolean isAlarm() {
            return alarm;
        }

        public void setAlarm(boolean alarm) {
            this.alarm = alarm;
        }

        @Override
        public String toString() {
            return "DataEntity{" +
                    "name='" + name + '\'' +
                    ", number='" + number + '\'' +
                    ", alarm=" + alarm +
                    '}';
        }

}
