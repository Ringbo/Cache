diff --git a/java/java-psi-api/src/com/intellij/psi/infos/MethodCandidateInfo.java b/java/java-psi-api/src/com/intellij/psi/infos/MethodCandidateInfo.java
index b1067f8..a0632e6 100644
--- a/java/java-psi-api/src/com/intellij/psi/infos/MethodCandidateInfo.java
+++ b/java/java-psi-api/src/com/intellij/psi/infos/MethodCandidateInfo.java
@@ -48,7 +48,7 @@
   private PsiSubstitutor myCalcedSubstitutor;
 
   private volatile String myInferenceError;
-  private ThreadLocal<String> myApplicabilityError = new ThreadLocal<>();
+  private final ThreadLocal<String> myApplicabilityError = new ThreadLocal<>();
 
   private final LanguageLevel myLanguageLevel;
 
@@ -306,7 +306,7 @@
       if (myTypeArguments == null) {
         final RecursionGuard.StackStamp stackStamp = PsiDiamondType.ourDiamondGuard.markStack();
 
-        myApplicabilityError.set(null);
+        myApplicabilityError.remove();
         try {
           final PsiSubstitutor inferredSubstitutor = inferTypeArguments(DefaultParameterTypeInferencePolicy.INSTANCE, includeReturnConstraint);
 
@@ -330,7 +330,7 @@
           //   at least one applicability error for {bar()} candidate, when the last overloaded method leads to error but first was ok:
           //2. {bar()}.getSubstitutor() would preserve error from wrong {foo} candidate => when the error was cleared - everything ok
           if (includeReturnConstraint) {
-            myApplicabilityError.set(null);
+            myApplicabilityError.remove();
           }
         }
       }
