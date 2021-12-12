diff --git a/telephony/java/android/telephony/PhoneNumberUtils.java b/telephony/java/android/telephony/PhoneNumberUtils.java
index 7829006..ddfc520 100644
--- a/telephony/java/android/telephony/PhoneNumberUtils.java
+++ b/telephony/java/android/telephony/PhoneNumberUtils.java
@@ -136,7 +136,7 @@
         Uri uri = intent.getData();
         String scheme = uri.getScheme();
 
-        if (scheme.equals("tel")) {
+        if (scheme.equals("tel") || scheme.equals("sip")) {
             return uri.getSchemeSpecificPart();
         }
 
