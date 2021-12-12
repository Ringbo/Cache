diff --git a/java/java-psi-impl/src/com/intellij/lang/java/parser/DeclarationParser.java b/java/java-psi-impl/src/com/intellij/lang/java/parser/DeclarationParser.java
index e34307b..37eedd1 100644
--- a/java/java-psi-impl/src/com/intellij/lang/java/parser/DeclarationParser.java
+++ b/java/java-psi-impl/src/com/intellij/lang/java/parser/DeclarationParser.java
@@ -266,7 +266,7 @@
     }
 
     PsiBuilder.Marker typeParams = null;
-    if (builder.getTokenType() == JavaTokenType.LT) {
+    if (builder.getTokenType() == JavaTokenType.LT && context != Context.CODE_BLOCK) {
       typeParams = myParser.getReferenceParser().parseTypeParameters(builder);
     }
 
