diff --git a/core/src/main/java/com/google/errorprone/bugpatterns/Unused.java b/core/src/main/java/com/google/errorprone/bugpatterns/Unused.java
index 7cf560a..e527f69 100644
--- a/core/src/main/java/com/google/errorprone/bugpatterns/Unused.java
+++ b/core/src/main/java/com/google/errorprone/bugpatterns/Unused.java
@@ -213,7 +213,7 @@
     // We will skip reporting on the whole compilation if there are any native methods found.
     // Use a TreeScanner to find all local variables and fields.
     // The only reason type is atomic here is that we need to set its value from inside the closure.
-    if (hasNativeMethods(state.getPath())) {
+    if (hasNativeMethods(tree)) {
       // Skipping the analysis of this file because it has native methods.
       return Description.NO_MATCH;
     }
@@ -650,7 +650,7 @@
     return Description.NO_MATCH;
   }
 
-  private static boolean hasNativeMethods(TreePath path) {
+  private static boolean hasNativeMethods(CompilationUnitTree tree) {
     AtomicBoolean hasAnyNativeMethods = new AtomicBoolean(false);
     new TreeScanner<Void, Void>() {
       @Override
@@ -660,7 +660,7 @@
         }
         return null;
       }
-    }.scan(path, null);
+    }.scan(tree, null);
     return hasAnyNativeMethods.get();
   }
 
