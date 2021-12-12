diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/codeInspection/bugs/GroovyInArgumentCheckInspection.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/codeInspection/bugs/GroovyInArgumentCheckInspection.java
index 8e84d0f..453d6f8 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/codeInspection/bugs/GroovyInArgumentCheckInspection.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/codeInspection/bugs/GroovyInArgumentCheckInspection.java
@@ -90,7 +90,7 @@
 
       if (component == null) return;
       
-      if (TypesUtil.isAssignable(ltype, component, expression)) return;
+      if (TypesUtil.isAssignable(component, ltype, expression)) return;
 
       registerError(expression, ltype, rtype);
     }
