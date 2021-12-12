diff --git a/core/java/android/os/storage/VolumeInfo.java b/core/java/android/os/storage/VolumeInfo.java
index 9f140fc..5c99f6c 100644
--- a/core/java/android/os/storage/VolumeInfo.java
+++ b/core/java/android/os/storage/VolumeInfo.java
@@ -402,9 +402,9 @@
      * Build an intent to browse the contents of this volume. Only valid for
      * {@link #TYPE_EMULATED} or {@link #TYPE_PUBLIC}.
      */
-    public Intent buildBrowseIntent() {
+    public @Nullable Intent buildBrowseIntent() {
         final Uri uri;
-        if (type == VolumeInfo.TYPE_PUBLIC) {
+        if (type == VolumeInfo.TYPE_PUBLIC && mountUserId == UserHandle.myUserId()) {
             uri = DocumentsContract.buildRootUri(DOCUMENT_AUTHORITY, fsUuid);
         } else if (type == VolumeInfo.TYPE_EMULATED && isPrimary()) {
             uri = DocumentsContract.buildRootUri(DOCUMENT_AUTHORITY,
