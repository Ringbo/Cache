diff --git a/src/main/java/org/red5/server/stream/provider/FileProvider.java b/src/main/java/org/red5/server/stream/provider/FileProvider.java
index ab4c7e3..25aa326 100644
--- a/src/main/java/org/red5/server/stream/provider/FileProvider.java
+++ b/src/main/java/org/red5/server/stream/provider/FileProvider.java
@@ -275,7 +275,7 @@
         }
         int frame = -1;
         for (int i = 0; i < keyFrameMeta.positions.length; i++) {
-            if (keyFrameMeta.timestamps[i] > ts) {
+            if (keyFrameMeta.timestamps[i] >= ts) {
                 frame = i;
                 break;
             }
