diff --git a/src/com/facebook/buck/io/filesystem/impl/DefaultProjectFilesystem.java b/src/com/facebook/buck/io/filesystem/impl/DefaultProjectFilesystem.java
index 0fd9381..6cbab35 100644
--- a/src/com/facebook/buck/io/filesystem/impl/DefaultProjectFilesystem.java
+++ b/src/com/facebook/buck/io/filesystem/impl/DefaultProjectFilesystem.java
@@ -139,7 +139,7 @@
     if (shouldVerifyConstructorArguments()) {
       Preconditions.checkArgument(Files.isDirectory(root), "%s must be a directory", root);
       Preconditions.checkState(vfs.equals(root.getFileSystem()));
-      Preconditions.checkArgument(root.isAbsolute());
+      Preconditions.checkArgument(root.isAbsolute(), "Expected absolute path. Got <%s>.", root);
     }
     this.projectRoot = MorePaths.normalize(root);
     this.delegate = delegate;
