diff --git a/jetty-servlet/src/main/java/org/eclipse/jetty/servlet/DefaultServlet.java b/jetty-servlet/src/main/java/org/eclipse/jetty/servlet/DefaultServlet.java
index b644c11..b8275d4 100644
--- a/jetty-servlet/src/main/java/org/eclipse/jetty/servlet/DefaultServlet.java
+++ b/jetty-servlet/src/main/java/org/eclipse/jetty/servlet/DefaultServlet.java
@@ -757,7 +757,7 @@
 
             // has a filter already written to the response?
             written = out instanceof HttpOutput 
-                ? !((HttpOutput)out).isWritten() 
+                ? ((HttpOutput)out).isWritten() 
                 : HttpConnection.getCurrentConnection().getGenerator().isContentWritten();
         }
         catch(IllegalStateException e) 
