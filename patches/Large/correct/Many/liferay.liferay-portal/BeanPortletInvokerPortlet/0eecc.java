diff --git a/modules/apps/bean-portlet/bean-portlet-cdi-extension/src/main/java/com/liferay/bean/portlet/cdi/extension/internal/BeanPortletInvokerPortlet.java b/modules/apps/bean-portlet/bean-portlet-cdi-extension/src/main/java/com/liferay/bean/portlet/cdi/extension/internal/BeanPortletInvokerPortlet.java
index fad1fa3..05bda87 100644
--- a/modules/apps/bean-portlet/bean-portlet-cdi-extension/src/main/java/com/liferay/bean/portlet/cdi/extension/internal/BeanPortletInvokerPortlet.java
+++ b/modules/apps/bean-portlet/bean-portlet-cdi-extension/src/main/java/com/liferay/bean/portlet/cdi/extension/internal/BeanPortletInvokerPortlet.java
@@ -217,7 +217,7 @@
 			PortletRequestDispatcher portletRequestDispatcher =
 				portletContext.getRequestDispatcher(include);
 
-			if (portletRequestDispatcher != null) {
+			if (portletRequestDispatcher == null) {
 				_log.error(
 					"Unable to acquire dispatcher for include=" + include);
 			}
