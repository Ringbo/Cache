diff --git a/core/src/main/java/com/google/errorprone/bugpatterns/Unused.java b/core/src/main/java/com/google/errorprone/bugpatterns/Unused.java
index e527f69..0453663 100644
--- a/core/src/main/java/com/google/errorprone/bugpatterns/Unused.java
+++ b/core/src/main/java/com/google/errorprone/bugpatterns/Unused.java
@@ -245,7 +245,7 @@
               if (var.getKind() == Kind.IDENTIFIER) {
                 // Anything that is not @Parameters(value = ...), e.g.
                 // @Parameters(source = ...) or @Parameters(method = ...)
-                if (((IdentifierTree) var).getName().contentEquals(JUNIT_PARAMS_VALUE)) {
+                if (!((IdentifierTree) var).getName().contentEquals(JUNIT_PARAMS_VALUE)) {
                   return true;
                 }
               }
