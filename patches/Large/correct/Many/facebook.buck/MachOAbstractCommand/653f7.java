diff --git a/src/com/facebook/buck/cli/MachOAbstractCommand.java b/src/com/facebook/buck/cli/MachOAbstractCommand.java
index 8642c1f..e339ceb 100644
--- a/src/com/facebook/buck/cli/MachOAbstractCommand.java
+++ b/src/com/facebook/buck/cli/MachOAbstractCommand.java
@@ -84,7 +84,7 @@
     Preconditions.checkNotNull(output, OUTPUT_OPTION + " must be set");
     Preconditions.checkNotNull(oldCompDir, OLD_COMPDIR_OPTION + " must be set");
     Preconditions.checkNotNull(updatedCompDir, NEW_COMPDIR_OPTION + " must be set");
-    Preconditions.checkNotNull(
+    Preconditions.checkState(
         !binary.equals(output),
         BINARY_OPTION + " must be different from " + OUTPUT_OPTION);
     Preconditions.checkArgument(
