diff --git a/bundles/binding/org.openhab.binding.swegonventilation/src/main/java/org/openhab/binding/swegonventilation/protocol/SwegonVentilationUDPConnector.java b/bundles/binding/org.openhab.binding.swegonventilation/src/main/java/org/openhab/binding/swegonventilation/protocol/SwegonVentilationUDPConnector.java
index 7493576..6e23814 100644
--- a/bundles/binding/org.openhab.binding.swegonventilation/src/main/java/org/openhab/binding/swegonventilation/protocol/SwegonVentilationUDPConnector.java
+++ b/bundles/binding/org.openhab.binding.swegonventilation/src/main/java/org/openhab/binding/swegonventilation/protocol/SwegonVentilationUDPConnector.java
@@ -74,7 +74,7 @@
 	@Override
 	public void disconnect() throws SwegonVentilationException {
 
-		if (socket == null) {
+		if (socket != null) {
 			socket.close();
 			socket = null;
 		}
