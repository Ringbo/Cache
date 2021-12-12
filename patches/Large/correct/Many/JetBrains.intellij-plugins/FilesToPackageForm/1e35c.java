diff --git a/flex/src/com/intellij/lang/javascript/flex/actions/FilesToPackageForm.java b/flex/src/com/intellij/lang/javascript/flex/actions/FilesToPackageForm.java
index 8877e83..d5f16ff 100644
--- a/flex/src/com/intellij/lang/javascript/flex/actions/FilesToPackageForm.java
+++ b/flex/src/com/intellij/lang/javascript/flex/actions/FilesToPackageForm.java
@@ -204,7 +204,7 @@
   }
 
   public boolean isModified(final List<FilePathAndPathInPackage> filesToPackage) {
-    return FlexUtils.equalLists(filesToPackage, myFilesToPackage);
+    return !FlexUtils.equalLists(filesToPackage, myFilesToPackage);
   }
 
   public void applyTo(final List<FilePathAndPathInPackage> filesToPackage) {
