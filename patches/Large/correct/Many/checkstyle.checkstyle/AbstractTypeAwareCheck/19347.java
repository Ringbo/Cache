diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/AbstractTypeAwareCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/AbstractTypeAwareCheck.java
index 8984d36..72ded6d 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/AbstractTypeAwareCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/AbstractTypeAwareCheck.java
@@ -443,7 +443,7 @@
         protected ClassInfo(final Token className)
         {
             if (className == null) {
-                throw new NullPointerException(
+                throw new IllegalArgumentException(
                     "ClassInfo's name should be non-null");
             }
             name = className;
