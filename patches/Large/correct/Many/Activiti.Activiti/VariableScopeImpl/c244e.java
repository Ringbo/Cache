diff --git a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/persistence/entity/VariableScopeImpl.java b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/persistence/entity/VariableScopeImpl.java
index 291fb1a..f3039a2 100644
--- a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/persistence/entity/VariableScopeImpl.java
+++ b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/persistence/entity/VariableScopeImpl.java
@@ -222,7 +222,7 @@
     }
     
     if (transientVariabes != null) {
-      variables.putAll(variables);
+      variables.putAll(transientVariabes);
     }
 
     return variables;
