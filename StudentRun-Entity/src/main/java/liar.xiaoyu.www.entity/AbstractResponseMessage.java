package liar.xiaoyu.www.entity;

public abstract class AbstractResponseMessage<V> {
    private boolean SUCCESS = false;
    private String MESSAGE;
    private V DATA;

    public boolean isSUCCESS() {
        return SUCCESS;
    }

    public void setSUCCESS(boolean SUCCESS) {
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
