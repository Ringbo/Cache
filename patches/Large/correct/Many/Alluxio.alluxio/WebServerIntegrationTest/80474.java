diff --git a/tests/src/test/java/alluxio/web/WebServerIntegrationTest.java b/tests/src/test/java/alluxio/web/WebServerIntegrationTest.java
index 9d7faa4..33cb42c 100644
--- a/tests/src/test/java/alluxio/web/WebServerIntegrationTest.java
+++ b/tests/src/test/java/alluxio/web/WebServerIntegrationTest.java
@@ -51,7 +51,7 @@
     if (serviceType == ServiceType.MASTER_WEB) {
       port = mLocalAlluxioClusterResource.get().getMaster().getWebLocalPort();
     } else {
-      port = mLocalAlluxioClusterResource.get().getWorkerAddress().getWebPort();
+      port = mLocalAlluxioClusterResource.get().getWorker().getWebLocalPort();
     }
     InetSocketAddress webAddr =
         new InetSocketAddress(NetworkAddressUtils.getConnectHost(serviceType), port);
