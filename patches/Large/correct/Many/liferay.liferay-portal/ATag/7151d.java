diff --git a/util-taglib/src/com/liferay/taglib/aui/ATag.java b/util-taglib/src/com/liferay/taglib/aui/ATag.java
index 55821a7..adc8c05 100644
--- a/util-taglib/src/com/liferay/taglib/aui/ATag.java
+++ b/util-taglib/src/com/liferay/taglib/aui/ATag.java
@@ -212,7 +212,7 @@
 		String namespace = StringPool.BLANK;
 
 		boolean useNamespace = GetterUtil.getBoolean(
-			(Boolean)request.getAttribute("aui:form:useNamespace"), true);
+			(String)request.getAttribute("aui:form:useNamespace"), true);
 
 		if ((portletResponse != null) && useNamespace) {
 			namespace = portletResponse.getNamespace();
