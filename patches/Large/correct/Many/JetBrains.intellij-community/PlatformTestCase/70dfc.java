diff --git a/platform/testFramework/src/com/intellij/testFramework/PlatformTestCase.java b/platform/testFramework/src/com/intellij/testFramework/PlatformTestCase.java
index 93565e8..86738af 100644
--- a/platform/testFramework/src/com/intellij/testFramework/PlatformTestCase.java
+++ b/platform/testFramework/src/com/intellij/testFramework/PlatformTestCase.java
@@ -264,7 +264,7 @@
 
   @NotNull
   public static Project createProject(@NotNull String path, String creationPlace) {
-    return createProject(path, creationPlace, true);
+    return createProject(path, creationPlace, false);
   }
 
   @NotNull
