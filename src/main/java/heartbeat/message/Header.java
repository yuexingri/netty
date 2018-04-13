package heartbeat.message;

import org.msgpack.annotation.Message;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Simple to Introduction
 *
 * @ProjectName: netty$
 * @Description: Describes the function of the class
 * @Author: whf
 * @CreateDate: 2018/1/31 上午10:24
 */
@Message
public class Header implements Serializable {
    private int crcCode = 0xabef0101;//标明是netty协议
    private int length;//消息长度
    private long sessionID;//回话id
    private byte type;//消息类型
    private byte priority;//消息优先级
    private Map<String, Object> attachement = new HashMap<String, Object>();//附件

    public int getCrcCode() {
        return crcCode;
    }

    public void setCrcCode(int crcCode) {
        this.crcCode = crcCode;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public long getSessionID() {
        return sessionID;
    }

    public void setSessionID(long sessionID) {
        this.sessionID = sessionID;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public byte getPriority() {
        return priority;
    }

    public void setPriority(byte priority) {
        this.priority = priority;
    }

    public Map<String, Object> getAttachement() {
        return attachement;
    }

    public void setAttachement(Map<String, Object> attachement) {
        this.attachement = attachement;
    }

    @Override
    public String toString() {
        return "Header{" +
                "crcCode=" + crcCode +
                ", length=" + length +
                ", sessionID=" + sessionID +
                ", type=" + type +
                ", priority=" + priority +
                ", attachement=" + attachement +
                '}';
    }
}
