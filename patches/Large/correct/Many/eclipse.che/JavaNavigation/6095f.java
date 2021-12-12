diff --git a/plugins/plugin-java/che-plugin-java-ext-lang-server/src/main/java/org/eclipse/che/plugin/java/server/JavaNavigation.java b/plugins/plugin-java/che-plugin-java-ext-lang-server/src/main/java/org/eclipse/che/plugin/java/server/JavaNavigation.java
index 5b086ae..66d4014 100644
--- a/plugins/plugin-java/che-plugin-java-ext-lang-server/src/main/java/org/eclipse/che/plugin/java/server/JavaNavigation.java
+++ b/plugins/plugin-java/che-plugin-java-ext-lang-server/src/main/java/org/eclipse/che/plugin/java/server/JavaNavigation.java
@@ -843,7 +843,7 @@
     }
 
     private List<PackageFragmentRoot> toPackageRoots(IJavaProject javaProject, boolean includePackages) throws JavaModelException {
-        IPackageFragmentRoot[] packageFragmentRoots = javaProject.getPackageFragmentRoots();
+        IPackageFragmentRoot[] packageFragmentRoots = javaProject.getAllPackageFragmentRoots();
         List<PackageFragmentRoot> result = new ArrayList<>();
         for (IPackageFragmentRoot packageFragmentRoot : packageFragmentRoots) {
             if (packageFragmentRoot.getKind() == IPackageFragmentRoot.K_SOURCE &&
