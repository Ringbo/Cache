diff --git a/core/java/android/app/LocalActivityManager.java b/core/java/android/app/LocalActivityManager.java
index a24fcae..7845e03 100644
--- a/core/java/android/app/LocalActivityManager.java
+++ b/core/java/android/app/LocalActivityManager.java
@@ -380,7 +380,7 @@
         if (r != null) {
             win = performDestroy(r, finish);
             if (finish) {
-                mActivities.remove(r);
+                mActivities.remove(id);
             }
         }
         return win;
