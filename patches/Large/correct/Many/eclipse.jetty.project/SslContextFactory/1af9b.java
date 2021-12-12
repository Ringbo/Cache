diff --git a/jetty-util/src/main/java/org/eclipse/jetty/util/ssl/SslContextFactory.java b/jetty-util/src/main/java/org/eclipse/jetty/util/ssl/SslContextFactory.java
index 9abd8ec..0ed0dcd 100644
--- a/jetty-util/src/main/java/org/eclipse/jetty/util/ssl/SslContextFactory.java
+++ b/jetty-util/src/main/java/org/eclipse/jetty/util/ssl/SslContextFactory.java
@@ -1393,7 +1393,7 @@
 
     public Resource getTrustStoreResource()
     {
-        return _keyStoreResource;
+        return _trustStoreResource;
     }
 
     /**
