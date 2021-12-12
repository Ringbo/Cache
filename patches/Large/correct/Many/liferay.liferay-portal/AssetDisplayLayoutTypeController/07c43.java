diff --git a/modules/apps/layout/layout-type-controller/layout-type-controller-asset-display/src/main/java/com/liferay/layout/type/controller/asset/display/internal/controller/AssetDisplayLayoutTypeController.java b/modules/apps/layout/layout-type-controller/layout-type-controller-asset-display/src/main/java/com/liferay/layout/type/controller/asset/display/internal/controller/AssetDisplayLayoutTypeController.java
index fcd41a4..e40958e 100644
--- a/modules/apps/layout/layout-type-controller/layout-type-controller-asset-display/src/main/java/com/liferay/layout/type/controller/asset/display/internal/controller/AssetDisplayLayoutTypeController.java
+++ b/modules/apps/layout/layout-type-controller/layout-type-controller-asset-display/src/main/java/com/liferay/layout/type/controller/asset/display/internal/controller/AssetDisplayLayoutTypeController.java
@@ -155,7 +155,7 @@
 					assetEntry.getEntryId());
 
 		if (assetDisplayPageEntry != null) {
-			return assetDisplayPageEntry.getLayoutId();
+			return assetDisplayPageEntry.getLayoutPageTemplateEntryId();
 		}
 
 		LayoutPageTemplateEntry defaultLayoutPageTemplateEntry =
