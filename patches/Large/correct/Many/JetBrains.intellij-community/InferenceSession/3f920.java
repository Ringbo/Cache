diff --git a/java/java-psi-impl/src/com/intellij/psi/impl/source/resolve/graphInference/InferenceSession.java b/java/java-psi-impl/src/com/intellij/psi/impl/source/resolve/graphInference/InferenceSession.java
index 6259b6c..7d6166a 100644
--- a/java/java-psi-impl/src/com/intellij/psi/impl/source/resolve/graphInference/InferenceSession.java
+++ b/java/java-psi-impl/src/com/intellij/psi/impl/source/resolve/graphInference/InferenceSession.java
@@ -1030,7 +1030,7 @@
                                        boolean varargs) {
     final InferenceSession session = new InferenceSession(PsiTypeParameter.EMPTY_ARRAY, PsiSubstitutor.EMPTY, m2.getManager(), context);
     for (PsiTypeParameter param : PsiUtil.typeParametersIterable(m2)) {
-      session.initBounds(param);
+      session.initBounds(context, param);
     }
 
     final PsiParameter[] parameters1 = m1.getParameterList().getParameters();
