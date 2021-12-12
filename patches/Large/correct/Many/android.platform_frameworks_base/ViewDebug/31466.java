diff --git a/core/java/android/view/ViewDebug.java b/core/java/android/view/ViewDebug.java
index 4baf612..2fd974e 100644
--- a/core/java/android/view/ViewDebug.java
+++ b/core/java/android/view/ViewDebug.java
@@ -1300,7 +1300,7 @@
         }
     }
 
-    private static Object resolveId(Context context, int id) {
+    static Object resolveId(Context context, int id) {
         Object fieldValue;
         final Resources resources = context.getResources();
         if (id >= 0) {
