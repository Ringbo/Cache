diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parameterInfo/GroovyParameterInfoHandler.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parameterInfo/GroovyParameterInfoHandler.java
index 175bfc1..63c1c00 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parameterInfo/GroovyParameterInfoHandler.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parameterInfo/GroovyParameterInfoHandler.java
@@ -142,7 +142,7 @@
         return groovyResolveResult.getElement() instanceof PsiNamedElement;
       }
     });
-    context.setItemsToShow(variants);
+    context.setItemsToShow(namedElements);
     context.showHint(place, place.getTextRange().getStartOffset(), this);
   }
 
