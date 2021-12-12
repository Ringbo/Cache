diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/buildtools/BuildCommands.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/buildtools/BuildCommands.java
index 6761a03..9f43cdd 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/buildtools/BuildCommands.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/buildtools/BuildCommands.java
@@ -32,7 +32,7 @@
       
       // adapt or remove package commands if this isn't a package
       String type = sessionInfo.getBuildToolsType();
-      if (type == SessionInfo.BUILD_TOOLS_PACKAGE)
+      if (type != SessionInfo.BUILD_TOOLS_PACKAGE)
       {
          commands.devtoolsLoadAll().remove();
          commands.buildSourcePackage().remove();
