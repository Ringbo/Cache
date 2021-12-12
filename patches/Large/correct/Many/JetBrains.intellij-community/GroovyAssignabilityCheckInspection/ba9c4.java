diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/codeInspection/assignment/GroovyAssignabilityCheckInspection.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/codeInspection/assignment/GroovyAssignabilityCheckInspection.java
index 2daee20..ce4d491 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/codeInspection/assignment/GroovyAssignabilityCheckInspection.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/codeInspection/assignment/GroovyAssignabilityCheckInspection.java
@@ -334,7 +334,7 @@
         final String typesString = buildArgTypesList(argumentTypes);
         String message = GroovyBundle.message("cannot.apply.method.or.closure", place.getText(), typesString);
         PsiElement elementToHighlight = PsiUtil.getArgumentsList(place);
-        if (elementToHighlight == null) elementToHighlight = place;
+        if (elementToHighlight == null || elementToHighlight.getTextRange().getLength() == 0) elementToHighlight = place;
         registerError(elementToHighlight, message);
         return false;
       }
