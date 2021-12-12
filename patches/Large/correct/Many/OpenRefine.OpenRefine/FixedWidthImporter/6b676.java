diff --git a/main/src/com/google/refine/importers/FixedWidthImporter.java b/main/src/com/google/refine/importers/FixedWidthImporter.java
index cc13122..70ebb13 100644
--- a/main/src/com/google/refine/importers/FixedWidthImporter.java
+++ b/main/src/com/google/refine/importers/FixedWidthImporter.java
@@ -185,7 +185,7 @@
                     }
                 }
                 
-                if (counts != null) {
+                if (counts != null && lineCount > 2) {
                     List<Integer> widths = new ArrayList<Integer>();
                     
                     int startIndex = 0;
