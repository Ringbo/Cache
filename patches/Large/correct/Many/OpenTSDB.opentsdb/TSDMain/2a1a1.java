diff --git a/src/tools/TSDMain.java b/src/tools/TSDMain.java
index 7baa486..cf269ce 100644
--- a/src/tools/TSDMain.java
+++ b/src/tools/TSDMain.java
@@ -112,10 +112,10 @@
 
     // validate the cache and staticroot directories
     try {
-      checkDirectory(config.getString("tsd.http.staticroot"), DONT_CREATE,
-          !MUST_BE_WRITEABLE);
+      checkDirectory(config.getString("tsd.http.staticroot"), 
+          !MUST_BE_WRITEABLE, DONT_CREATE);
       checkDirectory(config.getString("tsd.http.cachedir"),
-          CREATE_IF_NEEDED, MUST_BE_WRITEABLE);
+          MUST_BE_WRITEABLE, CREATE_IF_NEEDED);
     } catch (IllegalArgumentException e) {
       usage(argp, e.getMessage(), 3);
     }
