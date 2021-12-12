diff --git a/src/org/traccar/protocol/MeitrackProtocolDecoder.java b/src/org/traccar/protocol/MeitrackProtocolDecoder.java
index 3a1885d..6fee0fd 100644
--- a/src/org/traccar/protocol/MeitrackProtocolDecoder.java
+++ b/src/org/traccar/protocol/MeitrackProtocolDecoder.java
@@ -256,7 +256,7 @@
 
         if (values.length > 5 && !values[5].isEmpty()) {
             String[] data = values[5].split("\\|");
-            boolean started = data[0].charAt(0) == '0';
+            boolean started = data[0].charAt(1) == '0';
             position.set("taximeterOn", started);
             position.set("taximeterStart", data[1]);
             if (data.length > 2) {
