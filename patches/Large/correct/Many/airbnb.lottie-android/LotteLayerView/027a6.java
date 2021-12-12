diff --git a/lotte/src/main/java/com/airbnb/lotte/layers/LotteLayerView.java b/lotte/src/main/java/com/airbnb/lotte/layers/LotteLayerView.java
index dafb40f..2b9a66f 100644
--- a/lotte/src/main/java/com/airbnb/lotte/layers/LotteLayerView.java
+++ b/lotte/src/main/java/com/airbnb/lotte/layers/LotteLayerView.java
@@ -208,7 +208,7 @@
         if (!isVisible()) {
             return;
         }
-        if (contentCanvas == null || contentBitmap != null) {
+        if (contentCanvas == null || contentBitmap == null) {
             super.draw(mainCanvas);
             return;
         }
