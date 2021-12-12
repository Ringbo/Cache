diff --git a/portal-impl/src/com/liferay/portlet/PortletURLImpl.java b/portal-impl/src/com/liferay/portlet/PortletURLImpl.java
index 1dc372c..492a49a 100644
--- a/portal-impl/src/com/liferay/portlet/PortletURLImpl.java
+++ b/portal-impl/src/com/liferay/portlet/PortletURLImpl.java
@@ -1107,7 +1107,7 @@
 				continue;
 			}
 
-			if (_lifecycle.equals(PortletRequest.RESOURCE_PHASE)) {
+			if (!_lifecycle.equals(PortletRequest.RESOURCE_PHASE)) {
 				String publicRenderParameterName = getPublicRenderParameterName(
 					name);
 
