diff --git a/CFML/src/com/intellij/coldFusion/model/psi/CfmlAssignmentExpression.java b/CFML/src/com/intellij/coldFusion/model/psi/CfmlAssignmentExpression.java
index e3c1be9..43afab7 100644
--- a/CFML/src/com/intellij/coldFusion/model/psi/CfmlAssignmentExpression.java
+++ b/CFML/src/com/intellij/coldFusion/model/psi/CfmlAssignmentExpression.java
@@ -112,7 +112,7 @@
       final String variableName = expression.getText();
       final String scopeName = getScopeName();
       if (scopeName != null && variableName != null && variableName.startsWith(scopeName + ".")) {
-        return variableName.substring((scopeName + ".").length(), variableName.length());
+        return variableName.substring((scopeName + ".").length());
       }
       return variableName != null ? expression.getText() : "";
     }
