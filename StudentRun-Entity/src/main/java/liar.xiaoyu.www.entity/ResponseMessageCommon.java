package liar.xiaoyu.www.entity;

public class ResponseMessageCommon<V> extends AbstractResponseMessage<V>{
    private Integer ErrorCode = 0;
    private String ErrorMessage = "0表示没有错误！";

    public Integer getErrorCode() {
        return ErrorCode;
    }

    public void setErrorCode(Integer errorCode) {
        ErrorCode = errorCode;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        ErrorMessage = errorMessage;
    }
}
