diff --git a/plugins/devkit/src/inspections/DescriptionCheckerUtil.java b/plugins/devkit/src/inspections/DescriptionCheckerUtil.java
index 20fdd3d..6b5cb14 100644
--- a/plugins/devkit/src/inspections/DescriptionCheckerUtil.java
+++ b/plugins/devkit/src/inspections/DescriptionCheckerUtil.java
@@ -45,15 +45,15 @@
    * search scopes (first dirs in current module, then dirs in module dependencies, then dirs in
    * dependent modules, finally other project dirs).
    *
-   * @param module
-   * @param descriptionType
-   * @return
+   * @param module module to search description directories for
+   * @param descriptionType type of description directory to search
+   * @return lazily populated stream of candidate directories
    */
   public static StreamEx<PsiDirectory> allDescriptionDirs(Module module, DescriptionType descriptionType) {
     final JavaPsiFacade javaPsiFacade = JavaPsiFacade.getInstance(module.getProject());
     final PsiPackage psiPackage = javaPsiFacade.findPackage(descriptionType.getDescriptionFolder());
     if (psiPackage == null) return StreamEx.empty();
-    return searchScopes(module).flatMap(scope -> StreamEx.of(psiPackage.getDirectories())).distinct();
+    return searchScopes(module).flatMap(scope -> StreamEx.of(psiPackage.getDirectories(scope))).distinct();
   }
 
   public static PsiDirectory[] getDescriptionsDirs(Module module,
