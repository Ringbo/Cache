diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/pebble/PBWReader.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/pebble/PBWReader.java
index e1a43ce..ad8f6e1 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/pebble/PBWReader.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/pebble/PBWReader.java
@@ -186,7 +186,7 @@
 
                 } else if (fileName.equals("appinfo.json")) {
                     long bytes = ze.getSize();
-                    if (bytes > 8192) // that should be too much
+                    if (bytes > 65536) // that should be too much
                         break;
 
                     ByteArrayOutputStream baos = new ByteArrayOutputStream();
