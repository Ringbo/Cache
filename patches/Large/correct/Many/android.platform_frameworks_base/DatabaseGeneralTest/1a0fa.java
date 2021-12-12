diff --git a/tests/AndroidTests/src/com/android/unit_tests/DatabaseGeneralTest.java b/tests/AndroidTests/src/com/android/unit_tests/DatabaseGeneralTest.java
index 853f10a..7a4d934 100644
--- a/tests/AndroidTests/src/com/android/unit_tests/DatabaseGeneralTest.java
+++ b/tests/AndroidTests/src/com/android/unit_tests/DatabaseGeneralTest.java
@@ -266,7 +266,7 @@
         assertPhoneNumberNotEqual("123123", "923123");
         assertPhoneNumberNotEqual("123123", "123129");
         assertPhoneNumberNotEqual("123123", "1231234");
-        assertPhoneNumberEqual("123123", "0123123", false);
+        assertPhoneNumberNotEqual("123123", "0123123", false);
         assertPhoneNumberNotEqual("123123", "0123123", true);
         assertPhoneNumberEqual("650-253-0000", "6502530000");
         assertPhoneNumberEqual("650-253-0000", "650 253 0000");
