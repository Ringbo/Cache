diff --git a/compiler/backend/src/org/jetbrains/kotlin/codegen/inline/InliningContext.java b/compiler/backend/src/org/jetbrains/kotlin/codegen/inline/InliningContext.java
index 8c28c9b..d06db34 100644
--- a/compiler/backend/src/org/jetbrains/kotlin/codegen/inline/InliningContext.java
+++ b/compiler/backend/src/org/jetbrains/kotlin/codegen/inline/InliningContext.java
@@ -96,8 +96,15 @@
             boolean isInliningLambda,
             boolean isRegeneration
     ) {
+        //isInliningLambda && !this.isInliningLambda for root inline lambda
         return new InliningContext(this, expressionMap, state, generator,
-                                   TypeRemapper.createFrom(typeRemapper, additionalTypeMappings), reifedTypeInliner, isInliningLambda, isRegeneration);
+                                   TypeRemapper.createFrom(
+                                           typeRemapper,
+                                           additionalTypeMappings,
+                                           //root inline lambda
+                                           isInliningLambda && !this.isInliningLambda
+                                   ),
+                                   reifedTypeInliner, isInliningLambda, isRegeneration);
     }
 
     public boolean isRoot() {
