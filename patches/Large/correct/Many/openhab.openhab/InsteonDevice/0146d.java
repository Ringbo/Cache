diff --git a/bundles/binding/org.openhab.binding.insteonplm/src/main/java/org/openhab/binding/insteonplm/internal/device/InsteonDevice.java b/bundles/binding/org.openhab.binding.insteonplm/src/main/java/org/openhab/binding/insteonplm/internal/device/InsteonDevice.java
index eaa696e..2e107e5 100644
--- a/bundles/binding/org.openhab.binding.insteonplm/src/main/java/org/openhab/binding/insteonplm/internal/device/InsteonDevice.java
+++ b/bundles/binding/org.openhab.binding.insteonplm/src/main/java/org/openhab/binding/insteonplm/internal/device/InsteonDevice.java
@@ -371,7 +371,7 @@
 							m_address, -dt);
 					return (timeNow + 2000L); // retry soon
 				} else {
-					logger.warn("gave up waiting for query reply from device {}", m_address);
+					logger.debug("gave up waiting for query reply from device {}", m_address);
 				}
 			}
 			QEntry qe = m_requestQueue.poll(); // take it off the queue!
