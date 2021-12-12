diff --git a/packages/DocumentsUI/src/com/android/documentsui/DirectoryView.java b/packages/DocumentsUI/src/com/android/documentsui/DirectoryView.java
index 000b92a..a26fb47 100644
--- a/packages/DocumentsUI/src/com/android/documentsui/DirectoryView.java
+++ b/packages/DocumentsUI/src/com/android/documentsui/DirectoryView.java
@@ -46,7 +46,7 @@
 
     public void setPosition(float position) {
         mPosition = position;
-        setX((mWidth > 0) ? (mPosition * mWidth) : 0);
+        setY((mWidth > 0) ? (mPosition * mWidth) : 0);
 
         if (mPosition != 0) {
             setTranslationZ(getResources().getDimensionPixelSize(R.dimen.dir_elevation));
