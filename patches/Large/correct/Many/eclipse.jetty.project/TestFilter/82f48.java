diff --git a/test-jetty-webapp/src/main/java/com/acme/TestFilter.java b/test-jetty-webapp/src/main/java/com/acme/TestFilter.java
index 3712a2c..18758dd 100644
--- a/test-jetty-webapp/src/main/java/com/acme/TestFilter.java
+++ b/test-jetty-webapp/src/main/java/com/acme/TestFilter.java
@@ -73,7 +73,7 @@
         String to = request.getServerName();
         String path=((HttpServletRequest)request).getServletPath();
 
-        if (!_remote && !_allowed.contains(path) && (
+        if (!"/remote.html".equals(path) && !_remote && !_allowed.contains(path) && (
             !from.equals("localhost") && !from.startsWith("127.") && from.indexOf(":1")<0 ||
             !to.equals("localhost")&&!to.startsWith("127.0.0.") && to.indexOf(":1")<0))
         {
