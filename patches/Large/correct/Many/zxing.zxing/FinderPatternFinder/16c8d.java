diff --git a/core/src/com/google/zxing/qrcode/detector/FinderPatternFinder.java b/core/src/com/google/zxing/qrcode/detector/FinderPatternFinder.java
index 199b895..1d35e67 100755
--- a/core/src/com/google/zxing/qrcode/detector/FinderPatternFinder.java
+++ b/core/src/com/google/zxing/qrcode/detector/FinderPatternFinder.java
@@ -492,13 +492,13 @@
       // But we can only afford to do so if we have at least 4 possibilities to choose from
       float totalModuleSize = 0.0f;
       for (int i = 0; i < startSize; i++) {
-        totalModuleSize += ((FinderPattern) possibleCenters.get(i)).getEstimatedModuleSize();
+        totalModuleSize += ((FinderPattern) possibleCenters.elementAt(i)).getEstimatedModuleSize();
       }
       float average = totalModuleSize / (float) startSize;
       for (int i = 0; i < possibleCenters.size() && possibleCenters.size() > 3; i++) {
-        FinderPattern pattern = (FinderPattern) possibleCenters.get(i);
+        FinderPattern pattern = (FinderPattern) possibleCenters.elementAt(i);
         if (Math.abs(pattern.getEstimatedModuleSize() - average) > 0.2f * average) {
-          possibleCenters.remove(i);
+          possibleCenters.removeElementAt(i);
           i--;
         }
       }
