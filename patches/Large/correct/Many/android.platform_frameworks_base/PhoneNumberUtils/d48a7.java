diff --git a/telephony/java/android/telephony/PhoneNumberUtils.java b/telephony/java/android/telephony/PhoneNumberUtils.java
index 4f2d90f..e37733c 100644
--- a/telephony/java/android/telephony/PhoneNumberUtils.java
+++ b/telephony/java/android/telephony/PhoneNumberUtils.java
@@ -141,7 +141,7 @@
         Uri uri = intent.getData();
         String scheme = uri.getScheme();
 
-        if (scheme.equals("tel")) {
+        if (scheme.equals("tel") || scheme.equals("sip")) {
             return uri.getSchemeSpecificPart();
         }
 
