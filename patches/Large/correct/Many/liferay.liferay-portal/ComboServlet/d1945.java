diff --git a/portal-impl/src/com/liferay/portal/servlet/ComboServlet.java b/portal-impl/src/com/liferay/portal/servlet/ComboServlet.java
index b6e747e..86202be 100644
--- a/portal-impl/src/com/liferay/portal/servlet/ComboServlet.java
+++ b/portal-impl/src/com/liferay/portal/servlet/ComboServlet.java
@@ -152,7 +152,7 @@
 			}
  		}
 
-		if (file == null) {
+		if (fileContentBag == null) {
 			fileContentBag = _EMPTY_FILE_CONTENT_BAG;
 		}
 		else {
