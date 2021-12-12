diff --git a/src/info/ata4/unity/cli/extract/AssetExtractor.java b/src/info/ata4/unity/cli/extract/AssetExtractor.java
index e6f2009..4b5e8b4 100644
--- a/src/info/ata4/unity/cli/extract/AssetExtractor.java
+++ b/src/info/ata4/unity/cli/extract/AssetExtractor.java
@@ -236,7 +236,7 @@
             subAssetName += ".asset";
             
             Path subAssetFile = subAssetDir.resolve(subAssetName);
-            if (Files.exists(subAssetFile)) {
+            if (!Files.exists(subAssetFile)) {
                 L.log(Level.INFO, "Writing {0}", subAssetFile);
                 subAsset.save(subAssetFile);
             }
