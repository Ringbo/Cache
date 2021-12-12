diff --git a/javaparser-symbol-solver-core/src/main/java/com/github/javaparser/symbolsolver/core/resolution/Context.java b/javaparser-symbol-solver-core/src/main/java/com/github/javaparser/symbolsolver/core/resolution/Context.java
index 4ecf910..a892d8a 100644
--- a/javaparser-symbol-solver-core/src/main/java/com/github/javaparser/symbolsolver/core/resolution/Context.java
+++ b/javaparser-symbol-solver-core/src/main/java/com/github/javaparser/symbolsolver/core/resolution/Context.java
@@ -192,7 +192,8 @@
                 methodUsage = ((TypeVariableResolutionCapability) methodDeclaration)
                                       .resolveTypeVariables(this, argumentsTypes);
             } else {
-                throw new UnsupportedOperationException();
+                throw new UnsupportedOperationException("Resolved method declarations should have the " +
+                                                        TypeVariableResolutionCapability.class.getName() + ".");
             }
 
             return Optional.of(methodUsage);
