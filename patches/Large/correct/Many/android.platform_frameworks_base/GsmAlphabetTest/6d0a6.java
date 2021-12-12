diff --git a/tests/CoreTests/com/android/internal/telephony/GsmAlphabetTest.java b/tests/CoreTests/com/android/internal/telephony/GsmAlphabetTest.java
index e2336f8..3a9c511 100644
--- a/tests/CoreTests/com/android/internal/telephony/GsmAlphabetTest.java
+++ b/tests/CoreTests/com/android/internal/telephony/GsmAlphabetTest.java
@@ -41,7 +41,7 @@
                 SmsHeader.toByteArray(header));
         int septetCount = GsmAlphabet.countGsmSeptets(message, false);
         String parsedMessage = GsmAlphabet.gsm7BitPackedToString(
-                userData, SmsHeader.toByteArray(header).length+1, septetCount, 1);
+                userData, SmsHeader.toByteArray(header).length+2, septetCount, 1);
         assertEquals(message, parsedMessage);
     }
 
