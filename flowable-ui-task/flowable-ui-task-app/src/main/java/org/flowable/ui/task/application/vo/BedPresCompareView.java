package org.flowable.ui.task.application.vo;



import java.io.Serializable;
import java.util.List;

public class BedPresCompareView implements Serializable {

    private static final long serialVersionUID = -5346546343266876455L;

    private String msg;
    private String code;
    private List<DataEntity> data;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<DataEntity> getData() {
        return data;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public class DataEntity implements Serializable {
        private static final long serialVersionUID = -342345344654645L;

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
    }
}
