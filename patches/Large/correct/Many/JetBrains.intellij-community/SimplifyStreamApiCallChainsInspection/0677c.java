diff --git a/java/java-impl/src/com/intellij/codeInspection/SimplifyStreamApiCallChainsInspection.java b/java/java-impl/src/com/intellij/codeInspection/SimplifyStreamApiCallChainsInspection.java
index 900b12a..11a605d 100644
--- a/java/java-impl/src/com/intellij/codeInspection/SimplifyStreamApiCallChainsInspection.java
+++ b/java/java-impl/src/com/intellij/codeInspection/SimplifyStreamApiCallChainsInspection.java
@@ -1633,7 +1633,7 @@
       String typeParametersText = typeParameters == null ? "" : ct.text(typeParameters);
       PsiElement result = ct.replaceAndRestoreComments(call, CommonClassNames.JAVA_UTIL_ARRAYS + "." + typeParametersText + "asList" +
                                                               ct.text(qualifierArgs) + ".contains(" + ct.text(value) + ")");
-      return JavaCodeStyleManager.getInstance(call.getProject()).shortenClassReferences(result);
+      return JavaCodeStyleManager.getInstance(result.getProject()).shortenClassReferences(result);
     }
 
     static CallHandler<CallChainSimplification> handler() {
