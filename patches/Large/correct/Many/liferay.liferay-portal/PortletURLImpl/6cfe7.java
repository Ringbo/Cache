diff --git a/portal-impl/src/com/liferay/portlet/PortletURLImpl.java b/portal-impl/src/com/liferay/portlet/PortletURLImpl.java
index 6f05f9f..4c2884b 100644
--- a/portal-impl/src/com/liferay/portlet/PortletURLImpl.java
+++ b/portal-impl/src/com/liferay/portlet/PortletURLImpl.java
@@ -301,13 +301,15 @@
 
 	public void setCacheability(String cacheability) {
 		if (cacheability == null) {
-			throw new IllegalArgumentException();
+			throw new IllegalArgumentException("Cacheability is null");
 		}
 
 		if (!cacheability.equals(FULL) && !cacheability.equals(PORTLET) &&
 			!cacheability.equals(PAGE)) {
 
-			throw new IllegalArgumentException();
+			throw new IllegalArgumentException(
+				"Cacheability " + cacheability + " is not " + FULL + ", " +
+					PORTLET + ", or " + PAGE);
 		}
 
 		if (_portletReq instanceof ResourceRequest) {
