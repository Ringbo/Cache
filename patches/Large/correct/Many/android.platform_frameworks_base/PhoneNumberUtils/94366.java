diff --git a/telephony/java/android/telephony/PhoneNumberUtils.java b/telephony/java/android/telephony/PhoneNumberUtils.java
index 3ae2106..ab429fd 100644
--- a/telephony/java/android/telephony/PhoneNumberUtils.java
+++ b/telephony/java/android/telephony/PhoneNumberUtils.java
@@ -1805,7 +1805,7 @@
         String countryIso;
         CountryDetector detector = (CountryDetector) context.getSystemService(
                 Context.COUNTRY_DETECTOR);
-        if (detector != null) {
+        if (detector != null && detector.detectCountry() != null) {
             countryIso = detector.detectCountry().getCountryIso();
         } else {
             Locale locale = context.getResources().getConfiguration().locale;
