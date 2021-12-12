diff --git a/app/src/main/java/com/mikepenz/fastadapter/app/GenericItemActivity.java b/app/src/main/java/com/mikepenz/fastadapter/app/GenericItemActivity.java
index a4fc56c..0056291 100755
--- a/app/src/main/java/com/mikepenz/fastadapter/app/GenericItemActivity.java
+++ b/app/src/main/java/com/mikepenz/fastadapter/app/GenericItemActivity.java
@@ -69,7 +69,7 @@
         DragScrollBar materialScrollBar = new DragScrollBar(this, rv, true);
         materialScrollBar.setHandleColour(ContextCompat.getColor(this, R.color.colorAccent));
         materialScrollBar.setHandleOffColour(ContextCompat.getColor(this, R.color.colorAccent));
-        materialScrollBar.setIndicator(new CustomIndicator(this), true);
+        materialScrollBar.addIndicator(new CustomIndicator(this), true);
 
         rv.setLayoutManager(gridLayoutManager);
         rv.setItemAnimator(new SlideDownAlphaAnimator());
