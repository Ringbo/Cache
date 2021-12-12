diff --git a/x-pack/plugin/security/src/test/java/org/elasticsearch/xpack/ssl/SSLReloadIntegTests.java b/x-pack/plugin/security/src/test/java/org/elasticsearch/xpack/ssl/SSLReloadIntegTests.java
index 0090c58..0835ece 100644
--- a/x-pack/plugin/security/src/test/java/org/elasticsearch/xpack/ssl/SSLReloadIntegTests.java
+++ b/x-pack/plugin/security/src/test/java/org/elasticsearch/xpack/ssl/SSLReloadIntegTests.java
@@ -93,7 +93,7 @@
     }
 
     public void testThatSSLConfigurationReloadsOnModification() throws Exception {
-        assumeFalse("test fails on JDK 11 currently", JavaVersion.current().compareTo(JavaVersion.parse("11")) < 0);
+        assumeTrue("test fails on JDK 11 currently", JavaVersion.current().compareTo(JavaVersion.parse("11")) < 0);
         Path keyPath = createTempDir().resolve("testnode_updated.pem");
         Path certPath = createTempDir().resolve("testnode_updated.crt");
         Files.copy(getDataPath("/org/elasticsearch/xpack/security/transport/ssl/certs/simple/testnode_updated.pem"), keyPath);
