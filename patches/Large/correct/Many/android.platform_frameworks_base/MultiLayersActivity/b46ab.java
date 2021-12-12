diff --git a/tests/HwAccelerationTest/src/com/android/test/hwui/MultiLayersActivity.java b/tests/HwAccelerationTest/src/com/android/test/hwui/MultiLayersActivity.java
index 0127396..eb8a0a9 100644
--- a/tests/HwAccelerationTest/src/com/android/test/hwui/MultiLayersActivity.java
+++ b/tests/HwAccelerationTest/src/com/android/test/hwui/MultiLayersActivity.java
@@ -45,10 +45,10 @@
 
         row1.addView(new LayerView(this, 0xffff0000), new LinearLayout.LayoutParams(
                 0, LinearLayout.LayoutParams.MATCH_PARENT, 1.0f));
-        row1.addView(new LayerView(this, 0xff00ff00), new LinearLayout.LayoutParams(
+        row1.addView(new LayerView(this, 0x0f00ff00), new LinearLayout.LayoutParams(
                 0, LinearLayout.LayoutParams.MATCH_PARENT, 1.0f));
 
-        row2.addView(new LayerView(this, 0xff0000ff), new LinearLayout.LayoutParams(
+        row2.addView(new LayerView(this, 0x0f0000ff), new LinearLayout.LayoutParams(
                 0, LinearLayout.LayoutParams.MATCH_PARENT, 1.0f));
         row2.addView(new LayerView(this, 0xffffff00), new LinearLayout.LayoutParams(
                 0, LinearLayout.LayoutParams.MATCH_PARENT, 1.0f));
