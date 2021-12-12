diff --git a/modules/apps/asset/asset-auto-tagger-service/src/main/java/com/liferay/asset/auto/tagger/internal/AssetAutoTaggerImpl.java b/modules/apps/asset/asset-auto-tagger-service/src/main/java/com/liferay/asset/auto/tagger/internal/AssetAutoTaggerImpl.java
index f357931..08c7333 100644
--- a/modules/apps/asset/asset-auto-tagger-service/src/main/java/com/liferay/asset/auto/tagger/internal/AssetAutoTaggerImpl.java
+++ b/modules/apps/asset/asset-auto-tagger-service/src/main/java/com/liferay/asset/auto/tagger/internal/AssetAutoTaggerImpl.java
@@ -137,7 +137,7 @@
 						_assetAutoTaggerEntryLocalService.
 							getAssetAutoTaggerEntries(assetEntry);
 
-					if (!assetAutoTaggerEntries.isEmpty()) {
+					if (assetAutoTaggerEntries.isEmpty()) {
 						return null;
 					}
 
