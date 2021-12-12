diff --git a/jetty-server/src/main/java/org/eclipse/jetty/server/Request.java b/jetty-server/src/main/java/org/eclipse/jetty/server/Request.java
index 5d4e3cc..6ce69d2 100644
--- a/jetty-server/src/main/java/org/eclipse/jetty/server/Request.java
+++ b/jetty-server/src/main/java/org/eclipse/jetty/server/Request.java
@@ -2073,11 +2073,11 @@
         {
             _authentication=((Authentication.Deferred)_authentication).login(username,password,this);
             if (_authentication == null)
-                throw new ServletException();
+                throw new ServletException("Authentication failed for "+username+" in "+_authentication);
         }
         else
         {
-            throw new ServletException("Authenticated as "+_authentication);
+            throw new ServletException("Already authenticated as "+_authentication);
         }
     }
 
