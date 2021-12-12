diff --git a/plugins/devkit/src/projectRoots/IdeaJdk.java b/plugins/devkit/src/projectRoots/IdeaJdk.java
index 7afcdd6..b28f996 100644
--- a/plugins/devkit/src/projectRoots/IdeaJdk.java
+++ b/plugins/devkit/src/projectRoots/IdeaJdk.java
@@ -344,7 +344,10 @@
     boolean isUltimate = vfsManager.findFileByUrl(VfsUtilCore.pathToUrl(sdkHome + "/ultimate/ultimate-resources")) != null;
     Set<String> suppressedModules = ContainerUtil.newTroveSet("jps-plugin-system");
     Set<String> ultimateModules = ContainerUtil.newTroveSet(
-      "intellij.platform.commercial", "intellij.idea.ultimate.resources", "intellij.platform.commercial.verifier",
+      "intellij.platform.commercial", "intellij.idea.ultimate.resources",
+      "intellij.platform.commercial.verifier", "intellij.platform.commercial.license",
+      "intellij.platform.propertyInspector",
+      "intellij.platform.graph", "intellij.platform.graph.impl",
       "intellij.diagram", "intellij.diagram.impl", "intellij.uml");
     List<JpsModule> modules = JBIterable.from(model.getProject().getModules())
       .filter(o -> {
