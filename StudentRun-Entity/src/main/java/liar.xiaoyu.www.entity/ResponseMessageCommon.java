package liar.xiaoyu.www.entity;

public class ResponseMessageCommon<V> extends AbstractResponseMessage<V>{
    private Integer ErrorCode;
    private String ErrorMessage;

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
