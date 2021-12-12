diff --git a/platform/lang-impl/src/com/intellij/ide/projectView/ProjectViewSettings.java b/platform/lang-impl/src/com/intellij/ide/projectView/ProjectViewSettings.java
index bf3b35e..cf509973 100644
--- a/platform/lang-impl/src/com/intellij/ide/projectView/ProjectViewSettings.java
+++ b/platform/lang-impl/src/com/intellij/ide/projectView/ProjectViewSettings.java
@@ -40,7 +40,7 @@
       if (object == this) return true;
       if (!super.equals(object)) return false;
       ProjectViewSettings settings = (ProjectViewSettings)object;
-      return settings.isShowExcludedFiles() == isShowExcludedFiles() ||
+      return settings.isShowExcludedFiles() == isShowExcludedFiles() &&
              settings.isUseFileNestingRules() == isUseFileNestingRules();
     }
 
