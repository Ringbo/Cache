diff --git a/util-taglib/src/com/liferay/taglib/ui/ItemSelectorBrowserTag.java b/util-taglib/src/com/liferay/taglib/ui/ItemSelectorBrowserTag.java
index 693047f..bc1a97e 100644
--- a/util-taglib/src/com/liferay/taglib/ui/ItemSelectorBrowserTag.java
+++ b/util-taglib/src/com/liferay/taglib/ui/ItemSelectorBrowserTag.java
@@ -63,7 +63,7 @@
 	}
 
 	protected String getUploadMessage() {
-		if (Validator.isNull(_uploadMessage)) {
+		if (Validator.isNotNull(_uploadMessage)) {
 			return _uploadMessage;
 		}
 
