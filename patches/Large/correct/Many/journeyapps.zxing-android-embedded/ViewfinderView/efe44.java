diff --git a/src/com/google/zxing/client/android/ViewfinderView.java b/src/com/google/zxing/client/android/ViewfinderView.java
index 16fae5b..de789ad 100755
--- a/src/com/google/zxing/client/android/ViewfinderView.java
+++ b/src/com/google/zxing/client/android/ViewfinderView.java
@@ -181,7 +181,7 @@
 
   public void addPossibleResultPoint(ResultPoint point) {
     List<ResultPoint> points = possibleResultPoints;
-    synchronized (point) {
+    synchronized (points) {
       points.add(point);
       int size = points.size();
       if (size > MAX_RESULT_POINTS) {
