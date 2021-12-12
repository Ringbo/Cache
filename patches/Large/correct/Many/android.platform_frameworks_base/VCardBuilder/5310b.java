diff --git a/core/java/android/pim/vcard/VCardBuilder.java b/core/java/android/pim/vcard/VCardBuilder.java
index 09ac1fd..0a6415d 100644
--- a/core/java/android/pim/vcard/VCardBuilder.java
+++ b/core/java/android/pim/vcard/VCardBuilder.java
@@ -689,7 +689,9 @@
         final int length = phoneNumber.length();
         for (int i = 0; i < length; i++) {
             final char ch = phoneNumber.charAt(i);
-            if (Character.isDigit(ch)) {
+            // TODO: add a test case for string with '+', and care the other possible issues
+            // which may happen by ignoring non-digits other than '+'.
+            if (Character.isDigit(ch) || ch == '+') {
                 builder.append(ch);
             } else if ((ch == ';' || ch == '\n') && builder.length() > 0) {
                 phoneList.add(builder.toString());
