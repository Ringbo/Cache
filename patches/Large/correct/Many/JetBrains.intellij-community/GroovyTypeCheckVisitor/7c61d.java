diff --git a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/codeInspection/type/GroovyTypeCheckVisitor.java b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/codeInspection/type/GroovyTypeCheckVisitor.java
index f6c22ed..204c9b9 100644
--- a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/codeInspection/type/GroovyTypeCheckVisitor.java
+++ b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/codeInspection/type/GroovyTypeCheckVisitor.java
@@ -828,7 +828,7 @@
         substitutor.substitute(targetType),
         initializer,
         parameter.getNameIdentifierGroovy(),
-        method
+        parameter
       );
     }
   }
