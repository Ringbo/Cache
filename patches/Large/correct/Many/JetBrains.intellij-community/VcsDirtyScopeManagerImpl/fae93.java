diff --git a/source/com/intellij/openapi/vcs/changes/VcsDirtyScopeManagerImpl.java b/source/com/intellij/openapi/vcs/changes/VcsDirtyScopeManagerImpl.java
index 73d4e1b..9eecc67 100644
--- a/source/com/intellij/openapi/vcs/changes/VcsDirtyScopeManagerImpl.java
+++ b/source/com/intellij/openapi/vcs/changes/VcsDirtyScopeManagerImpl.java
@@ -59,7 +59,7 @@
 
     if (ApplicationManager.getApplication().isUnitTestMode()) {
       myIsInitialized = true;
-      markEverythingDirty();
+      dirDirtyRecursively(myProject.getBaseDir(), true);
     }
     else {
       StartupManager.getInstance(myProject).registerPostStartupActivity(new Runnable() {
