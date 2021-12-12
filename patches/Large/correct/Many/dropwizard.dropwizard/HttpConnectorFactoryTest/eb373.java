diff --git a/dropwizard-jetty/src/test/java/io/dropwizard/jetty/HttpConnectorFactoryTest.java b/dropwizard-jetty/src/test/java/io/dropwizard/jetty/HttpConnectorFactoryTest.java
index 2097d40..1f1ee78 100644
--- a/dropwizard-jetty/src/test/java/io/dropwizard/jetty/HttpConnectorFactoryTest.java
+++ b/dropwizard-jetty/src/test/java/io/dropwizard/jetty/HttpConnectorFactoryTest.java
@@ -130,7 +130,7 @@
         assertThat(connector.getHost()).isEqualTo("127.0.0.1");
         assertThat(connector.getAcceptQueueSize()).isEqualTo(1024);
         assertThat(connector.getReuseAddress()).isTrue();
-        assertThat(connector.getSoLingerTime()).isEqualTo(30);
+        assertThat(connector.getSoLingerTime()).isEqualTo(30000);
         assertThat(connector.getIdleTimeout()).isEqualTo(30000);
         assertThat(connector.getName()).isEqualTo("test-http-connector");
 
