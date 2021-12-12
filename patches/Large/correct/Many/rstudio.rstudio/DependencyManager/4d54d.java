diff --git a/src/gwt/src/org/rstudio/studio/client/common/dependencies/DependencyManager.java b/src/gwt/src/org/rstudio/studio/client/common/dependencies/DependencyManager.java
index 0582b11..928f56a 100644
--- a/src/gwt/src/org/rstudio/studio/client/common/dependencies/DependencyManager.java
+++ b/src/gwt/src/org/rstudio/studio/client/common/dependencies/DependencyManager.java
@@ -224,8 +224,7 @@
       if (requiresRmarkdown)
          deps.addAll(rmarkdownDependencies());
       deps.add(Dependency.cranPackage("packrat", "0.4.8-1", true));
-      // deps.add(Dependency.cranPackage("rsconnect", "0.8.8"));
-      deps.add(Dependency.embeddedPackage("rsconnect"));
+      deps.add(Dependency.cranPackage("rsconnect", "0.8.11"));
       
       withDependencies(
         "Publishing",
