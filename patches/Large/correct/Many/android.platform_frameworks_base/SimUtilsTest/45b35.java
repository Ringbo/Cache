diff --git a/tests/CoreTests/com/android/internal/telephony/SimUtilsTest.java b/tests/CoreTests/com/android/internal/telephony/SimUtilsTest.java
index 6f25fd9..db38ede 100644
--- a/tests/CoreTests/com/android/internal/telephony/SimUtilsTest.java
+++ b/tests/CoreTests/com/android/internal/telephony/SimUtilsTest.java
@@ -59,7 +59,7 @@
         assertEquals(89, IccUtils.cdmaBcdByteToInt((byte) 0x89));
 
         // Out of range is treated as 0
-        assertEquals(80, IccUtils.gsmBcdByteToInt((byte) 0x8c));
+        assertEquals(80, IccUtils.cdmaBcdByteToInt((byte) 0x8c));
 
         /*
          * adnStringFieldToString()
