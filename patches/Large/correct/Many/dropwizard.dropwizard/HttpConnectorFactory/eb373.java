diff --git a/dropwizard-jetty/src/main/java/io/dropwizard/jetty/HttpConnectorFactory.java b/dropwizard-jetty/src/main/java/io/dropwizard/jetty/HttpConnectorFactory.java
index db9fb39..5389265 100644
--- a/dropwizard-jetty/src/main/java/io/dropwizard/jetty/HttpConnectorFactory.java
+++ b/dropwizard-jetty/src/main/java/io/dropwizard/jetty/HttpConnectorFactory.java
@@ -555,7 +555,7 @@
 
         connector.setReuseAddress(reuseAddress);
         if (soLingerTime != null) {
-            connector.setSoLingerTime((int) soLingerTime.toSeconds());
+            connector.setSoLingerTime((int) soLingerTime.toMilliseconds());
         }
         connector.setIdleTimeout(idleTimeout.toMilliseconds());
         connector.setName(name);
