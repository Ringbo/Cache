diff --git a/services/core/java/com/android/server/slice/SliceManagerService.java b/services/core/java/com/android/server/slice/SliceManagerService.java
index ca7632c..c62a856 100644
--- a/services/core/java/com/android/server/slice/SliceManagerService.java
+++ b/services/core/java/com/android/server/slice/SliceManagerService.java
@@ -233,7 +233,7 @@
     }
 
     @VisibleForTesting
-    PinnedSliceState createPinnedSlice(Uri uri) {
+    protected PinnedSliceState createPinnedSlice(Uri uri) {
         return new PinnedSliceState(this, uri);
     }
 
@@ -352,7 +352,7 @@
     // Based on getDefaultHome in ShortcutService.
     // TODO: Unify if possible
     @VisibleForTesting
-    String getDefaultHome(int userId) {
+    protected String getDefaultHome(int userId) {
         final long token = Binder.clearCallingIdentity();
         try {
             final List<ResolveInfo> allHomeCandidates = new ArrayList<>();
