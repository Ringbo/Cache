diff --git a/library/src/main/java/com/prolificinteractive/materialcalendarview/MaterialCalendarView.java b/library/src/main/java/com/prolificinteractive/materialcalendarview/MaterialCalendarView.java
index 16513a6..54cc7bf 100644
--- a/library/src/main/java/com/prolificinteractive/materialcalendarview/MaterialCalendarView.java
+++ b/library/src/main/java/com/prolificinteractive/materialcalendarview/MaterialCalendarView.java
@@ -311,7 +311,7 @@
 
             setSelectionMode(a.getInteger(
                 R.styleable.MaterialCalendarView_mcv_selectionMode,
-                SELECTION_MODE_NONE
+                SELECTION_MODE_SINGLE
             ));
 
             final int tileSize = a.getLayoutDimension(R.styleable.MaterialCalendarView_mcv_tileSize, INVALID_TILE_DIMENSION);
