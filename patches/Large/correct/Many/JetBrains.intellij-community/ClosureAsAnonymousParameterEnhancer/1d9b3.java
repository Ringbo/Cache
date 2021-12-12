diff --git a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/typeEnhancers/ClosureAsAnonymousParameterEnhancer.java b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/typeEnhancers/ClosureAsAnonymousParameterEnhancer.java
index de60cdd..dda7558 100644
--- a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/typeEnhancers/ClosureAsAnonymousParameterEnhancer.java
+++ b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/typeEnhancers/ClosureAsAnonymousParameterEnhancer.java
@@ -93,7 +93,7 @@
     if (variant instanceof GroovyMethodResult) {
       MethodCandidate candidate = ((GroovyMethodResult)variant).getCandidate();
       if (candidate != null) {
-        Pair<PsiParameter, PsiType> pair = candidate.getArgumentMaping().get(new Argument(null, closure));
+        Pair<PsiParameter, PsiType> pair = candidate.getArgumentMapping().get(new Argument(null, closure));
         if (pair != null) {
           GrReferenceExpression invokedExpression = (GrReferenceExpression)call.getInvokedExpression();
           GroovyInferenceSession session =
