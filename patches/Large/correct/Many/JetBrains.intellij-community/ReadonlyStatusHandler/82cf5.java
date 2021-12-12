diff --git a/platform/platform-api/src/com/intellij/openapi/vfs/ReadonlyStatusHandler.java b/platform/platform-api/src/com/intellij/openapi/vfs/ReadonlyStatusHandler.java
index 7c4ad37..b32f1ee 100644
--- a/platform/platform-api/src/com/intellij/openapi/vfs/ReadonlyStatusHandler.java
+++ b/platform/platform-api/src/com/intellij/openapi/vfs/ReadonlyStatusHandler.java
@@ -23,7 +23,7 @@
 public abstract class ReadonlyStatusHandler {
 
   public static boolean ensureFilesWritable(Project project, VirtualFile... files) {
-    return getInstance(project).ensureFilesWritable(files).hasReadonlyFiles();
+    return !getInstance(project).ensureFilesWritable(files).hasReadonlyFiles();
   }
 
   public interface OperationStatus {
