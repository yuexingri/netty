package heartbeat.message;

/**
 * Simple to Introduction
 *
 * @ProjectName: netty$
 * @Description: Describes the function of the class
 * @Author: whf
 * @CreateDate: 2018/1/31 下午3:41
 */
public enum MessageType {
    SERVICE_REQ((byte)0),
    SERVICE_RESP((byte)1),
    ONE_WAY((byte)2),
    LOGIN_REQ((byte)3),
    LOGIN_RESP((byte)4),
    HEARTBEAT_REQ((byte)5),
    HEARTBEAT_RESP((byte)6);

    private byte value;

    private MessageType(byte value) {
        this.value = value;
    }

    public byte value() {
        return this.value;
    }
}
