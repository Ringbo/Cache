diff --git a/packages/DocumentsUI/src/com/android/documentsui/dirlist/DirectoryFragment.java b/packages/DocumentsUI/src/com/android/documentsui/dirlist/DirectoryFragment.java
index e7b2ed1..fba25ab 100644
--- a/packages/DocumentsUI/src/com/android/documentsui/dirlist/DirectoryFragment.java
+++ b/packages/DocumentsUI/src/com/android/documentsui/dirlist/DirectoryFragment.java
@@ -1110,7 +1110,7 @@
         List<String> enabled = new ArrayList<String>();
         for (String id : mAdapter.getModelIds()) {
             Cursor cursor = getModel().getItem(id);
-            if (cursor != null) {
+            if (cursor == null) {
                 Log.w(TAG, "Skipping selection. Can't obtain cursor for modeId: " + id);
                 continue;
             }
@@ -1202,7 +1202,7 @@
             String id = getModelId(v);
             if (id != null) {
                 Cursor dstCursor = mModel.getItem(id);
-                if (dstCursor != null) {
+                if (dstCursor == null) {
                     Log.w(TAG, "Invalid destination. Can't obtain cursor for modelId: " + id);
                     return null;
                 }
