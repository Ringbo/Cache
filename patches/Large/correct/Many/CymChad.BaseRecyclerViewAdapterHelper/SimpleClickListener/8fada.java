diff --git a/library/src/main/java/com/chad/library/adapter/base/listener/SimpleClickListener.java b/library/src/main/java/com/chad/library/adapter/base/listener/SimpleClickListener.java
index 7239378..9876dd8 100644
--- a/library/src/main/java/com/chad/library/adapter/base/listener/SimpleClickListener.java
+++ b/library/src/main/java/com/chad/library/adapter/base/listener/SimpleClickListener.java
@@ -78,7 +78,10 @@
             mIsPrepressed = true;
             mPressedView = recyclerView.findChildViewUnder(e.getX(), e.getY());
             if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
-                if (mPressedView.getBackground() != null) {
+                /**
+                 * when   click   Outside the region  ,mPressedView is null
+                 */
+                if (mPressedView!=null&&mPressedView.getBackground() != null) {
                     mPressedView.getBackground().setHotspot(e.getRawX(), e.getY()-mPressedView.getY());
                 }
             }
