diff --git a/portal-impl/src/com/liferay/portlet/RenderParametersPool.java b/portal-impl/src/com/liferay/portlet/RenderParametersPool.java
index ac65c33..99f24fd 100644
--- a/portal-impl/src/com/liferay/portlet/RenderParametersPool.java
+++ b/portal-impl/src/com/liferay/portlet/RenderParametersPool.java
@@ -49,7 +49,7 @@
 	public static Map<String, String[]> clear(
 		HttpServletRequest request, long plid, String portletId) {
 
-		Map<String, Map<String, String[]>> plidPool = clear(request, plid);
+		Map<String, Map<String, String[]>> plidPool = get(request, plid);
 
 		if (plidPool == null) {
 			return null;
