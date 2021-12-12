diff --git a/core/java/android/app/ResourcesManager.java b/core/java/android/app/ResourcesManager.java
index 6f326de..80554ff 100644
--- a/core/java/android/app/ResourcesManager.java
+++ b/core/java/android/app/ResourcesManager.java
@@ -961,7 +961,7 @@
 
     // TODO(adamlesinski): Make this accept more than just overlay directories.
     final void applyNewResourceDirsLocked(@NonNull final String baseCodePath,
-            @NonNull final String[] newResourceDirs) {
+            @Nullable final String[] newResourceDirs) {
         try {
             Trace.traceBegin(Trace.TRACE_TAG_RESOURCES,
                     "ResourcesManager#applyNewResourceDirsLocked");
