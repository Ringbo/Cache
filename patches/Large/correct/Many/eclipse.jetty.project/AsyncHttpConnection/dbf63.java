diff --git a/jetty-server/src/main/java/org/eclipse/jetty/server/AsyncHttpConnection.java b/jetty-server/src/main/java/org/eclipse/jetty/server/AsyncHttpConnection.java
index 97b66d0..84557ca 100644
--- a/jetty-server/src/main/java/org/eclipse/jetty/server/AsyncHttpConnection.java
+++ b/jetty-server/src/main/java/org/eclipse/jetty/server/AsyncHttpConnection.java
@@ -38,7 +38,7 @@
 
             boolean more_in_buffer =false;
             
-            while (_endp.isOpen() && (more_in_buffer || progress))
+            while (_endp.isOpen() && (more_in_buffer || progress) && connection==this)
             {
                 progress=false;
                 try
@@ -94,7 +94,7 @@
                             {
                                 _parser.reset();
                                 _generator.reset(true);
-                                return switched;
+                                connection=switched;
                             }
                         }
                         
