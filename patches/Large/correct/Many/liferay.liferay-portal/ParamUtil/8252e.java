diff --git a/portal-service/src/com/liferay/portal/kernel/util/ParamUtil.java b/portal-service/src/com/liferay/portal/kernel/util/ParamUtil.java
index 7783b49..6748630 100644
--- a/portal-service/src/com/liferay/portal/kernel/util/ParamUtil.java
+++ b/portal-service/src/com/liferay/portal/kernel/util/ParamUtil.java
@@ -393,17 +393,17 @@
 	}
 
 	public static double getDouble(
-		HttpServletRequest request, String param, Locale locale) {
+		HttpServletRequest request, String param, double defaultValue,
+		Locale locale) {
 
-		return GetterUtil.getDouble(request.getParameter(param), locale);
+		return GetterUtil.get(
+			request.getParameter(param), defaultValue, locale);
 	}
 
 	public static double getDouble(
-		HttpServletRequest request, String param, Locale locale,
-		double defaultValue) {
+		HttpServletRequest request, String param, Locale locale) {
 
-		return GetterUtil.get(
-			request.getParameter(param), locale, defaultValue);
+		return GetterUtil.getDouble(request.getParameter(param), locale);
 	}
 
 	public static double getDouble(
@@ -419,14 +419,15 @@
 	}
 
 	public static double getDouble(
-		PortletRequest portletRequest, String param, Locale locale) {
+		PortletRequest portletRequest, String param, double defaultValue,
+		Locale locale) {
 
-		return GetterUtil.getDouble(portletRequest.getParameter(param), locale);
+		return GetterUtil.get(
+			portletRequest.getParameter(param), defaultValue, locale);
 	}
 
 	public static double getDouble(
-		PortletRequest portletRequest, String param, Locale locale,
-		double defaultValue) {
+		PortletRequest portletRequest, String param, Locale locale) {
 
 		return GetterUtil.getDouble(portletRequest.getParameter(param), locale);
 	}
