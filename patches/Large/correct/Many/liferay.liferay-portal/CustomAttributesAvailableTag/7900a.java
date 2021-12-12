diff --git a/util-taglib/src/com/liferay/taglib/ui/CustomAttributesAvailableTag.java b/util-taglib/src/com/liferay/taglib/ui/CustomAttributesAvailableTag.java
index aa80d44..73ee008 100644
--- a/util-taglib/src/com/liferay/taglib/ui/CustomAttributesAvailableTag.java
+++ b/util-taglib/src/com/liferay/taglib/ui/CustomAttributesAvailableTag.java
@@ -69,7 +69,7 @@
 
 			Enumeration<String> enu = expandoBridge.getAttributeNames();
 
-			if (enu.hasMoreElements()) {
+			if (!enu.hasMoreElements()) {
 				return SKIP_BODY;
 			}
 
