diff --git a/core/java/android/provider/DocumentsProvider.java b/core/java/android/provider/DocumentsProvider.java
index 6170eb4..f5e558a 100644
--- a/core/java/android/provider/DocumentsProvider.java
+++ b/core/java/android/provider/DocumentsProvider.java
@@ -678,8 +678,18 @@
         throw new UnsupportedOperationException("Pre-Android-O query format not supported.");
     }
 
+    /**
+     * WARNING: Sub-classes should not override this method. This method is non-final
+     * solely for the purposes of backwards compatibility.
+     *
+     * @see #queryChildDocuments(String, String[], Bundle),
+     *      {@link #queryDocument(String, String[])},
+     *      {@link #queryRecentDocuments(String, String[])},
+     *      {@link #queryRoots(String[])}, and
+     *      {@link #querySearchDocuments(String, String, String[])}.
+     */
     @Override
-    public final Cursor query(Uri uri, String[] projection, String selection,
+    public Cursor query(Uri uri, String[] projection, String selection,
             String[] selectionArgs, String sortOrder, CancellationSignal cancellationSignal) {
         // As of Android-O, ContentProvider#query (w/ bundle arg) is the primary
         // transport method. We override that, and don't ever delegate to this metohd.
