diff --git a/integration-tests/src/test/java/tachyon/master/MasterClientAuthenticationIntegrationTest.java b/integration-tests/src/test/java/tachyon/master/MasterClientAuthenticationIntegrationTest.java
index 21e199f..482ecf4 100644
--- a/integration-tests/src/test/java/tachyon/master/MasterClientAuthenticationIntegrationTest.java
+++ b/integration-tests/src/test/java/tachyon/master/MasterClientAuthenticationIntegrationTest.java
@@ -175,7 +175,7 @@
     System.setProperty(Constants.TACHYON_SECURITY_AUTHENTICATION,
         AuthType.KERBEROS.getAuthName());
     //Currently the kerberos authentication doesn't support
-    mThrown.expect(SaslException.class);
+    mThrown.expect(UnsupportedOperationException.class);
     mThrown.expectMessage("Kerberos is not supported currently");
     //start cluster
     mLocalTachyonCluster.start();
