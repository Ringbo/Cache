diff --git a/bundles/binding/org.openhab.binding.insteonplm/src/main/java/org/openhab/binding/insteonplm/internal/device/MessageHandler.java b/bundles/binding/org.openhab.binding.insteonplm/src/main/java/org/openhab/binding/insteonplm/internal/device/MessageHandler.java
index d745763..a855a3f 100644
--- a/bundles/binding/org.openhab.binding.insteonplm/src/main/java/org/openhab/binding/insteonplm/internal/device/MessageHandler.java
+++ b/bundles/binding/org.openhab.binding.insteonplm/src/main/java/org/openhab/binding/insteonplm/internal/device/MessageHandler.java
@@ -973,7 +973,7 @@
 
         private int extractValue(Msg msg, int group) throws FieldException {
             String lowByte = getStringParameter("low_byte", "");
-            if (!lowByte.equals("")) {
+            if (lowByte.equals("")) {
                 logger.error("{} handler misconfigured, missing low_byte!", nm());
                 return 0;
             }
