diff --git a/core/java/android/widget/RemoteViews.java b/core/java/android/widget/RemoteViews.java
index e534233..7117137 100644
--- a/core/java/android/widget/RemoteViews.java
+++ b/core/java/android/widget/RemoteViews.java
@@ -2342,7 +2342,7 @@
     }
 
 
-    public RemoteViews clone() {
+    public synchronized RemoteViews clone() {
         Preconditions.checkState(mIsRoot, "RemoteView has been attached to another RemoteView. "
                 + "May only clone the root of a RemoteView hierarchy.");
 
