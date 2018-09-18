package liar.xiaoyu.www.entity;

public class ResponseMessage<V>{
    public Boolean SUCCESS = false;
    public String MESSAGE = "暂无";
    public V DATA;

    public Boolean getSUCCESS() {
        return SUCCESS;
    }

    public void setSUCCESS(Boolean SUCCESS) {
        this.SUCCESS = SUCCESS;
    }

    public String getMESSAGE() {
        return MESSAGE;
    }

    public void setMESSAGE(String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    public V getDATA() {
        return DATA;
    }

    public void setDATA(V DATA) {
        this.DATA = DATA;
    }
}
