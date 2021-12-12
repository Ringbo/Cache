diff --git a/libs/editor/WordPressEditor/src/main/java/org/wordpress/android/editor/AztecEditorFragment.java b/libs/editor/WordPressEditor/src/main/java/org/wordpress/android/editor/AztecEditorFragment.java
index 9add322..ea04c4a 100644
--- a/libs/editor/WordPressEditor/src/main/java/org/wordpress/android/editor/AztecEditorFragment.java
+++ b/libs/editor/WordPressEditor/src/main/java/org/wordpress/android/editor/AztecEditorFragment.java
@@ -413,7 +413,7 @@
         listToUpdate.clear();
 
         for (Attributes attrs : content.getAllElementAttributes(uploadingPredicate)) {
-            mFailedMediaIds.add(attrs.getValue("data-wpid"));
+            listToUpdate.add(attrs.getValue("data-wpid"));
         }
     }
 
