diff --git a/spring-webmvc/src/main/java/org/springframework/web/servlet/FrameworkServlet.java b/spring-webmvc/src/main/java/org/springframework/web/servlet/FrameworkServlet.java
index 857ca7e..8434f7b 100644
--- a/spring-webmvc/src/main/java/org/springframework/web/servlet/FrameworkServlet.java
+++ b/spring-webmvc/src/main/java/org/springframework/web/servlet/FrameworkServlet.java
@@ -1139,7 +1139,7 @@
 		public <T> void preProcess(NativeWebRequest webRequest, Callable<T> task) {
 			HttpServletRequest request = webRequest.getNativeRequest(HttpServletRequest.class);
 			if (request != null) {
-				HttpServletResponse response = webRequest.getNativeRequest(HttpServletResponse.class);
+				HttpServletResponse response = webRequest.getNativeResponse(HttpServletResponse.class);
 				initContextHolders(request, buildLocaleContext(request),
 						buildRequestAttributes(request, response, null));
 			}
