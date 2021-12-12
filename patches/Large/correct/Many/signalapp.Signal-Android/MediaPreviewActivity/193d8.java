diff --git a/src/org/thoughtcrime/securesms/MediaPreviewActivity.java b/src/org/thoughtcrime/securesms/MediaPreviewActivity.java
index 9af32fe..af002c0 100644
--- a/src/org/thoughtcrime/securesms/MediaPreviewActivity.java
+++ b/src/org/thoughtcrime/securesms/MediaPreviewActivity.java
@@ -241,7 +241,7 @@
 
   private void initializeObservers() {
     viewModel.getPreviewData().observe(this, previewData -> {
-      if (previewData == null) {
+      if (previewData == null || mediaPager == null || mediaPager.getAdapter() == null) {
         return;
       }
 
