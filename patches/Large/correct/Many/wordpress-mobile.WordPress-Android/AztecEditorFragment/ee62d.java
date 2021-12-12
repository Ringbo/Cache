diff --git a/libs/editor/WordPressEditor/src/main/java/org/wordpress/android/editor/AztecEditorFragment.java b/libs/editor/WordPressEditor/src/main/java/org/wordpress/android/editor/AztecEditorFragment.java
index e352a04..6679e20 100644
--- a/libs/editor/WordPressEditor/src/main/java/org/wordpress/android/editor/AztecEditorFragment.java
+++ b/libs/editor/WordPressEditor/src/main/java/org/wordpress/android/editor/AztecEditorFragment.java
@@ -1359,7 +1359,7 @@
             return true;
         } else {
             mEditorFragmentListener.onAddMediaClicked();
-            return false;
+            return true;
         }
     }
 
