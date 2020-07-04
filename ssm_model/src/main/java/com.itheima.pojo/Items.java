package com.itheima.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/*创建一个pojo类*/
public class Items {
    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", pic='" + pic + '\'' +
                ", createtime=" + createtime +
                ", detail='" + detail + '\'' +
                '}';
    }

    private Integer id;
        private String name;
        private Float price;
        private String pic;
        private Date createtime;
        private String detail;

        public Items(String name, Float price, String pic, Date createtime, String detail) {
            this.name = name;
            this.price = price;
            this.pic = pic;
            this.createtime = createtime;
            this.detail = detail;
        }

        public Items() {
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(Float price) {
            this.price = price;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public void setCreatetime(Date createtime) {
            this.createtime = createtime;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Float getPrice() {
            return price;
        }

        public String getPic() {
            return pic;
        }

        public Date getCreatetime() {
            return createtime;
        }

        public String getDetail() {
            return detail;
        }
    }
