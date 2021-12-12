diff --git a/jetty-continuation/src/main/java/org/eclipse/jetty/continuation/Servlet3Continuation.java b/jetty-continuation/src/main/java/org/eclipse/jetty/continuation/Servlet3Continuation.java
index 3d15be2..e4bca0b 100644
--- a/jetty-continuation/src/main/java/org/eclipse/jetty/continuation/Servlet3Continuation.java
+++ b/jetty-continuation/src/main/java/org/eclipse/jetty/continuation/Servlet3Continuation.java
@@ -91,7 +91,7 @@
             }
         };
         
-        if (_context==null)
+        if (_context!=null)
             _context.addListener(wrapped);
         else
             _listeners.add(wrapped);
