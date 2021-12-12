diff --git a/telephony/java/android/telephony/PhoneNumberUtils.java b/telephony/java/android/telephony/PhoneNumberUtils.java
index 8705446..d5ff1ad 100644
--- a/telephony/java/android/telephony/PhoneNumberUtils.java
+++ b/telephony/java/android/telephony/PhoneNumberUtils.java
@@ -2540,11 +2540,11 @@
     }
 
     // Split a phone number like "+20(123)-456#" using spaces, ignoring anything that is not
-    // a digit, to produce a result like "20 123 456".
+    // a digit or the characters * and #, to produce a result like "20 123 456#".
     private static String splitAtNonNumerics(CharSequence number) {
         StringBuilder sb = new StringBuilder(number.length());
         for (int i = 0; i < number.length(); i++) {
-            sb.append(PhoneNumberUtils.isISODigit(number.charAt(i))
+            sb.append(PhoneNumberUtils.is12Key(number.charAt(i))
                     ? number.charAt(i)
                     : " ");
         }
