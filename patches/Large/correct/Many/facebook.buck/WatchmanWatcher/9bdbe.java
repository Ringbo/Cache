diff --git a/src/com/facebook/buck/util/WatchmanWatcher.java b/src/com/facebook/buck/util/WatchmanWatcher.java
index 8eba94b..f3dce4e 100644
--- a/src/com/facebook/buck/util/WatchmanWatcher.java
+++ b/src/com/facebook/buck/util/WatchmanWatcher.java
@@ -164,13 +164,13 @@
               ignorePath.toString()));
     }
 
-    // Exclude all files matching globs in project.ignoreGlobs.
+    // Exclude all filenames matching globs. We explicitly don't match
+    // against the full path ("wholename"), just the filename.
     for (String ignoreGlob : ignoreGlobs) {
       excludeAnyOf.add(
           Lists.newArrayList(
               "match",
-              ignoreGlob,
-              "wholename"));
+              ignoreGlob));
     }
 
     sinceParams.put(
