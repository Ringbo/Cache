diff --git a/keystore/java/android/security/keystore/AttestationUtils.java b/keystore/java/android/security/keystore/AttestationUtils.java
index efee8b4..1be8309 100644
--- a/keystore/java/android/security/keystore/AttestationUtils.java
+++ b/keystore/java/android/security/keystore/AttestationUtils.java
@@ -156,7 +156,7 @@
                     break;
                 }
                 case ID_TYPE_MEID: {
-                    final String meid = telephonyService.getDeviceId();
+                    final String meid = telephonyService.getMeid(0);
                     if (meid == null) {
                         throw new DeviceIdAttestationException("Unable to retrieve MEID");
                     }
