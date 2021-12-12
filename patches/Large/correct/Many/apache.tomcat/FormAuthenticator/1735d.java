diff --git a/java/org/apache/catalina/authenticator/FormAuthenticator.java b/java/org/apache/catalina/authenticator/FormAuthenticator.java
index ed423d7..f47673d 100644
--- a/java/org/apache/catalina/authenticator/FormAuthenticator.java
+++ b/java/org/apache/catalina/authenticator/FormAuthenticator.java
@@ -368,7 +368,7 @@
       String requestURI = request.getRequestURI();
       if (requestURI == null)
           return (false);
-      return (requestURI.equals(request.getRequestURI()));
+      return (requestURI.equals(sreq.getRequestURI()));
 
     }
 
