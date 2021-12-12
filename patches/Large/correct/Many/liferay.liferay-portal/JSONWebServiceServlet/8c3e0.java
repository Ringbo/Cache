diff --git a/portal-impl/src/com/liferay/portal/jsonwebservice/JSONWebServiceServlet.java b/portal-impl/src/com/liferay/portal/jsonwebservice/JSONWebServiceServlet.java
index 172b906..174a87e 100644
--- a/portal-impl/src/com/liferay/portal/jsonwebservice/JSONWebServiceServlet.java
+++ b/portal-impl/src/com/liferay/portal/jsonwebservice/JSONWebServiceServlet.java
@@ -152,7 +152,7 @@
 				PortletServlet.PORTLET_CLASS_LOADER);
 
 		_jsonWebServiceServiceAction = new JSONWebServiceServiceAction(
-			servletContext.getContextPath(), portletClassLoader);
+			ContextPathUtil.getContextPath(servletContext), portletClassLoader);
 
 		_jsonWebServiceServiceAction.setServletContext(servletContext);
 
