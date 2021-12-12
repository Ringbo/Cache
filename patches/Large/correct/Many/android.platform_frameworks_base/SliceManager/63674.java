diff --git a/core/java/android/app/slice/SliceManager.java b/core/java/android/app/slice/SliceManager.java
index ad862fc..26498e8 100644
--- a/core/java/android/app/slice/SliceManager.java
+++ b/core/java/android/app/slice/SliceManager.java
@@ -221,7 +221,7 @@
     @WorkerThread
     public @NonNull Collection<Uri> getSliceDescendants(@NonNull Uri uri) {
         ContentResolver resolver = mContext.getContentResolver();
-        try (ContentProviderClient provider = resolver.acquireContentProviderClient(uri)) {
+        try (ContentProviderClient provider = resolver.acquireUnstableContentProviderClient(uri)) {
             Bundle extras = new Bundle();
             extras.putParcelable(SliceProvider.EXTRA_BIND_URI, uri);
             final Bundle res = provider.call(SliceProvider.METHOD_GET_DESCENDANTS, null, extras);
@@ -243,7 +243,7 @@
     public @Nullable Slice bindSlice(@NonNull Uri uri, @NonNull Set<SliceSpec> supportedSpecs) {
         Preconditions.checkNotNull(uri, "uri");
         ContentResolver resolver = mContext.getContentResolver();
-        try (ContentProviderClient provider = resolver.acquireContentProviderClient(uri)) {
+        try (ContentProviderClient provider = resolver.acquireUnstableContentProviderClient(uri)) {
             if (provider == null) {
                 Log.w(TAG, String.format("Unknown URI: %s", uri));
                 return null;
@@ -305,7 +305,7 @@
         if (authority == null) return null;
         Uri uri = new Uri.Builder().scheme(ContentResolver.SCHEME_CONTENT)
                 .authority(authority).build();
-        try (ContentProviderClient provider = resolver.acquireContentProviderClient(uri)) {
+        try (ContentProviderClient provider = resolver.acquireUnstableContentProviderClient(uri)) {
             if (provider == null) {
                 Log.w(TAG, String.format("Unknown URI: %s", uri));
                 return null;
@@ -383,7 +383,7 @@
         if (authority == null) return null;
         Uri uri = new Uri.Builder().scheme(ContentResolver.SCHEME_CONTENT)
                 .authority(authority).build();
-        try (ContentProviderClient provider = resolver.acquireContentProviderClient(uri)) {
+        try (ContentProviderClient provider = resolver.acquireUnstableContentProviderClient(uri)) {
             if (provider == null) {
                 Log.w(TAG, String.format("Unknown URI: %s", uri));
                 return null;
