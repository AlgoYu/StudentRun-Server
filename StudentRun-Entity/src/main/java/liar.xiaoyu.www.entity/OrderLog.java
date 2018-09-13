package liar.xiaoyu.www.entity;


public class OrderLog {

  private long id;
  private String orderUuid;
  private String commodity;
  private double money;
  private long number;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getOrderUuid() {
    return orderUuid;
  }

  public void setOrderUuid(String orderUuid) {
    this.orderUuid = orderUuid;
  }


  public String getCommodity() {
    return commodity;
  }

  public void setCommodity(String commodity) {
    this.commodity = commodity;
  }


  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }


  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }

}
