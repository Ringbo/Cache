diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/HotSpotOptions.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/HotSpotOptions.java
index 2fdb90d..d6321fa 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/HotSpotOptions.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/HotSpotOptions.java
@@ -210,7 +210,7 @@
                 if (line.length() != 0) {
                     line.append(' ');
                 }
-                String[] embeddedLines = chunk.split("%n");
+                String[] embeddedLines = chunk.split("%n", -2);
                 if (embeddedLines.length == 1) {
                     line.append(chunk);
                 } else {
