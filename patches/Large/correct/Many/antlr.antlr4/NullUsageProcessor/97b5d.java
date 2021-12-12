diff --git a/runtime/JavaAnnotations/src/org/antlr/v4/runtime/misc/NullUsageProcessor.java b/runtime/JavaAnnotations/src/org/antlr/v4/runtime/misc/NullUsageProcessor.java
index 1e3e290..4343dc1 100644
--- a/runtime/JavaAnnotations/src/org/antlr/v4/runtime/misc/NullUsageProcessor.java
+++ b/runtime/JavaAnnotations/src/org/antlr/v4/runtime/misc/NullUsageProcessor.java
@@ -283,7 +283,7 @@
 				String error = String.format("parameter %s annotated with %s cannot override or implement a parameter annotated with %s", overriderParameters.get(i).getSimpleName(), notNullType.getSimpleName(), nullableType.getSimpleName());
 				processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, error, overriderParameters.get(i), getNotNullAnnotationMirror(overriderParameters.get(i)));
 			}
-			else if (isNotNull(overriderParameters.get(i)) && !(isNullable(overriddenParameters.get(i)) || isNotNull(overriddenParameters.get(i))) /*&& !errorElements.contains(overriderParameters.get(i)) && warnedElements.add(overriderParameters.get(i))*/) {
+			else if (isNotNull(overriderParameters.get(i)) && !(isNullable(overriddenParameters.get(i)) || isNotNull(overriddenParameters.get(i))) && !errorElements.contains(overriderParameters.get(i)) && warnedElements.add(overriderParameters.get(i))) {
 				String error = String.format("parameter %s annotated with %s overrides a parameter that is not annotated", overriderParameters.get(i).getSimpleName(), notNullType.getSimpleName());
 				processingEnv.getMessager().printMessage(Diagnostic.Kind.WARNING, error, overriderParameters.get(i), getNotNullAnnotationMirror(overriderParameters.get(i)));
 			}
