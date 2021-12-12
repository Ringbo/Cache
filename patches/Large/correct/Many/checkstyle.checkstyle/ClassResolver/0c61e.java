diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/ClassResolver.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/ClassResolver.java
index 88e0054..bfc5938 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/ClassResolver.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/ClassResolver.java
@@ -203,7 +203,7 @@
         catch (final ClassNotFoundException ex) {
             // we shouldn't get this exception here,
             // so this is unexpected runtime exception
-            throw new RuntimeException(ex);
+            throw new IllegalStateException(ex);
         }
 
         return null;
