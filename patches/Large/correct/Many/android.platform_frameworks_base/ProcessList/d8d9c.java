diff --git a/services/core/java/com/android/server/am/ProcessList.java b/services/core/java/com/android/server/am/ProcessList.java
index 4ac6684..ae4af5f 100644
--- a/services/core/java/com/android/server/am/ProcessList.java
+++ b/services/core/java/com/android/server/am/ProcessList.java
@@ -238,7 +238,7 @@
         if (Build.SUPPORTED_64_BIT_ABIS.length > 0) {
             // Increase the high min-free levels for cached processes for 64-bit
             mOomMinFreeHigh[4] = (mOomMinFreeHigh[4]*3)/2;
-            mOomMinFreeHigh[5] = (mOomMinFreeHigh[5]*7)/8;
+            mOomMinFreeHigh[5] = (mOomMinFreeHigh[5]*7)/4;
         }
 
         for (int i=0; i<mOomAdj.length; i++) {
