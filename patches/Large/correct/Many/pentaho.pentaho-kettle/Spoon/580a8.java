diff --git a/ui/src/org/pentaho/di/ui/spoon/Spoon.java b/ui/src/org/pentaho/di/ui/spoon/Spoon.java
index 148e9c9..d370959 100644
--- a/ui/src/org/pentaho/di/ui/spoon/Spoon.java
+++ b/ui/src/org/pentaho/di/ui/spoon/Spoon.java
@@ -3912,7 +3912,7 @@
           // Try to find the same directory in the new repository...
           RepositoryDirectoryInterface rdi =
             repository.findDirectory( transMeta.getRepositoryDirectory().getPath() );
-          if ( rdi != null ) {
+          if ( rdi != null && !rdi.getPath().equals( "/" ) ) {
             transMeta.setRepositoryDirectory( rdi );
           } else {
             // the root is the default!
