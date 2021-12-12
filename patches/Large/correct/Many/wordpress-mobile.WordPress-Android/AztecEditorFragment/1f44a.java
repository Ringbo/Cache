diff --git a/libs/editor/WordPressEditor/src/main/java/org/wordpress/android/editor/AztecEditorFragment.java b/libs/editor/WordPressEditor/src/main/java/org/wordpress/android/editor/AztecEditorFragment.java
index 2fee0b9..b467400 100644
--- a/libs/editor/WordPressEditor/src/main/java/org/wordpress/android/editor/AztecEditorFragment.java
+++ b/libs/editor/WordPressEditor/src/main/java/org/wordpress/android/editor/AztecEditorFragment.java
@@ -191,7 +191,7 @@
             return "";
         }
 
-        return content.toHtml();
+        return content.toHtml(false);
     }
 
     @Override
