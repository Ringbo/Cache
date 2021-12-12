diff --git a/portal-impl/src/com/liferay/portal/servlet/DynamicServletRequestUtil.java b/portal-impl/src/com/liferay/portal/servlet/DynamicServletRequestUtil.java
index 7451dcd..c9f56e7 100644
--- a/portal-impl/src/com/liferay/portal/servlet/DynamicServletRequestUtil.java
+++ b/portal-impl/src/com/liferay/portal/servlet/DynamicServletRequestUtil.java
@@ -51,7 +51,7 @@
 
 			String[] values = entry.getValue();
 
-			String[] oldValues = httpServletRequest.getParameterValues(name);
+			String[] oldValues = dynamicServletRequest.getParameterValues(name);
 
 			if (mergeParameters && (oldValues != null)) {
 				values = ArrayUtil.append(values, oldValues);
