diff --git a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/config/ZWaveConfiguration.java b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/config/ZWaveConfiguration.java
index a9bd733..a1bffcb 100644
--- a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/config/ZWaveConfiguration.java
+++ b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/config/ZWaveConfiguration.java
@@ -255,10 +255,11 @@
 					record = new OpenHABConfigurationRecord("nodes/" + "node" + node.getNodeId() + "/", node.getNodeId() + ": " + node.getName());
 				}
 				
-				// If we can't find the product, then try and find just the
-				// manufacturer
+				// If we can't find the product, then try and find just the manufacturer
 				if (node.getManufacturer() == Integer.MAX_VALUE) {
-				} else if (database.FindProduct(node.getManufacturer(), node.getDeviceType(), node.getDeviceId()) == false) {
+					// The device isn't know, print nothing!
+				}
+				else if(database.FindProduct(node.getManufacturer(), node.getDeviceType(), node.getDeviceId(), node.getApplicationVersion()) == false) {
 					if (database.FindManufacturer(node.getManufacturer()) == false) {
 						record.value = "Manufacturer:" + node.getManufacturer() + " [ID:"
 								+ Integer.toHexString(node.getDeviceId()) + ",Type:"
@@ -353,7 +354,7 @@
 				records.add(record);
 
 				if(node.getManufacturer() != Integer.MAX_VALUE) {
-					if (database.FindProduct(node.getManufacturer(), node.getDeviceType(), node.getDeviceId()) == true) {
+					if (database.FindProduct(node.getManufacturer(), node.getDeviceType(), node.getDeviceId(), node.getApplicationVersion()) == true) {
 						// Add links to configuration if the node supports the various command classes
 						if(database.doesProductImplementCommandClass(ZWaveCommandClass.CommandClass.CONFIGURATION.getKey()) == true) {
 							record = new OpenHABConfigurationRecord(domain + "parameters/", "Configuration Parameters");
@@ -402,7 +403,7 @@
 						records.add(record);
 					}
 
-					if (database.FindProduct(node.getManufacturer(), node.getDeviceType(), node.getDeviceId()) == true) {
+					if (database.FindProduct(node.getManufacturer(), node.getDeviceType(), node.getDeviceId(), node.getApplicationVersion()) == true) {
 						record = new OpenHABConfigurationRecord(domain, "Product", "Product", true);
 						record.value = database.getProductName();
 						records.add(record);
@@ -621,7 +622,7 @@
 					}
 				}
 			} else if (arg.equals("associations/")) {
-				if (database.FindProduct(node.getManufacturer(), node.getDeviceType(), node.getDeviceId()) != false) {
+				if (database.FindProduct(node.getManufacturer(), node.getDeviceType(), node.getDeviceId(), node.getApplicationVersion()) != false) {
 					List<ZWaveDbAssociationGroup> groupList = database.getProductAssociationGroups();
 
 					if (groupList != null) {
@@ -652,7 +653,7 @@
 					}
 				}
 			} else if (arg.startsWith("associations/association")) {
-				if (database.FindProduct(node.getManufacturer(), node.getDeviceType(), node.getDeviceId()) != false) {
+				if (database.FindProduct(node.getManufacturer(), node.getDeviceType(), node.getDeviceId(), node.getApplicationVersion()) != false) {
 
 					String groupString = arg.substring(24);
 					int nextDelimiter = groupString.indexOf('/');
@@ -1025,7 +1026,7 @@
 					logger.debug("NODE {}: Refresh associations", nodeId);
 
 					ZWaveProductDatabase database = new ZWaveProductDatabase();
-					if (database.FindProduct(node.getManufacturer(), node.getDeviceType(), node.getDeviceId()) == false) {
+					if (database.FindProduct(node.getManufacturer(), node.getDeviceType(), node.getDeviceId(), node.getApplicationVersion()) == false) {
 						logger.error("NODE {}: Error in doAction - no database found", nodeId);
 						return;
 					}
