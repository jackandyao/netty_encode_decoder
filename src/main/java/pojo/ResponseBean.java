package pojo;

import java.io.Serializable;

/**
 * @ 创建人 贾红平
 * @ 创建时间 2018/6/24
 * @ 功能描述 保存响应参数
 */
public class ResponseBean implements Serializable {
    /**
     * 默认序列ID
     */
    private static final long serialVersionUID = 1L;

    private int subReqID;

    private int respCode;

    private String desc;

    /**
     * @return the subReqID
     */
    public final int getSubReqID() {
        return subReqID;
    }

    /**
     * @param subReqID
     *            the subReqID to set
     */
    public final void setSubReqID(int subReqID) {
        this.subReqID = subReqID;
    }

    /**
     * @return the respCode
     */
    public final int getRespCode() {
        return respCode;
    }

    /**
     * @param respCode
     *            the respCode to set
     */
    public final void setRespCode(int respCode) {
        this.respCode = respCode;
    }

    /**
     * @return the desc
     */
    public final String getDesc() {
        return desc;
    }

    /**
     * @param desc
     *            the desc to set
     */
    public final void setDesc(String desc) {
        this.desc = desc;
    }


    @Override
    public String toString() {
        return "ResponseBean [subReqID=" + subReqID + ", respCode=" + respCode
                + ", desc=" + desc + "]";
    }
}
