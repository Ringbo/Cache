diff --git a/struts2/plugin/src/com/intellij/struts2/facet/ui/StrutsFilesTree.java b/struts2/plugin/src/com/intellij/struts2/facet/ui/StrutsFilesTree.java
index 090cc98..41d2b79 100644
--- a/struts2/plugin/src/com/intellij/struts2/facet/ui/StrutsFilesTree.java
+++ b/struts2/plugin/src/com/intellij/struts2/facet/ui/StrutsFilesTree.java
@@ -65,7 +65,7 @@
         final Object object = ((DefaultMutableTreeNode) value).getUserObject();
         if (object instanceof Module) {
           final Module module = (Module) object;
-          final Icon icon = ModuleType.get(module).getNodeIcon(expanded);
+          final Icon icon = ModuleType.get(module).getIcon();
           renderer.setIcon(icon);
           final String moduleName = module.getName();
           renderer.append(moduleName, SimpleTextAttributes.REGULAR_ATTRIBUTES);
