diff --git a/AIMSICD/src/main/java/com/secupwn/aimsicd/ui/activities/MapViewerOsmDroid.java b/AIMSICD/src/main/java/com/secupwn/aimsicd/ui/activities/MapViewerOsmDroid.java
index 0f05445..86e3a2f 100644
--- a/AIMSICD/src/main/java/com/secupwn/aimsicd/ui/activities/MapViewerOsmDroid.java
+++ b/AIMSICD/src/main/java/com/secupwn/aimsicd/ui/activities/MapViewerOsmDroid.java
@@ -456,7 +456,7 @@
                         log.error("Error getting default location!", e);
                     }
                 }
-                // plot neighbouring cells
+                // plot neighboring cells
                 while (mAimsicdService == null) {
                     try {
                         if (isCancelled()) {
@@ -467,7 +467,7 @@
                         log.warn("thread interrupted", e);
                     }
                 }
-                List<Cell> nc = mAimsicdService.getCellTracker().updateNeighbouringCells();
+                List<Cell> nc = mAimsicdService.getCellTracker().updateNeighboringCells();
                 for (Cell cell : nc) {
                     if (isCancelled()) {
                         return null;
@@ -493,7 +493,7 @@
                         ovm.setIcon(getResources().getDrawable(R.drawable.ic_map_pin_orange));
                         items.add(ovm);
                     } catch (Exception e) {
-                        log.error("Error plotting neighbouring cells", e);
+                        log.error("Error plotting neighboring cells", e);
                     }
                 }
 
