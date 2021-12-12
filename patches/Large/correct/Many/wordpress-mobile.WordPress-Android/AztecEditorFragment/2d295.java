diff --git a/libs/editor/WordPressEditor/src/main/java/org/wordpress/android/editor/AztecEditorFragment.java b/libs/editor/WordPressEditor/src/main/java/org/wordpress/android/editor/AztecEditorFragment.java
index 1b01266..ce66de8 100644
--- a/libs/editor/WordPressEditor/src/main/java/org/wordpress/android/editor/AztecEditorFragment.java
+++ b/libs/editor/WordPressEditor/src/main/java/org/wordpress/android/editor/AztecEditorFragment.java
@@ -851,7 +851,7 @@
         }
 
         attrs.setValue(idName, id);
-        tappedImagePredicate = new ImagePredicate(idName, id);
+        tappedImagePredicate = new ImagePredicate(id, idName);
 
         onMediaTapped(id, MediaType.IMAGE, meta, uploadStatus);
     }
