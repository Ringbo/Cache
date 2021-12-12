diff --git a/platform/testFramework/src/com/intellij/testFramework/PlatformTestCase.java b/platform/testFramework/src/com/intellij/testFramework/PlatformTestCase.java
index 83d4914..8273aa4 100644
--- a/platform/testFramework/src/com/intellij/testFramework/PlatformTestCase.java
+++ b/platform/testFramework/src/com/intellij/testFramework/PlatformTestCase.java
@@ -177,7 +177,7 @@
     assertNotNull("Cannot instantiate ProjectManager component", myProjectManager);
 
     File projectFile = getIprFile();
-    assert LocalFileSystem.getInstance().findFileByIoFile(projectFile) != null;
+    assert LocalFileSystem.getInstance().refreshAndFindFileByIoFile(projectFile) != null;
 
     myProject = createProject(projectFile, getClass().getName() + "." + getName());
 
