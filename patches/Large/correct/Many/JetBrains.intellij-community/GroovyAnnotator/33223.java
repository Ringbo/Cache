diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/annotator/GroovyAnnotator.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/annotator/GroovyAnnotator.java
index c90c98e..62960bb 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/annotator/GroovyAnnotator.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/annotator/GroovyAnnotator.java
@@ -554,7 +554,7 @@
       GrExpression lValue = assignment.getLValue();
       GrExpression rValue = assignment.getRValue();
       if (rValue != null) {
-        PsiType lType = lValue.getType();
+        PsiType lType = lValue.getNominalType();
         PsiType rType = rValue.getType();
         if (lType != null && rType != null) {
           checkAssignability(holder, lType, rType, rValue);
