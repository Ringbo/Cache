diff --git a/util-taglib/src/com/liferay/taglib/aui/FieldWrapperTag.java b/util-taglib/src/com/liferay/taglib/aui/FieldWrapperTag.java
index f12f9d6..be56b32 100644
--- a/util-taglib/src/com/liferay/taglib/aui/FieldWrapperTag.java
+++ b/util-taglib/src/com/liferay/taglib/aui/FieldWrapperTag.java
@@ -74,7 +74,7 @@
 			HttpServletRequest request =
 				(HttpServletRequest)pageContext.getRequest();
 
-			if (_label != null) {
+			if (_label == null) {
 				_label = TextFormatter.format(_name, TextFormatter.K);
 			}
 
