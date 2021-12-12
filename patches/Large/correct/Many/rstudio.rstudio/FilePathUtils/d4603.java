diff --git a/src/gwt/src/org/rstudio/studio/client/common/FilePathUtils.java b/src/gwt/src/org/rstudio/studio/client/common/FilePathUtils.java
index 1386bbe..0006f1b 100644
--- a/src/gwt/src/org/rstudio/studio/client/common/FilePathUtils.java
+++ b/src/gwt/src/org/rstudio/studio/client/common/FilePathUtils.java
@@ -32,9 +32,14 @@
    
    public static String normalizePath (String path, String workingDirectory)
    {
-      // absolute paths don't need to be normalized
+      // Examine the path to see if it appears to be absolute. An absolute path
+      // - begins with ~ , or 
+      // - begins with / (Unix-like systems), or
+      // - begins with F:/ (Windows systems), where F is an alphabetic drive 
+      //   letter.
       if (path.startsWith(FileSystemItem.HOME_PREFIX) ||
-          path.startsWith("/"))
+          path.startsWith("/") ||                        
+          path.matches("^[a-zA-Z]:\\/.*"))
       {
          return path;
       }
