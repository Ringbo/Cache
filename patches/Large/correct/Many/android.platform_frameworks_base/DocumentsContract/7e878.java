diff --git a/core/java/android/provider/DocumentsContract.java b/core/java/android/provider/DocumentsContract.java
index 8468040..2ca7589 100644
--- a/core/java/android/provider/DocumentsContract.java
+++ b/core/java/android/provider/DocumentsContract.java
@@ -1201,7 +1201,7 @@
         final ContentProviderClient client = resolver.acquireUnstableContentProviderClient(
                 sourceDocumentUri.getAuthority());
         try {
-            return moveDocument(client, sourceParentDocumentUri, sourceDocumentUri,
+            return moveDocument(client, sourceDocumentUri, sourceParentDocumentUri,
                     targetParentDocumentUri);
         } catch (Exception e) {
             Log.w(TAG, "Failed to move document", e);
