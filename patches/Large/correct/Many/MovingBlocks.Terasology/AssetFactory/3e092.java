diff --git a/engine/src/main/java/org/terasology/asset/AssetFactory.java b/engine/src/main/java/org/terasology/asset/AssetFactory.java
index ac0bb51..cb8ca61 100644
--- a/engine/src/main/java/org/terasology/asset/AssetFactory.java
+++ b/engine/src/main/java/org/terasology/asset/AssetFactory.java
@@ -19,7 +19,7 @@
 /**
  *
  */
-public interface AssetFactory<DATA_TYPE extends AssetData, ASSET_TYPE extends Asset<DATA_TYPE>> {
+public interface AssetFactory<DATA extends AssetData, ASSET extends Asset<DATA>> {
 
-    ASSET_TYPE buildAsset(AssetUri uri, DATA_TYPE data);
+    ASSET buildAsset(AssetUri uri, DATA data);
 }
