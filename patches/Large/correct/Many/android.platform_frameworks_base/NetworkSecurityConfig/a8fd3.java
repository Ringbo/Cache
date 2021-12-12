diff --git a/core/java/android/security/net/config/NetworkSecurityConfig.java b/core/java/android/security/net/config/NetworkSecurityConfig.java
index 0a4ce11..1c787b4 100644
--- a/core/java/android/security/net/config/NetworkSecurityConfig.java
+++ b/core/java/android/security/net/config/NetworkSecurityConfig.java
@@ -233,7 +233,7 @@
 
         public NetworkSecurityConfig build() {
             boolean cleartextPermitted = getEffectiveCleartextTrafficPermitted();
-            boolean hstsEnforced = getEffectiveCleartextTrafficPermitted();
+            boolean hstsEnforced = getEffectiveHstsEnforced();
             PinSet pinSet = getEffectivePinSet();
             List<CertificatesEntryRef> entryRefs = getEffectiveCertificatesEntryRefs();
             return new NetworkSecurityConfig(cleartextPermitted, hstsEnforced, pinSet, entryRefs);
