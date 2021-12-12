diff --git a/collect_app/src/main/java/org/odk/collect/android/widgets/AlignedImageWidget.java b/collect_app/src/main/java/org/odk/collect/android/widgets/AlignedImageWidget.java
index 24914ec..bb06e99 100644
--- a/collect_app/src/main/java/org/odk/collect/android/widgets/AlignedImageWidget.java
+++ b/collect_app/src/main/java/org/odk/collect/android/widgets/AlignedImageWidget.java
@@ -92,7 +92,7 @@
             Log.w(t, "Only have " + splits.length + " alignment values");
         }
         for (int i = 0; i < 6; ++i) {
-            if (splits.length < i) {
+            if (splits.length <= i) {
                 iArray[i] = 0;
             } else {
                 iArray[i] = Integer.valueOf(splits[i]);
