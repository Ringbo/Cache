diff --git a/spring-boot-admin-server/src/main/java/de/codecentric/boot/admin/server/web/client/InstanceWebClient.java b/spring-boot-admin-server/src/main/java/de/codecentric/boot/admin/server/web/client/InstanceWebClient.java
index ddd4f07..a1b00f1 100644
--- a/spring-boot-admin-server/src/main/java/de/codecentric/boot/admin/server/web/client/InstanceWebClient.java
+++ b/spring-boot-admin-server/src/main/java/de/codecentric/boot/admin/server/web/client/InstanceWebClient.java
@@ -78,7 +78,7 @@
                                                     Duration readTimeout,
                                                     WebClientCustomizer customizer) {
         //@formatter:off
-        HttpClient httpClient = HttpClient.create().compress().tcpConfiguration(
+        HttpClient httpClient = HttpClient.create().compress(true).tcpConfiguration(
             tcp -> tcp.bootstrap(
                 bootstrap -> bootstrap.option(ChannelOption.CONNECT_TIMEOUT_MILLIS, (int) connectTimeout.toMillis())
             ).observe(
