diff --git a/telephony/java/android/telephony/PhoneNumberUtils.java b/telephony/java/android/telephony/PhoneNumberUtils.java
index 273cc93..b430340 100644
--- a/telephony/java/android/telephony/PhoneNumberUtils.java
+++ b/telephony/java/android/telephony/PhoneNumberUtils.java
@@ -1457,10 +1457,15 @@
         String result = null;
         try {
             PhoneNumber pn = util.parseAndKeepRawInput(phoneNumber, defaultCountryIso);
+            /**
+             * Need to reformat any local Korean phone numbers (when the user is in Korea) with
+             * country code to corresponding national format which would replace the leading
+             * +82 with 0.
+             */
             if (KOREA_ISO_COUNTRY_CODE.equals(defaultCountryIso) &&
-                    (pn.getCountryCode() == util.getCountryCodeForRegion(KOREA_ISO_COUNTRY_CODE))) {
-                // Format local Korean phone numbers with country code to corresponding national
-                // format which would replace the leading +82 with 0.
+                    (pn.getCountryCode() == util.getCountryCodeForRegion(KOREA_ISO_COUNTRY_CODE)) &&
+                    (pn.getCountryCodeSource() ==
+                            PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN)) {
                 result = util.format(pn, PhoneNumberUtil.PhoneNumberFormat.NATIONAL);
             } else {
                 result = util.formatInOriginalFormat(pn, defaultCountryIso);
