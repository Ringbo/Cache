diff --git a/spring-web/src/main/java/org/springframework/web/client/RestTemplate.java b/spring-web/src/main/java/org/springframework/web/client/RestTemplate.java
index a22175e..c7b3f43 100644
--- a/spring-web/src/main/java/org/springframework/web/client/RestTemplate.java
+++ b/spring-web/src/main/java/org/springframework/web/client/RestTemplate.java
@@ -593,7 +593,7 @@
 		if (logger.isDebugEnabled()) {
 			try {
 				logger.debug(method.name() + " request for \"" + url + "\" resulted in " +
-						response.getStatusCode() + " (" + response.getStatusText() + ")");
+						response.getRawStatusCode() + " (" + response.getStatusText() + ")");
 			}
 			catch (IOException e) {
 				// ignore
@@ -605,7 +605,7 @@
 		if (logger.isWarnEnabled()) {
 			try {
 				logger.warn(method.name() + " request for \"" + url + "\" resulted in " +
-						response.getStatusCode() + " (" + response.getStatusText() + "); invoking error handler");
+						response.getRawStatusCode() + " (" + response.getStatusText() + "); invoking error handler");
 			}
 			catch (IOException e) {
 				// ignore
