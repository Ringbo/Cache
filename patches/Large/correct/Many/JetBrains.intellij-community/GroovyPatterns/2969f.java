diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/patterns/GroovyPatterns.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/patterns/GroovyPatterns.java
index d4b3c8c..59f7ce9 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/patterns/GroovyPatterns.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/patterns/GroovyPatterns.java
@@ -102,7 +102,7 @@
     return stringLiteral().withParent(psiElement(GrNamedArgument.class));
   }
 
-  public static GroovyElementPattern.Capture<GrArgumentLabel> namedArgumentLabel() {
+  public static GroovyElementPattern.Capture<GrArgumentLabel> namedArgumentLabel(@Nullable final ElementPattern<? extends String> namePattern) {
     return new GroovyElementPattern.Capture<GrArgumentLabel>(new InitialPatternCondition<GrArgumentLabel>(GrArgumentLabel.class) {
       public boolean accepts(@Nullable final Object o, final ProcessingContext context) {
         if (o instanceof GrArgumentLabel) {
@@ -111,7 +111,7 @@
             IElementType elementType = ((LeafPsiElement)nameElement).getElementType();
             if (elementType == GroovyElementTypes.mIDENT ||
                 CommonClassNames.JAVA_LANG_STRING.equals(TypesUtil.getPsiTypeName(elementType))) {
-              return true;
+              return namePattern == null || namePattern.accepts(((GrArgumentLabel)o).getName());
             }
           }
         }
@@ -149,7 +149,7 @@
 
         if (!(eMethodCall instanceof GrCall)) return false;
 
-        return methodCall == null || methodCall.accepts(eMethodCall);
+        return methodCall == null || methodCall.accepts(eMethodCall, context);
       }
     });
   }
