diff --git a/packages/SettingsLib/src/com/android/settingslib/NetworkPolicyEditor.java b/packages/SettingsLib/src/com/android/settingslib/NetworkPolicyEditor.java
index 687b3fc..2e77f42 100644
--- a/packages/SettingsLib/src/com/android/settingslib/NetworkPolicyEditor.java
+++ b/packages/SettingsLib/src/com/android/settingslib/NetworkPolicyEditor.java
@@ -178,8 +178,9 @@
     public void setPolicyWarningBytes(NetworkTemplate template, long warningBytes) {
         long limitBytes = getPolicyLimitBytes(template);
 
-        // If the warningBytes are larger than limitBytes, set the warningBytes to limitBytes
-        warningBytes = Math.min(warningBytes, limitBytes);
+        warningBytes =
+            (limitBytes == LIMIT_DISABLED) ? warningBytes : Math.min(warningBytes, limitBytes);
+
         setPolicyWarningBytesInner(template, warningBytes);
     }
 
@@ -192,8 +193,7 @@
     public void setPolicyLimitBytes(NetworkTemplate template, long limitBytes) {
         long warningBytes = getPolicyWarningBytes(template);
 
-        // If the warningBytes are larger than limitBytes, set the warningBytes to limitBytes
-        if (warningBytes > limitBytes) {
+        if (warningBytes > limitBytes && limitBytes != LIMIT_DISABLED) {
             setPolicyWarningBytesInner(template, limitBytes);
         }
 
