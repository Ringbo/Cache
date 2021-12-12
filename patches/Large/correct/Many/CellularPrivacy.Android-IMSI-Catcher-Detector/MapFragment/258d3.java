diff --git a/AIMSICD/src/main/java/com/secupwn/aimsicd/ui/fragments/MapFragment.java b/AIMSICD/src/main/java/com/secupwn/aimsicd/ui/fragments/MapFragment.java
index df45aae..bc588c3 100644
--- a/AIMSICD/src/main/java/com/secupwn/aimsicd/ui/fragments/MapFragment.java
+++ b/AIMSICD/src/main/java/com/secupwn/aimsicd/ui/fragments/MapFragment.java
@@ -464,7 +464,7 @@
                         log.error("Error getting default location!", e);
                     }
                 }
-                // plot neighbouring cells
+                // plot neighboring cells
                 while (mAimsicdService == null) {
                     try {
                         if (isCancelled() || !isAdded()) {
@@ -475,7 +475,7 @@
                         log.warn("thread interrupted", e);
                     }
                 }
-                List<Cell> nc = mAimsicdService.getCellTracker().updateNeighbouringCells();
+                List<Cell> nc = mAimsicdService.getCellTracker().updateNeighboringCells();
                 for (Cell cell : nc) {
                     if (isCancelled() || !isAdded()) {
                         return null;
@@ -501,7 +501,7 @@
                         ovm.setIcon(getResources().getDrawable(R.drawable.ic_map_pin_orange));
                         items.add(ovm);
                     } catch (Exception e) {
-                        log.error("Error plotting neighbouring cells", e);
+                        log.error("Error plotting neighboring cells", e);
                     }
                 }
 
