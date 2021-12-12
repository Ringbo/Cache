diff --git a/ui/src/org/pentaho/di/ui/spoon/Spoon.java b/ui/src/org/pentaho/di/ui/spoon/Spoon.java
index 396e4a1..6d2c78e 100644
--- a/ui/src/org/pentaho/di/ui/spoon/Spoon.java
+++ b/ui/src/org/pentaho/di/ui/spoon/Spoon.java
@@ -3827,7 +3827,7 @@
           // Try to find the same directory in the new repository...
           RepositoryDirectoryInterface rdi =
             repository.findDirectory( jobMeta.getRepositoryDirectory().getPath() );
-          if ( rdi != null ) {
+          if ( rdi != null && !rdi.getPath().equals( "/" ) ) {
             jobMeta.setRepositoryDirectory( rdi );
           } else {
             // the root is the default!
