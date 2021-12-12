diff --git a/addons/binding/org.openhab.binding.dscalarm/src/main/java/org/openhab/binding/dscalarm/internal/discovery/IT100BridgeDiscovery.java b/addons/binding/org.openhab.binding.dscalarm/src/main/java/org/openhab/binding/dscalarm/internal/discovery/IT100BridgeDiscovery.java
index f794eb9..fc6331c 100644
--- a/addons/binding/org.openhab.binding.dscalarm/src/main/java/org/openhab/binding/dscalarm/internal/discovery/IT100BridgeDiscovery.java
+++ b/addons/binding/org.openhab.binding.dscalarm/src/main/java/org/openhab/binding/dscalarm/internal/discovery/IT100BridgeDiscovery.java
@@ -98,15 +98,15 @@
 
                 } catch (UnsupportedCommOperationException e) {
                     logger.debug("discoverBridge(): Unsupported Comm Operation Exception - '{}': {}",
-                            portIdentifier.getName(), e.toString());
+                            portIdentifier.getName(), e.getMessage());
                 } catch (PortInUseException e) {
                     logger.debug("discoverBridge(): Port in Use Exception - '{}': {}", portIdentifier.getName(),
-                            e.toString());
+                            e.getMessage());
                 } catch (UnsupportedEncodingException e) {
                     logger.debug("discoverBridge(): Unsupported Encoding Exception - '{}': {}",
-                            portIdentifier.getName(), e.toString());
+                            portIdentifier.getName(), e.getMessage());
                 } catch (IOException e) {
-                    logger.debug("discoverBridge(): IO Exception - '{}': ", portIdentifier.getName(), e.toString());
+                    logger.debug("discoverBridge(): IO Exception - '{}': {}", portIdentifier.getName(), e.getMessage());
                 } finally {
                     if (serialInput != null) {
                         IOUtils.closeQuietly(serialInput);
