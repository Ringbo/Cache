diff --git a/portal-impl/src/com/liferay/portal/webserver/WebServerServlet.java b/portal-impl/src/com/liferay/portal/webserver/WebServerServlet.java
index 03369e7..8cab7ae 100644
--- a/portal-impl/src/com/liferay/portal/webserver/WebServerServlet.java
+++ b/portal-impl/src/com/liferay/portal/webserver/WebServerServlet.java
@@ -400,7 +400,7 @@
 			converted = true;
 		}
 
-		String contentType = fileEntry.getMimeType();
+		String contentType = fileEntry.getMimeType(version);
 		long contentLength = 0;
 
 		if (!converted) {
