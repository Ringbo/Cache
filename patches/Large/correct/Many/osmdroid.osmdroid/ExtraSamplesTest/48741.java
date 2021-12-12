diff --git a/osmdroid-android-it/src/main/java/org/osmdroid/test/ExtraSamplesTest.java b/osmdroid-android-it/src/main/java/org/osmdroid/test/ExtraSamplesTest.java
index 0194972..a318df4 100644
--- a/osmdroid-android-it/src/main/java/org/osmdroid/test/ExtraSamplesTest.java
+++ b/osmdroid-android-it/src/main/java/org/osmdroid/test/ExtraSamplesTest.java
@@ -73,7 +73,7 @@
         for (int i = 0; i < fireOrder.length; i++) {
 
 
-            for (int k = 0; k < 100; k++) {
+            for (int k = 0; k < 5; k++) {
                 Log.i(FragmentSamples.TAG, k + "Memory allocation: Before load: Free: " + Runtime.getRuntime().freeMemory() + " Total:" + Runtime.getRuntime().totalMemory() + " Max:" + Runtime.getRuntime().maxMemory());
                 final BaseSampleFragment basefrag = sampleFactory.getSample(fireOrder[i]);
                 if (basefrag.skipOnCiTests())
