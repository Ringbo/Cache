diff --git a/libs/editor/WordPressEditor/src/main/java/org/wordpress/android/editor/GutenbergEditorFragment.java b/libs/editor/WordPressEditor/src/main/java/org/wordpress/android/editor/GutenbergEditorFragment.java
index 2860e5d..6e82d58 100644
--- a/libs/editor/WordPressEditor/src/main/java/org/wordpress/android/editor/GutenbergEditorFragment.java
+++ b/libs/editor/WordPressEditor/src/main/java/org/wordpress/android/editor/GutenbergEditorFragment.java
@@ -254,7 +254,7 @@
             return;
         }
 
-        mWPAndroidGlueCode.setContent(title.toString(), null);
+        mWPAndroidGlueCode.setTitle(title.toString());
     }
 
     @Override
@@ -268,7 +268,7 @@
         }
 
         String postContent = removeVisualEditorProgressTag(text.toString());
-        mWPAndroidGlueCode.setContent(null, postContent);
+        mWPAndroidGlueCode.setContent(postContent);
     }
 
     public void onToggleHtmlMode() {
