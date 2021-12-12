diff --git a/DBFlow/src/main/java/com/raizlabs/android/dbflow/runtime/FlowContentObserver.java b/DBFlow/src/main/java/com/raizlabs/android/dbflow/runtime/FlowContentObserver.java
index 3d4987b..dcd682e 100644
--- a/DBFlow/src/main/java/com/raizlabs/android/dbflow/runtime/FlowContentObserver.java
+++ b/DBFlow/src/main/java/com/raizlabs/android/dbflow/runtime/FlowContentObserver.java
@@ -130,7 +130,7 @@
         if (isInTransaction) {
             isInTransaction = false;
 
-            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
+            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN) {
                 onChange(true);
             } else {
                 synchronized (notificationUris) {
