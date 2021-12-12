diff --git a/java/java-impl/src/com/intellij/ide/projectView/impl/nodes/PackageUtil.java b/java/java-impl/src/com/intellij/ide/projectView/impl/nodes/PackageUtil.java
index 98718f6..a054e89 100644
--- a/java/java-impl/src/com/intellij/ide/projectView/impl/nodes/PackageUtil.java
+++ b/java/java-impl/src/com/intellij/ide/projectView/impl/nodes/PackageUtil.java
@@ -164,11 +164,11 @@
     if (isFQNameShown) {
       name = settings.isAbbreviatePackageNames() ? TreeViewUtil.calcAbbreviatedPackageFQName(aPackage) : aPackage.getQualifiedName();
     }
-    else if (parentPackageInTree != null) {
+    else if (parentPackageInTree != null || (aPackage != null && aPackage.getParentPackage() != null)) {
       PsiPackage parentPackage = aPackage.getParentPackage();
       final StringBuilder buf = new StringBuilder();
       buf.append(aPackage.getName());
-      while (parentPackage != null && !parentPackage.equals(parentPackageInTree)) {
+      while (parentPackage != null && (parentPackageInTree == null || !parentPackage.equals(parentPackageInTree))) {
         final String parentPackageName = parentPackage.getName();
         if (parentPackageName == null || "".equals(parentPackageName)) {
           break; // reached default package
