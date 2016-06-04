package org.bubblecloud.zigbee.network.zcl.protocol.command.rssi.location;

import org.bubblecloud.zigbee.network.zcl.ZclCommandMessage;
import org.bubblecloud.zigbee.network.zcl.ZclUtil;
import org.bubblecloud.zigbee.network.zcl.ZclCommand;
import org.bubblecloud.zigbee.network.zcl.protocol.ZclCommandType;
import org.bubblecloud.zigbee.network.zcl.protocol.ZclFieldType;
import org.bubblecloud.zigbee.network.packet.ZToolAddress64;

/**
 * Code generated RSSI Response Command value object class.
 */
public class RssiResponseCommand extends ZclCommand {
    /**
     * Replying Device command message field.
     */
    private ZToolAddress64 replyingDevice;
    /**
     * Coordinate 1 command message field.
     */
    private Short coordinate1;
    /**
     * Coordinate 2 command message field.
     */
    private Short coordinate2;
    /**
     * Coordinate 3 command message field.
     */
    private Short coordinate3;
    /**
     * RSSI command message field.
     */
    private Byte rssi;
    /**
     * Number RSSI Measurements command message field.
     */
    private Byte numberRssiMeasurements;

    /**
     * Default constructor setting the command type field.
     */
    public RssiResponseCommand() {
        this.setType(ZclCommandType.RSSI_RESPONSE_COMMAND);
    }

    /**
     * Constructor copying field values from command message.
     * @param message the command message
     */
    public RssiResponseCommand(final ZclCommandMessage message) {
        super(message);
        this.replyingDevice = (ZToolAddress64) message.getFields().get(ZclFieldType.RSSI_RESPONSE_COMMAND_REPLYING_DEVICE);
        this.coordinate1 = (Short) message.getFields().get(ZclFieldType.RSSI_RESPONSE_COMMAND_COORDINATE_1);
        this.coordinate2 = (Short) message.getFields().get(ZclFieldType.RSSI_RESPONSE_COMMAND_COORDINATE_2);
        this.coordinate3 = (Short) message.getFields().get(ZclFieldType.RSSI_RESPONSE_COMMAND_COORDINATE_3);
        this.rssi = (Byte) message.getFields().get(ZclFieldType.RSSI_RESPONSE_COMMAND_RSSI);
        this.numberRssiMeasurements = (Byte) message.getFields().get(ZclFieldType.RSSI_RESPONSE_COMMAND_NUMBER_RSSI_MEASUREMENTS);
    }

    @Override
    public ZclCommandMessage toCommandMessage() {
        final ZclCommandMessage message = super.toCommandMessage();
        message.getFields().put(ZclFieldType.RSSI_RESPONSE_COMMAND_REPLYING_DEVICE,replyingDevice);
        message.getFields().put(ZclFieldType.RSSI_RESPONSE_COMMAND_COORDINATE_1,coordinate1);
        message.getFields().put(ZclFieldType.RSSI_RESPONSE_COMMAND_COORDINATE_2,coordinate2);
        message.getFields().put(ZclFieldType.RSSI_RESPONSE_COMMAND_COORDINATE_3,coordinate3);
        message.getFields().put(ZclFieldType.RSSI_RESPONSE_COMMAND_RSSI,rssi);
        message.getFields().put(ZclFieldType.RSSI_RESPONSE_COMMAND_NUMBER_RSSI_MEASUREMENTS,numberRssiMeasurements);
        return message;
    }

    /**
     * Gets Replying Device.
     * @return the Replying Device
     */
    public ZToolAddress64 getReplyingDevice() {
        return replyingDevice;
    }

    /**
     * Sets Replying Device.
     * @param replyingDevice the Replying Device
     */
    public void setReplyingDevice(final ZToolAddress64 replyingDevice) {
        this.replyingDevice = replyingDevice;
    }

    /**
     * Gets Coordinate 1.
     * @return the Coordinate 1
     */
    public Short getCoordinate1() {
        return coordinate1;
    }

    /**
     * Sets Coordinate 1.
     * @param coordinate1 the Coordinate 1
     */
    public void setCoordinate1(final Short coordinate1) {
        this.coordinate1 = coordinate1;
    }

    /**
     * Gets Coordinate 2.
     * @return the Coordinate 2
     */
    public Short getCoordinate2() {
        return coordinate2;
    }

    /**
     * Sets Coordinate 2.
     * @param coordinate2 the Coordinate 2
     */
    public void setCoordinate2(final Short coordinate2) {
        this.coordinate2 = coordinate2;
    }

    /**
     * Gets Coordinate 3.
     * @return the Coordinate 3
     */
    public Short getCoordinate3() {
        return coordinate3;
    }

    /**
     * Sets Coordinate 3.
     * @param coordinate3 the Coordinate 3
     */
    public void setCoordinate3(final Short coordinate3) {
        this.coordinate3 = coordinate3;
    }

    /**
     * Gets RSSI.
     * @return the RSSI
     */
    public Byte getRssi() {
        return rssi;
    }

    /**
     * Sets RSSI.
     * @param rssi the RSSI
     */
    public void setRssi(final Byte rssi) {
        this.rssi = rssi;
    }

    /**
     * Gets Number RSSI Measurements.
     * @return the Number RSSI Measurements
     */
    public Byte getNumberRssiMeasurements() {
        return numberRssiMeasurements;
    }

    /**
     * Sets Number RSSI Measurements.
     * @param numberRssiMeasurements the Number RSSI Measurements
     */
    public void setNumberRssiMeasurements(final Byte numberRssiMeasurements) {
        this.numberRssiMeasurements = numberRssiMeasurements;
    }

    static {
        ZclUtil.registerCommandTypeClassMapping(ZclCommandType.RSSI_RESPONSE_COMMAND,RssiResponseCommand.class);
    }
}