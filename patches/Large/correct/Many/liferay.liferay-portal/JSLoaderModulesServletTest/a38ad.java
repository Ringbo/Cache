diff --git a/modules/apps/frontend-js/frontend-js-loader-modules-extender/src/test/java/com/liferay/frontend/js/loader/modules/extender/internal/JSLoaderModulesServletTest.java b/modules/apps/frontend-js/frontend-js-loader-modules-extender/src/test/java/com/liferay/frontend/js/loader/modules/extender/internal/JSLoaderModulesServletTest.java
index 4c277a8..7ceb0ea 100644
--- a/modules/apps/frontend-js/frontend-js-loader-modules-extender/src/test/java/com/liferay/frontend/js/loader/modules/extender/internal/JSLoaderModulesServletTest.java
+++ b/modules/apps/frontend-js/frontend-js-loader-modules-extender/src/test/java/com/liferay/frontend/js/loader/modules/extender/internal/JSLoaderModulesServletTest.java
@@ -503,7 +503,9 @@
 			new Hashtable<String, String>()
 		).when(
 			bundle
-		).getHeaders();
+		).getHeaders(
+			StringPool.BLANK
+		);
 
 		doReturn(
 			bsn
