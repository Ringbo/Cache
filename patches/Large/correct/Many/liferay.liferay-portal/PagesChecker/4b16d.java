diff --git a/modules/apps/collaboration/wiki/wiki-web/src/main/java/com/liferay/wiki/web/search/PagesChecker.java b/modules/apps/collaboration/wiki/wiki-web/src/main/java/com/liferay/wiki/web/search/PagesChecker.java
index 4a74a4944..c21e4ae 100644
--- a/modules/apps/collaboration/wiki/wiki-web/src/main/java/com/liferay/wiki/web/search/PagesChecker.java
+++ b/modules/apps/collaboration/wiki/wiki-web/src/main/java/com/liferay/wiki/web/search/PagesChecker.java
@@ -91,7 +91,7 @@
 			return StringPool.BLANK;
 		}
 
-		StringBundler sb = new StringBundler(9);
+		StringBundler sb = new StringBundler(5);
 
 		sb.append("['");
 		sb.append(_liferayPortletResponse.getNamespace());
