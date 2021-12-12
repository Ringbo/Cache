diff --git a/java/java-psi-impl/src/com/intellij/psi/impl/source/resolve/graphInference/InferenceSession.java b/java/java-psi-impl/src/com/intellij/psi/impl/source/resolve/graphInference/InferenceSession.java
index 588a16f..6259b6c 100644
--- a/java/java-psi-impl/src/com/intellij/psi/impl/source/resolve/graphInference/InferenceSession.java
+++ b/java/java-psi-impl/src/com/intellij/psi/impl/source/resolve/graphInference/InferenceSession.java
@@ -419,7 +419,7 @@
           for (int i = 0; i < typeParameters.length; i++) {
             PsiTypeParameter typeParameter = typeParameters[i];
             copy[i] = elementFactory.createTypeParameterFromText("rCopy" + typeParameter.getName(), null);
-            initBounds(copy[i]);
+            initBounds(myContext, copy[i]);
             subst = subst.put(typeParameter, elementFactory.createType(copy[i]));
           }
           final PsiType substitutedCapture = PsiUtil.captureToplevelWildcards(subst.substitute(returnType), myContext);
