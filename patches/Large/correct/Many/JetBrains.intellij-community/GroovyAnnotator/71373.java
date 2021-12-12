diff --git a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/annotator/GroovyAnnotator.java b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/annotator/GroovyAnnotator.java
index bd6e826..dcf7336 100644
--- a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/annotator/GroovyAnnotator.java
+++ b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/annotator/GroovyAnnotator.java
@@ -1994,7 +1994,7 @@
                                      GroovyBundle.message("anonymous.classes.are.not.supported", configUtils.getSDKVersion(typeDefinition)));
       }
 
-      PsiElement superClass = ((PsiAnonymousClass)typeDefinition).getBaseClassReference().resolve();
+      PsiClass superClass = ((PsiAnonymousClass)typeDefinition).getBaseClassType().resolve();
       if (superClass instanceof GrTypeDefinition && ((GrTypeDefinition)superClass).isTrait()) {
         holder.createErrorAnnotation(typeDefinition.getNameIdentifierGroovy(), GroovyBundle.message("anonymous.classes.cannot.be.created.from.traits"));
       }
