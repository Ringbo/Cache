diff --git a/src/info/ata4/unity/assetbundle/AssetBundleWriter.java b/src/info/ata4/unity/assetbundle/AssetBundleWriter.java
index e9d973d..bd8933e 100644
--- a/src/info/ata4/unity/assetbundle/AssetBundleWriter.java
+++ b/src/info/ata4/unity/assetbundle/AssetBundleWriter.java
@@ -79,8 +79,8 @@
                     
                     // configure LZMA encoder
                     LzmaEncoderProps props = new LzmaEncoderProps();
-                    props.setDictionarySize(1 << 19);
-                    props.setNumFastBytes(273);
+                    props.setDictionarySize(1 << 23); // 8 MiB
+                    props.setNumFastBytes(273); // maximum
                     props.setUncompressedSize(outData.size());
                     props.setEndMarkerMode(true);
                     
