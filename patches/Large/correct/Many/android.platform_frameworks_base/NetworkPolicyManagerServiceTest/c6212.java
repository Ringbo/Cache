diff --git a/services/tests/servicestests/src/com/android/server/NetworkPolicyManagerServiceTest.java b/services/tests/servicestests/src/com/android/server/NetworkPolicyManagerServiceTest.java
index 5627ea1..92d4c46 100644
--- a/services/tests/servicestests/src/com/android/server/NetworkPolicyManagerServiceTest.java
+++ b/services/tests/servicestests/src/com/android/server/NetworkPolicyManagerServiceTest.java
@@ -466,7 +466,7 @@
     }
 
     @Test
-    @NetPolicyXml("uidA-blacklisted-restrict-background-off.xml")
+    @NetPolicyXml("uidA-blacklisted-restrict-background-on.xml")
     public void testBlacklistedAppIsNotNotifiedWhenRestrictBackgroundIsOn() throws Exception {
         // Sanity checks.
         assertRestrictBackgroundOn();
@@ -478,10 +478,10 @@
     }
 
     @Test
-    @NetPolicyXml("uidA-whitelisted-restrict-background-off.xml")
+    @NetPolicyXml("uidA-whitelisted-restrict-background-on.xml")
     public void testWhitelistedAppIsNotNotifiedWhenRestrictBackgroundIsOn() throws Exception {
         // Sanity checks.
-        assertRestrictBackgroundOff();
+        assertRestrictBackgroundOn();
         assertWhitelistUids(UID_A);
 
         final FutureIntent futureIntent = newRestrictBackgroundChangedFuture();
