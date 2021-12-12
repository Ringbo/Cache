diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parser/parsing/auxiliary/parameters/ParameterDeclarationList.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parser/parsing/auxiliary/parameters/ParameterDeclarationList.java
index d4524a7..51b1c20 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parser/parsing/auxiliary/parameters/ParameterDeclarationList.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parser/parsing/auxiliary/parameters/ParameterDeclarationList.java
@@ -47,7 +47,8 @@
     GroovyElementType result = ParameterDeclaration.parse(builder, ending);
 
     if (!PARAMETER.equals(result)) {
-      pdlMarker.rollbackTo();
+//      pdlMarker.rollbackTo();
+      pdlMarker.done(PARAMETERS_LIST);
       return WRONGWAY;
     }
 
@@ -75,7 +76,8 @@
       pdlMarker.done(PARAMETERS_LIST);
       return PARAMETERS_LIST;
     } else {
-      pdlMarker.rollbackTo();
+//      pdlMarker.rollbackTo();
+      pdlMarker.done(PARAMETERS_LIST);
       return WRONGWAY;
     }
 
