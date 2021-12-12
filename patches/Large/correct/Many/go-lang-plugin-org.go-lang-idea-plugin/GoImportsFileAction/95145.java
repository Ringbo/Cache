diff --git a/src/com/goide/actions/fmt/GoImportsFileAction.java b/src/com/goide/actions/fmt/GoImportsFileAction.java
index 8cbb21e..66efec5 100644
--- a/src/com/goide/actions/fmt/GoImportsFileAction.java
+++ b/src/com/goide/actions/fmt/GoImportsFileAction.java
@@ -50,7 +50,7 @@
   protected GoExecutor createExecutor(Module module, @NotNull String title, @NotNull String filePath) {
     File executable = getExecutable();
     assert executable != null;
-    return GoExecutor.in(module).withExePath(executable.getAbsolutePath()).withParameters(filePath).showOutputOnError();
+    return GoExecutor.in(module).withExePath(executable.getAbsolutePath()).withParameters("-w", filePath).showOutputOnError();
   }
 
   @Nullable
