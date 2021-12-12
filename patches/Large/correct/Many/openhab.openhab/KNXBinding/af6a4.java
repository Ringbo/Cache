diff --git a/bundles/binding/org.openhab.binding.knx/src/main/java/org/openhab/binding/knx/internal/bus/KNXBinding.java b/bundles/binding/org.openhab.binding.knx/src/main/java/org/openhab/binding/knx/internal/bus/KNXBinding.java
index 3a2f6cc..94c6c83 100644
--- a/bundles/binding/org.openhab.binding.knx/src/main/java/org/openhab/binding/knx/internal/bus/KNXBinding.java
+++ b/bundles/binding/org.openhab.binding.knx/src/main/java/org/openhab/binding/knx/internal/bus/KNXBinding.java
@@ -68,7 +68,7 @@
 	private boolean mKNXConnectionEstablished;
 
 	public void activate(ComponentContext componentContext) {
-		logger.info("Calimero library version {}", Settings.getLibraryVersion());
+		logger.debug("Calimero library version {}", Settings.getLibraryVersion());
 		logger.trace("KNXBinding: activating");
 		KNXConnection.addConnectionListener(this);
 		mKNXBusReaderScheduler.start();
