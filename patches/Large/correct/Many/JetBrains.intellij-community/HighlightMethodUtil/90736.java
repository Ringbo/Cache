diff --git a/codeInsight/impl/com/intellij/codeInsight/daemon/impl/analysis/HighlightMethodUtil.java b/codeInsight/impl/com/intellij/codeInsight/daemon/impl/analysis/HighlightMethodUtil.java
index 07500bd..745536d 100644
--- a/codeInsight/impl/com/intellij/codeInsight/daemon/impl/analysis/HighlightMethodUtil.java
+++ b/codeInsight/impl/com/intellij/codeInsight/daemon/impl/analysis/HighlightMethodUtil.java
@@ -576,7 +576,7 @@
     String ms = "";
     for (int i = 0; i < parameters.length; i++) {
       PsiParameter parameter = parameters[i];
-      PsiType type = substitutor.substitute(parameter.getType());
+      PsiType type = substitutor.substituteAndCapture(parameter.getType());
       ms += "<td><b>" + (i == 0 ? "(" : "") +
             XmlUtil.escapeString(showShortType(i, parameters, expressions, substitutor)
                                  ? type.getPresentableText()
@@ -593,7 +593,7 @@
     PsiExpression expression = i < expressions.length ? expressions[i] : null;
     if (expression == null) return true;
     PsiType paramType = i < parameters.length && parameters[i] != null
-                        ? substitutor.substitute(parameters[i].getType())
+                        ? substitutor.substituteAndCapture(parameters[i].getType())
                         : null;
     return paramType != null && TypeConversionUtil.areTypesAssignmentCompatible(paramType, expression);
   }
