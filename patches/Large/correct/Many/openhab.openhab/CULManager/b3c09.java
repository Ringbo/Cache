diff --git a/bundles/io/org.openhab.io.transport.cul/src/main/java/de/akuz/cul/CULManager.java b/bundles/io/org.openhab.io.transport.cul/src/main/java/de/akuz/cul/CULManager.java
index e723e5f..b9fb350 100644
--- a/bundles/io/org.openhab.io.transport.cul/src/main/java/de/akuz/cul/CULManager.java
+++ b/bundles/io/org.openhab.io.transport.cul/src/main/java/de/akuz/cul/CULManager.java
@@ -106,7 +106,7 @@
 	private static CULHandler createNewHandler(String deviceName, CULMode mode) throws CULDeviceException {
 		String deviceType = getPrefix(deviceName);
 		String deviceAddress = getRawDeviceName(deviceName);
-		logger.debug("Searching class for device type " + deviceAddress);
+		logger.debug("Searching class for device type " + deviceType);
 		Class<? extends CULHandler> culHandlerclass = deviceTypeClasses.get(deviceType);
 		if (culHandlerclass == null) {
 			throw new CULDeviceException("No class for the device type " + deviceType + " is registred");
