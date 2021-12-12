diff --git a/platform/platform-impl/src/com/intellij/openapi/vfs/newvfs/impl/VfsRootAccess.java b/platform/platform-impl/src/com/intellij/openapi/vfs/newvfs/impl/VfsRootAccess.java
index 88f3e85..3fac62a 100644
--- a/platform/platform-impl/src/com/intellij/openapi/vfs/newvfs/impl/VfsRootAccess.java
+++ b/platform/platform-impl/src/com/intellij/openapi/vfs/newvfs/impl/VfsRootAccess.java
@@ -143,7 +143,7 @@
 
       allowed.addAll(ourAdditionalRoots);
     }
-    catch (Exception ignored) {
+    catch (Error ignored) {
       // sometimes library.getRoots() may crash if called from inside library modification
     }
 
