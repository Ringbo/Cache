diff --git a/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/projectRoot/ModuleStructureConfigurable.java b/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/projectRoot/ModuleStructureConfigurable.java
index 5db37d1..5c7a7a0 100644
--- a/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/projectRoot/ModuleStructureConfigurable.java
+++ b/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/projectRoot/ModuleStructureConfigurable.java
@@ -564,7 +564,7 @@
     }
     if (parent == null) parent = myRoot;
     MyNode node = createModuleNode(module, getModuleGrouper());
-    TreeUtil.insertNode(parent, node, getTreeModel(), getNodeComparator());
+    TreeUtil.insertNode(node, parent, getTreeModel(), getNodeComparator());
     selectNodeInTree(node);
     final ProjectStructureDaemonAnalyzer daemonAnalyzer = myContext.getDaemonAnalyzer();
     daemonAnalyzer.queueUpdate(new ModuleProjectStructureElement(myContext, module));
