diff --git a/plugins/hg4idea/src/org/zmlx/hg4idea/HgVcs.java b/plugins/hg4idea/src/org/zmlx/hg4idea/HgVcs.java
index 9c49696..98f4263 100644
--- a/plugins/hg4idea/src/org/zmlx/hg4idea/HgVcs.java
+++ b/plugins/hg4idea/src/org/zmlx/hg4idea/HgVcs.java
@@ -257,7 +257,7 @@
    */
   @NotNull
   public File getPromptHooksExtensionFile() {
-    if (myPromptHooksExtensionFile == null) {
+    if (myPromptHooksExtensionFile == null || !myPromptHooksExtensionFile.exists()) {
       // check that hooks are available
       myPromptHooksExtensionFile = HgUtil.getTemporaryPythonFile("prompthooks");
       if (myPromptHooksExtensionFile == null || !myPromptHooksExtensionFile.exists()) {
