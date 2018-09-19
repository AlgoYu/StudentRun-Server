package liar.xiaoyu.www.entity;

public class ResponseMessage<V>{
    private Boolean succes = false;
    private String message = "暂无";
    private V data;

    public Boolean getSucces() {
        return succes;
    }

    public void setSucces(Boolean succes) {
        this.succes = succes;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public V getData() {
        return data;
    }

    public void setData(V data) {
        this.data = data;
    }
}
