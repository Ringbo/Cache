diff --git a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/typeEnhancers/ClosureParamsEnhancer.java b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/typeEnhancers/ClosureParamsEnhancer.java
index b6d4374..4954ebe 100644
--- a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/typeEnhancers/ClosureParamsEnhancer.java
+++ b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/typeEnhancers/ClosureParamsEnhancer.java
@@ -66,7 +66,7 @@
     if (variant instanceof GroovyMethodResult) {
       MethodCandidate candidate = ((GroovyMethodResult)variant).getCandidate();
       if (candidate != null) {
-        Pair<PsiParameter, PsiType> pair = candidate.getArgumentMaping().get(new Argument(null, closure));
+        Pair<PsiParameter, PsiType> pair = candidate.getArgumentMapping().get(new Argument(null, closure));
         if (pair != null) {
           param = pair.first;
         }
