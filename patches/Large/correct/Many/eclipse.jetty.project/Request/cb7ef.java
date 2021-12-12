diff --git a/jetty-server/src/main/java/org/eclipse/jetty/server/Request.java b/jetty-server/src/main/java/org/eclipse/jetty/server/Request.java
index 9cb3a43..e6027cb 100644
--- a/jetty-server/src/main/java/org/eclipse/jetty/server/Request.java
+++ b/jetty-server/src/main/java/org/eclipse/jetty/server/Request.java
@@ -275,7 +275,7 @@
     public PushBuilder getPushBuilder()
     {
         if (!isPushSupported())
-            throw new IllegalStateException();
+            throw new IllegalStateException(String.format("%s,push=%b", this, isPush()));
 
         HttpFields fields = new HttpFields(getHttpFields().size()+5);
         boolean conditional=false;
