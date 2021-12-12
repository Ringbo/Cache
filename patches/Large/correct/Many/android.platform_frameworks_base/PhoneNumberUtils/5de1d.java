diff --git a/telephony/java/android/telephony/PhoneNumberUtils.java b/telephony/java/android/telephony/PhoneNumberUtils.java
index f5c6909..b4a3c95 100644
--- a/telephony/java/android/telephony/PhoneNumberUtils.java
+++ b/telephony/java/android/telephony/PhoneNumberUtils.java
@@ -130,7 +130,7 @@
         Uri uri = intent.getData();
         String scheme = uri.getScheme();
 
-        if (scheme.equals("tel")) {
+        if (scheme.equals("tel") || scheme.equals("sip")) {
             return uri.getSchemeSpecificPart();
         }
 
