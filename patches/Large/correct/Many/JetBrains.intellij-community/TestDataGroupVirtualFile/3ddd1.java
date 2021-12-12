diff --git a/plugins/devkit/src/testAssistant/vfs/TestDataGroupVirtualFile.java b/plugins/devkit/src/testAssistant/vfs/TestDataGroupVirtualFile.java
index 183219f..b1aa9d9 100644
--- a/plugins/devkit/src/testAssistant/vfs/TestDataGroupVirtualFile.java
+++ b/plugins/devkit/src/testAssistant/vfs/TestDataGroupVirtualFile.java
@@ -42,7 +42,7 @@
   @NotNull
   @Override
   public String getName() {
-    return myAfterFile.getName() + " | " + myAfterFile.getName();
+    return myBeforeFile.getName() + " | " + myAfterFile.getName();
   }
 
   @NotNull
