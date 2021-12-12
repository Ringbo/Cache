diff --git a/jetty-util/src/main/java/org/eclipse/jetty/util/URIUtil.java b/jetty-util/src/main/java/org/eclipse/jetty/util/URIUtil.java
index 6cf4152..16192d1 100644
--- a/jetty-util/src/main/java/org/eclipse/jetty/util/URIUtil.java
+++ b/jetty-util/src/main/java/org/eclipse/jetty/util/URIUtil.java
@@ -1085,7 +1085,8 @@
         {
             if (!"jar".equals(uri.getScheme()))
                 return uri;
-            String s = uri.getSchemeSpecificPart();
+            // Get SSP (retaining encoded form)
+            String s = uri.getRawSchemeSpecificPart();
             int bang_slash = s.indexOf("!/");
             if (bang_slash>=0)
                 s=s.substring(0,bang_slash);
