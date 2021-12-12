diff --git a/java/org/apache/catalina/authenticator/FormAuthenticator.java b/java/org/apache/catalina/authenticator/FormAuthenticator.java
index ca2729a..a16d676 100644
--- a/java/org/apache/catalina/authenticator/FormAuthenticator.java
+++ b/java/org/apache/catalina/authenticator/FormAuthenticator.java
@@ -475,7 +475,7 @@
     }
 
       // Does the request URI match?
-      String requestURI = request.getRequestURI();
+      String requestURI = request.getDecodedRequestURI();
       if (requestURI == null) {
         return (false);
     }
@@ -635,7 +635,7 @@
 
         saved.setMethod(request.getMethod());
         saved.setQueryString(request.getQueryString());
-        saved.setRequestURI(request.getRequestURI());
+        saved.setRequestURI(request.getDecodedRequestURI());
 
         // Stash the SavedRequest in our session for later use
         session.setNote(Constants.FORM_REQUEST_NOTE, saved);
