diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/tablet/TabletStatusBar.java b/packages/SystemUI/src/com/android/systemui/statusbar/tablet/TabletStatusBar.java
index 71644f5..2491d18 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/tablet/TabletStatusBar.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/tablet/TabletStatusBar.java
@@ -696,7 +696,7 @@
     }
 
     @Override
-    BaseStatusBar.H createHandler() {
+    protected BaseStatusBar.H createHandler() {
         return new TabletStatusBar.H();
     }
 
