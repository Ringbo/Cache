diff --git a/core/java/android/widget/Editor.java b/core/java/android/widget/Editor.java
index 2703d6e..2fc8ec9 100644
--- a/core/java/android/widget/Editor.java
+++ b/core/java/android/widget/Editor.java
@@ -2480,7 +2480,7 @@
     }
 
     void onDrop(DragEvent event) {
-        StringBuilder content = new StringBuilder("");
+        SpannableStringBuilder content = new SpannableStringBuilder();
 
         final DragAndDropPermissions permissions = DragAndDropPermissions.obtain(event);
         if (permissions != null) {
