diff --git a/android-pdfview/src/main/java/com/joanzapata/pdfview/PDFView.java b/android-pdfview/src/main/java/com/joanzapata/pdfview/PDFView.java
index 1e4e1d7..2f1ead0 100644
--- a/android-pdfview/src/main/java/com/joanzapata/pdfview/PDFView.java
+++ b/android-pdfview/src/main/java/com/joanzapata/pdfview/PDFView.java
@@ -563,7 +563,7 @@
         float middleOfScreenY = (-currentYOffset + getHeight() / 2);
         float middleOfScreenPageX;
         float middleOfScreenPageY;
-        if (swipeVertical) {
+        if (!swipeVertical) {
         	middleOfScreenPageX = middleOfScreenX - userPage * toCurrentScale(optimalPageWidth);
         	middleOfScreenPageY = middleOfScreenY;
         } else {
