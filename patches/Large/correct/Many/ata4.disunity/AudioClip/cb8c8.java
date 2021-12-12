diff --git a/src/info/ata4/unity/struct/asset/AudioClip.java b/src/info/ata4/unity/struct/asset/AudioClip.java
index 250a595..b32004a 100644
--- a/src/info/ata4/unity/struct/asset/AudioClip.java
+++ b/src/info/ata4/unity/struct/asset/AudioClip.java
@@ -79,7 +79,7 @@
         use3D = in.readBoolean();
         L.log(Level.FINEST, "use3D = {0}", use3D);
         
-        if (formatInfo.getFormat() >= 7) {
+        if (formatInfo.getFormat() == 7) {
             useHardware = in.readBoolean();
             L.log(Level.FINEST, "useHardware = {0}", useHardware);
 
