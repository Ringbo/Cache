diff --git a/clients/unshaded/src/main/java/tachyon/client/file/TachyonFileSystem.java b/clients/unshaded/src/main/java/tachyon/client/file/TachyonFileSystem.java
index fabf8ea..c30cc34 100644
--- a/clients/unshaded/src/main/java/tachyon/client/file/TachyonFileSystem.java
+++ b/clients/unshaded/src/main/java/tachyon/client/file/TachyonFileSystem.java
@@ -99,8 +99,8 @@
   }
 
   /**
-   * Convenience method for delete with recursive set. This is the same as calling delete(file,
-   * true).
+   * Convenience method for delete without recursive set. This is the same as calling delete(file,
+   * false).
    *
    * @param file the handler for the file to delete recursively
    * @throws FileDoesNotExistException if the file does not exist in Tachyon space
@@ -111,7 +111,7 @@
   }
 
   /**
-   * Convenience method for free with recursive set. This is the same as calling free(file, true).
+   * Convenience method for free without recursive set. This is the same as calling free(file, false).
    *
    * @param file the handler for the file to free recursively
    * @throws FileDoesNotExistException if the file does not exist in Tachyon space
@@ -228,7 +228,7 @@
    * @throws IOException if the master fails to pin the file
    */
   public void pin(TachyonFile file) throws FileDoesNotExistException, IOException {
-    setPin(file, false);
+    setPin(file, true);
   }
 
   // TODO: Move this to lineage client
