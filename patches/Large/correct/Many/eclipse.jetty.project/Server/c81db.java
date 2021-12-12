diff --git a/jetty-server/src/main/java/org/eclipse/jetty/server/Server.java b/jetty-server/src/main/java/org/eclipse/jetty/server/Server.java
index 8f154b6..9a01f50 100644
--- a/jetty-server/src/main/java/org/eclipse/jetty/server/Server.java
+++ b/jetty-server/src/main/java/org/eclipse/jetty/server/Server.java
@@ -265,7 +265,7 @@
             mex.add(e);
         }
 
-        if (_connectors!=null)
+        if (_connectors!=null && mex.size()==0)
         {
             for (int i=0;i<_connectors.length;i++)
             {
