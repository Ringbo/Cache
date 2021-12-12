diff --git a/packages/DocumentsUI/src/com/android/documentsui/DirectoryFragment.java b/packages/DocumentsUI/src/com/android/documentsui/DirectoryFragment.java
index 93921dd..279b0e0 100644
--- a/packages/DocumentsUI/src/com/android/documentsui/DirectoryFragment.java
+++ b/packages/DocumentsUI/src/com/android/documentsui/DirectoryFragment.java
@@ -1842,7 +1842,7 @@
             // position by 1.
             final int originalPos = position;
             final int size = mMarkedForDeletion.size();
-            for (int i = 0; i <= size; ++i) {
+            for (int i = 0; i < size; ++i) {
                 // It'd be more concise, but less efficient, to iterate over positions while calling
                 // mMarkedForDeletion.get.  Instead, iterate over deleted entries.
                 if (mMarkedForDeletion.keyAt(i) <= position && mMarkedForDeletion.valueAt(i)) {
