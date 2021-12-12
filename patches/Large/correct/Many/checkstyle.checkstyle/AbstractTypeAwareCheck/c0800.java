diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/AbstractTypeAwareCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/AbstractTypeAwareCheck.java
index 73d83a3..a3a883f 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/AbstractTypeAwareCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/AbstractTypeAwareCheck.java
@@ -240,7 +240,8 @@
         try {
             clazz = getClassResolver().resolve(resolvableClassName, className);
         }
-        catch (final ClassNotFoundException ignored) {
+        // -@cs[IllegalCatch] Exception type is not predictable.
+        catch (final Exception ignored) {
             clazz = null;
         }
         return clazz;
