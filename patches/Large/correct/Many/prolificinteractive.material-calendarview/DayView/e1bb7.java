diff --git a/library/src/main/java/com/prolificinteractive/materialcalendarview/DayView.java b/library/src/main/java/com/prolificinteractive/materialcalendarview/DayView.java
index 8ea8ada..a4f0e66 100644
--- a/library/src/main/java/com/prolificinteractive/materialcalendarview/DayView.java
+++ b/library/src/main/java/com/prolificinteractive/materialcalendarview/DayView.java
@@ -100,7 +100,7 @@
      */
     public void setSelectionDrawable(Drawable selectionDrawable) {
         this.selectionDrawable = selectionDrawable;
-        invalidate();
+        regenerateBackground();
     }
 
     /**
