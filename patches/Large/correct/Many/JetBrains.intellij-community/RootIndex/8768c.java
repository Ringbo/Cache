diff --git a/platform/lang-impl/src/com/intellij/openapi/roots/impl/RootIndex.java b/platform/lang-impl/src/com/intellij/openapi/roots/impl/RootIndex.java
index 8fd53a0..9db0f52 100644
--- a/platform/lang-impl/src/com/intellij/openapi/roots/impl/RootIndex.java
+++ b/platform/lang-impl/src/com/intellij/openapi/roots/impl/RootIndex.java
@@ -373,7 +373,7 @@
     if (StringUtil.isNotEmpty(packageName)) {
       String parentPackage = StringUtil.getPackageName(packageName);
       String shortName = StringUtil.getShortName(packageName);
-      if (StringUtil.isNotEmpty(parentPackage) || parentPackage.equals(shortName)) {
+      if (StringUtil.isNotEmpty(parentPackage) || packageName.equals(shortName)) {
         for (VirtualFile parentDir : getDirectoriesByPackageName(parentPackage, includeLibrarySources)) {
           VirtualFile child = parentDir.findChild(shortName);
           if (isValidPackageDirectory(includeLibrarySources, child)) {
