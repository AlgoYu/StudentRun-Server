package liar.xiaoyu.www.entity;


public class User {

  private Integer id;
  private String phone;
  private String username;
  private String sex;
  private String password;
  private String portrait;
  private String school;
  private String address;
  private Integer status;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPortrait() {
    return portrait;
  }

  public void setPortrait(String portrait) {
    this.portrait = portrait;
  }

  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", phone='" + phone + '\'' +
            ", username='" + username + '\'' +
            ", sex='" + sex + '\'' +
            ", password='" + password + '\'' +
            ", portrait='" + portrait + '\'' +
            ", school='" + school + '\'' +
            ", address='" + address + '\'' +
            ", status=" + status +
            '}';
  }
}
