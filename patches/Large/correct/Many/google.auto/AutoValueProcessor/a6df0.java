diff --git a/value/src/main/java/com/google/auto/value/processor/AutoValueProcessor.java b/value/src/main/java/com/google/auto/value/processor/AutoValueProcessor.java
index 4ac945a..b0f3dc9 100644
--- a/value/src/main/java/com/google/auto/value/processor/AutoValueProcessor.java
+++ b/value/src/main/java/com/google/auto/value/processor/AutoValueProcessor.java
@@ -380,8 +380,9 @@
           + " interface; try using @AutoAnnotation instead", type);
     }
 
-    ImmutableSet<ExecutableElement> methods = getLocalAndInheritedMethods(type, processingEnv.getElementUtils());
-    ImmutableSet<ExecutableElement> methodsToImplement = methodsToImplement(methods);
+    ImmutableSet<ExecutableElement> methods =
+        getLocalAndInheritedMethods(type, processingEnv.getElementUtils());
+    ImmutableSet<ExecutableElement> methodsToImplement = methodsToImplement(type, methods);
 
     String fqExtClass = TypeSimplifier.classNameOf(type);
     List<AutoValueExtension> appliedExtensions = new ArrayList<AutoValueExtension>();
