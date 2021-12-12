diff --git a/platform/lang-impl/src/com/intellij/ide/projectView/impl/nodes/ProjectViewDirectoryHelper.java b/platform/lang-impl/src/com/intellij/ide/projectView/impl/nodes/ProjectViewDirectoryHelper.java
index 55f2e50..6964f0a 100644
--- a/platform/lang-impl/src/com/intellij/ide/projectView/impl/nodes/ProjectViewDirectoryHelper.java
+++ b/platform/lang-impl/src/com/intellij/ide/projectView/impl/nodes/ProjectViewDirectoryHelper.java
@@ -146,10 +146,10 @@
       if (settings == null) return false; // unexpected
       if (!settings.isFlattenPackages() && settings.isHideEmptyMiddlePackages()) {
         if (element instanceof PsiDirectory) {
-          if (getParents(directory, owner).first(dir -> Comparing.equal(element, dir)) != null) return true;
+          if (getParents(directory, owner).find(dir -> Comparing.equal(element, dir)) != null) return true;
         }
         else if (element instanceof VirtualFile) {
-          if (getParents(directory, owner).first(dir -> Comparing.equal(element, dir.getVirtualFile())) != null) return true;
+          if (getParents(directory, owner).find(dir -> Comparing.equal(element, dir.getVirtualFile())) != null) return true;
         }
       }
     }
