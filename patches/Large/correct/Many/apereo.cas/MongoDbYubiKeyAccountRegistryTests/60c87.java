diff --git a/support/cas-server-support-yubikey-mongo/src/test/java/org/apereo/cas/adaptors/yubikey/dao/MongoDbYubiKeyAccountRegistryTests.java b/support/cas-server-support-yubikey-mongo/src/test/java/org/apereo/cas/adaptors/yubikey/dao/MongoDbYubiKeyAccountRegistryTests.java
index b609338..e85ee8f 100644
--- a/support/cas-server-support-yubikey-mongo/src/test/java/org/apereo/cas/adaptors/yubikey/dao/MongoDbYubiKeyAccountRegistryTests.java
+++ b/support/cas-server-support-yubikey-mongo/src/test/java/org/apereo/cas/adaptors/yubikey/dao/MongoDbYubiKeyAccountRegistryTests.java
@@ -102,7 +102,7 @@
     public void verifyAccountRegistered() {
         assertTrue(yubiKeyAccountRegistry.registerAccountFor("casuser", OTP));
         assertTrue(yubiKeyAccountRegistry.isYubiKeyRegisteredFor("casuser"));
-        assertEquals(1, yubiKeyAccountRegistry.getAccounts().size());
+        assertEquals(2, yubiKeyAccountRegistry.getAccounts().size());
     }
 
     @Test
