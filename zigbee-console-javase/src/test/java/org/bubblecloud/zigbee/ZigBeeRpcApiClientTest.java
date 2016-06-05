package org.bubblecloud.zigbee;

import org.bubblecloud.zigbee.network.zcl.ZclCommand;
import org.bubblecloud.zigbee.network.zcl.ZclCommandListener;
import org.bubblecloud.zigbee.simple.SimpleZigBeeApi;
import org.bubblecloud.zigbee.simple.ZigBeeDevice;
import org.junit.Ignore;
import org.junit.Test;

/**
 * ZigBeeConsoleApiClient integration test.
 *
 * @author Tommi S.E. Laukkanen
 */
public class ZigBeeRpcApiClientTest {

    @Test
    @Ignore
    public void testCommands() throws Exception {
        final ZigBeeClient zigBeeClient = new ZigBeeClient("http://127.0.0.1:5000/", "secret");

        zigBeeClient.startup();

        zigBeeClient.addCommandListener(new ZclCommandListener() {
            @Override
            public void commandReceived(final ZclCommand command) {
                System.out.println(command);
            }
        });

        final SimpleZigBeeApi api = zigBeeClient.getSimpleZigBeeApi();

        final ZigBeeDevice device = api.getZigBeeDevices().get(0);

        api.on(device);

        Thread.sleep(1000);

        api.color(device, 1.0, 0.0, 0.0, 1.0);

        Thread.sleep(1000);

        api.color(device, 0.0, 1.0, 0.0, 1.0);

        Thread.sleep(1000);

        api.color(device, 0.0, 0.0, 1.0, 1.0);

        Thread.sleep(1000);

        api.off(device);

        /*final ReadAttributesCommand readAttributesCommand = new ReadAttributesCommand();
        readAttributesCommand.setDestinationAddress(11022);
        readAttributesCommand.setDestinationEndpoint(11);
        readAttributesCommand.setClusterId(0);
        readAttributesCommand.setIdentifiers(new ArrayList<AttributeIdentifier>(Arrays.asList(new AttributeIdentifier())));
        zigBeeClient.sendCommand(readAttributesCommand);*/

        /*final DiscoverAttributesCommand discoverAttributesCommand = new DiscoverAttributesCommand();
        discoverAttributesCommand.setClusterId(1);
        discoverAttributesCommand.setDestinationAddress(8951);
        discoverAttributesCommand.setDestinationEndpoint(1);
        discoverAttributesCommand.setStartAttributeIdentifier(0);
        discoverAttributesCommand.setMaximumAttributeIdentifiers(1);
        zigBeeClient.sendCommand(discoverAttributesCommand);*/

        /*final OffCommand offCommand = new OffCommand();
        offCommand.setDestinationAddress(11022);
        offCommand.setDestinationEndpoint(11);
        zigBeeClient.sendCommand(offCommand);*/

        /**final IdentifyCommand identifyCommand = new IdentifyCommand();
        identifyCommand.setDestinationAddress(11022);
        identifyCommand.setDestinationEndpoint(11);
        identifyCommand.setIdentifyTime(10);
        zigBeeClient.sendCommand(identifyCommand);*/

        /*final OnCommand onCommand = new OnCommand();
        onCommand.setDestinationAddress(11022);
        onCommand.setDestinationEndpoint(11);
        zigBeeClient.sendCommand(onCommand);*/

        zigBeeClient.shutdown();
    }

}