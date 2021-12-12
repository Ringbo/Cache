diff --git a/modules/apps/journal/journal-web/src/main/java/com/liferay/journal/web/internal/display/context/EditArticleDisplayPageDisplayContext.java b/modules/apps/journal/journal-web/src/main/java/com/liferay/journal/web/internal/display/context/EditArticleDisplayPageDisplayContext.java
index bff9976..84add2d 100644
--- a/modules/apps/journal/journal-web/src/main/java/com/liferay/journal/web/internal/display/context/EditArticleDisplayPageDisplayContext.java
+++ b/modules/apps/journal/journal-web/src/main/java/com/liferay/journal/web/internal/display/context/EditArticleDisplayPageDisplayContext.java
@@ -109,7 +109,8 @@
 					assetEntry.getEntryId());
 
 		if (assetDisplayPageEntry != null) {
-			_assetDisplayPageId = assetDisplayPageEntry.getLayoutId();
+			_assetDisplayPageId =
+				assetDisplayPageEntry.getLayoutPageTemplateEntryId();
 		}
 
 		return _assetDisplayPageId;
