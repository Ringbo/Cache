diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/DatalogSessionHealth.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/DatalogSessionHealth.java
index 1def3cd..97bf737 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/DatalogSessionHealth.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/DatalogSessionHealth.java
@@ -22,7 +22,7 @@
 
 public class DatalogSessionHealth extends DatalogSession {
 
-    private final int preambleLength = 10; // FIXME: this is 14 but if would break the code if corrected
+    private final int preambleLength = 14;
     private final int packetLength = 99;
 
     private static final Logger LOG = LoggerFactory.getLogger(DatalogSessionHealth.class);
