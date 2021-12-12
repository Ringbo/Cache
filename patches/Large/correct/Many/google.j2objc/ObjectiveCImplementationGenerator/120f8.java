diff --git a/translator/src/main/java/com/google/devtools/j2objc/gen/ObjectiveCImplementationGenerator.java b/translator/src/main/java/com/google/devtools/j2objc/gen/ObjectiveCImplementationGenerator.java
index 01caea3..fed1ee6 100644
--- a/translator/src/main/java/com/google/devtools/j2objc/gen/ObjectiveCImplementationGenerator.java
+++ b/translator/src/main/java/com/google/devtools/j2objc/gen/ObjectiveCImplementationGenerator.java
@@ -190,7 +190,7 @@
       }
     }
 
-    Set<Import> forwardDecls = Sets.newHashSet(declarationCollector.getForwardDeclarations());
+    Set<Import> forwardDecls = Sets.newHashSet();
     for (Import imp : declarationCollector.getForwardDeclarations()) {
       // Only need to forward declare private local types. All else is handled
       // by imports.
