diff --git a/plugins/plugin-debugger/che-plugin-debugger-ide/src/main/java/org/eclipse/che/plugin/debugger/ide/debug/VariableNodeDataAdapter.java b/plugins/plugin-debugger/che-plugin-debugger-ide/src/main/java/org/eclipse/che/plugin/debugger/ide/debug/VariableNodeDataAdapter.java
index e59576a..e7e5522 100644
--- a/plugins/plugin-debugger/che-plugin-debugger-ide/src/main/java/org/eclipse/che/plugin/debugger/ide/debug/VariableNodeDataAdapter.java
+++ b/plugins/plugin-debugger/che-plugin-debugger-ide/src/main/java/org/eclipse/che/plugin/debugger/ide/debug/VariableNodeDataAdapter.java
@@ -126,7 +126,7 @@
                 List<MutableVariable> variables = new ArrayList<>(localRoot.getVariables());
                 localRoot = null;
                 for (int j = 0; j < variables.size(); j++) {
-                    MutableVariable variable = variables.get(i);
+                    MutableVariable variable = variables.get(j);
                     if (variable.getName().equals(path)) {
                         localRoot = variable;
                         break;
