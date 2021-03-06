/*
   Copyright 2008-2013 CNR-ISTI, http://isti.cnr.it
   Institute of Information Science and Technologies 
   of the Italian National Research Council 


   See the NOTICE file distributed with this work for additional 
   information regarding copyright ownership

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package org.bubblecloud.zigbee.api.cluster.impl;

import org.bubblecloud.zigbee.network.ZigBeeEndpoint;
import org.bubblecloud.zigbee.api.cluster.general.OnOffSwitchConfiguration;
import org.bubblecloud.zigbee.api.cluster.impl.api.core.Attribute;
import org.bubblecloud.zigbee.api.cluster.impl.api.core.Reporter;
import org.bubblecloud.zigbee.api.cluster.impl.general.OnOffSwitchConfigurationCluster;

/**
 * @author <a href="mailto:stefano.lenzi@isti.cnr.it">Stefano "Kismet" Lenzi</a>
 * @author <a href="mailto:francesco.furfari@isti.cnr.it">Francesco Furfari</a>
 * @author <a href="mailto:alessandro.giari@isti.cnr.it">Alessandro Giari</a>
 * @version $LastChangedRevision: 799 $ ($LastChangedDate: 2013-08-06 19:00:05 +0300 (Tue, 06 Aug 2013) $)
 * @since 0.1.0
 */
public class OnOffSwitchConfigurationImpl implements OnOffSwitchConfiguration {

    private OnOffSwitchConfigurationCluster onOffSwitchConfiguratioCluster;
    private Attribute switchType;
    private Attribute switchActions;

    public OnOffSwitchConfigurationImpl(ZigBeeEndpoint zbDevice) {
        onOffSwitchConfiguratioCluster = new OnOffSwitchConfigurationCluster(zbDevice);
        switchType = onOffSwitchConfiguratioCluster.getAttributeSwitchType();
        switchActions = onOffSwitchConfiguratioCluster.getAttributeSwitchActions();

    }

    public Attribute getSwitchActions() {
        return switchActions;
    }

    public Attribute getSwitchType() {
        return switchType;
    }

    public Reporter[] getAttributeReporters() {
        return onOffSwitchConfiguratioCluster.getAttributeReporters();
    }

    public int getId() {
        return onOffSwitchConfiguratioCluster.getId();
    }

    public String getName() {
        return onOffSwitchConfiguratioCluster.getName();
    }

    public Attribute getAttribute(int id) {
        Attribute[] attributes = onOffSwitchConfiguratioCluster.getAvailableAttributes();
        for (int i = 0; i < attributes.length; i++) {
            if (attributes[i].getId() == id)
                return attributes[i];
        }
        return null;
    }

    public Attribute[] getAttributes() {
        return onOffSwitchConfiguratioCluster.getAvailableAttributes();
    }

}
