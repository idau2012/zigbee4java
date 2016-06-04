package org.bubblecloud.zigbee.network.zcl.protocol.command.color.control;

import org.bubblecloud.zigbee.network.zcl.ZclCommandMessage;
import org.bubblecloud.zigbee.network.zcl.ZclUtil;
import org.bubblecloud.zigbee.network.zcl.ZclCommand;
import org.bubblecloud.zigbee.network.zcl.protocol.ZclCommandType;
import org.bubblecloud.zigbee.network.zcl.protocol.ZclFieldType;
import org.bubblecloud.zigbee.network.packet.ZToolAddress64;

/**
 * Code generated Move to Color Command value object class.
 */
public class MoveToColorCommand extends ZclCommand {
    /**
     * ColorX command message field.
     */
    private Short colorX;
    /**
     * ColorY command message field.
     */
    private Short colorY;
    /**
     * Transition time command message field.
     */
    private Short transitionTime;

    /**
     * Default constructor setting the command type field.
     */
    public MoveToColorCommand() {
        this.setType(ZclCommandType.MOVE_TO_COLOR_COMMAND);
    }

    /**
     * Constructor copying field values from command message.
     * @param message the command message
     */
    public MoveToColorCommand(final ZclCommandMessage message) {
        super(message);
        this.colorX = (Short) message.getFields().get(ZclFieldType.MOVE_TO_COLOR_COMMAND_COLORX);
        this.colorY = (Short) message.getFields().get(ZclFieldType.MOVE_TO_COLOR_COMMAND_COLORY);
        this.transitionTime = (Short) message.getFields().get(ZclFieldType.MOVE_TO_COLOR_COMMAND_TRANSITION_TIME);
    }

    @Override
    public ZclCommandMessage toCommandMessage() {
        final ZclCommandMessage message = super.toCommandMessage();
        message.getFields().put(ZclFieldType.MOVE_TO_COLOR_COMMAND_COLORX,colorX);
        message.getFields().put(ZclFieldType.MOVE_TO_COLOR_COMMAND_COLORY,colorY);
        message.getFields().put(ZclFieldType.MOVE_TO_COLOR_COMMAND_TRANSITION_TIME,transitionTime);
        return message;
    }

    /**
     * Gets ColorX.
     * @return the ColorX
     */
    public Short getColorX() {
        return colorX;
    }

    /**
     * Sets ColorX.
     * @param colorX the ColorX
     */
    public void setColorX(final Short colorX) {
        this.colorX = colorX;
    }

    /**
     * Gets ColorY.
     * @return the ColorY
     */
    public Short getColorY() {
        return colorY;
    }

    /**
     * Sets ColorY.
     * @param colorY the ColorY
     */
    public void setColorY(final Short colorY) {
        this.colorY = colorY;
    }

    /**
     * Gets Transition time.
     * @return the Transition time
     */
    public Short getTransitionTime() {
        return transitionTime;
    }

    /**
     * Sets Transition time.
     * @param transitionTime the Transition time
     */
    public void setTransitionTime(final Short transitionTime) {
        this.transitionTime = transitionTime;
    }

    static {
        ZclUtil.registerCommandTypeClassMapping(ZclCommandType.MOVE_TO_COLOR_COMMAND,MoveToColorCommand.class);
    }
}