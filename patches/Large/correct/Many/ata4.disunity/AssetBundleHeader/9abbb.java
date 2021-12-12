diff --git a/src/info/ata4/unity/struct/AssetBundleHeader.java b/src/info/ata4/unity/struct/AssetBundleHeader.java
index 4c66b09..42aa335 100644
--- a/src/info/ata4/unity/struct/AssetBundleHeader.java
+++ b/src/info/ata4/unity/struct/AssetBundleHeader.java
@@ -65,10 +65,10 @@
         fileVersion = in.readByte();
         L.log(Level.FINEST, "fileVersion = {0}", fileVersion);
         
-        version = in.readStringNull(8);
+        version = in.readStringNull(10);
         L.log(Level.FINEST, "version = {0}", version);
         
-        revision = in.readStringNull(8);
+        revision = in.readStringNull(10);
         L.log(Level.FINEST, "revision = {0}", revision);
         
         fileSize = in.readInt();
