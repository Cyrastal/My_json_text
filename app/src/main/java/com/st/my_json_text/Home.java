package com.st.my_json_text;

import java.util.List;

public class Home {

    /**
     * status : 200
     * msg : OK
     * data : [{"name":"叶兴泽","birthday":"2019-11-16 03:47:30 下午","desc":"456","age":18,"icon":"image/get/test.jpg"},{"name":"刘航鑫","birthday":"2019-11-16 03:47:30 下午","desc":"777","age":17,"icon":"image/get/test1.jpg"}]
     * ok : null
     */

    private int status;
    private String msg;
    private Object ok;
    private List<DataBean> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getOk() {
        return ok;
    }

    public void setOk(Object ok) {
        this.ok = ok;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * name : 叶兴泽
         * birthday : 2019-11-16 03:47:30 下午
         * desc : 456
         * age : 18
         * icon : image/get/test.jpg
         */

        private String name;
        private String birthday;
        private String desc;
        private int age;
        private String icon;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }
}
