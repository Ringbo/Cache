diff --git a/core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafety.java b/core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafety.java
index 1c7e780..b32076c 100644
--- a/core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafety.java
+++ b/core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafety.java
@@ -290,8 +290,7 @@
                     a ->
                         ((ClassSymbol) a.getAnnotationType().asElement())
                             .flatName()
-                            .toString()
-                            .equals(suppressAnnotation.getName()))) {
+                            .contentEquals(suppressAnnotation.getName()))) {
           continue;
         }
         Violation info = isThreadSafeType(!immutableTypeParameter, containerTypeParameters, tyarg);
@@ -491,12 +490,7 @@
         && symbol
             .getAnnotationMirrors()
             .stream()
-            .anyMatch(
-                t ->
-                    t.type
-                        .tsym
-                        .getQualifiedName()
-                        .contentEquals(typeParameterAnnotation.getName()));
+            .anyMatch(t -> t.type.tsym.flatName().contentEquals(typeParameterAnnotation.getName()));
   }
 
   /**
