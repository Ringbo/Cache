diff --git a/app/src/test/java/nodomain/freeyourgadget/gadgetbridge/test/RtlUtilsTest.java b/app/src/test/java/nodomain/freeyourgadget/gadgetbridge/test/RtlUtilsTest.java
index 71612db..9a33af0 100644
--- a/app/src/test/java/nodomain/freeyourgadget/gadgetbridge/test/RtlUtilsTest.java
+++ b/app/src/test/java/nodomain/freeyourgadget/gadgetbridge/test/RtlUtilsTest.java
@@ -108,7 +108,7 @@
         boolean result = RtlUtils.isLtr(english1);
         assertTrue("Is Ltr Character failed", result);
 
-        result = RtlUtils.isLtr(english1);
+        result = RtlUtils.isLtr(english2);
         assertTrue("Is Ltr Character failed", result);
 
         result = RtlUtils.isLtr(hebrew1);
@@ -138,7 +138,7 @@
         boolean result = RtlUtils.isPunctuations(punctuation1);
         assertTrue("Is Punctuation Character failed", result);
 
-        result = RtlUtils.isPunctuations(punctuation1);
+        result = RtlUtils.isPunctuations(punctuation2);
         assertTrue("Is Punctuation Character failed", result);
 
         result = RtlUtils.isPunctuations(english1);
