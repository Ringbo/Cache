diff --git a/zxingorg/src/main/java/com/google/zxing/web/RedirectFilter.java b/zxingorg/src/main/java/com/google/zxing/web/RedirectFilter.java
index 0d6ed0b..487b768 100644
--- a/zxingorg/src/main/java/com/google/zxing/web/RedirectFilter.java
+++ b/zxingorg/src/main/java/com/google/zxing/web/RedirectFilter.java
@@ -45,9 +45,8 @@
                        FilterChain filterChain) throws IOException, ServletException {
     HttpServletRequest request = (HttpServletRequest) servletRequest;
     String requestURI = request.getRequestURI();
-    if ("/index.jspx".equals(requestURI) ||
-        "/w/".equals(requestURI) ||
-        "/w/index.jspx".equals(requestURI)) {
+    if ("/".equals(requestURI) || "/index.jspx".equals(requestURI) ||
+        "/w/".equals(requestURI) || "/w/index.jspx".equals(requestURI)) {
       redirect(servletResponse, "/w/decode.jspx");
     } else if (requestURI.startsWith(OLD_JAVADOC_PREFIX)) {
       String withoutPrefix = requestURI.substring(OLD_JAVADOC_PREFIX.length());
