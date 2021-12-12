diff --git a/src/test/java/com/github/dockerjava/core/command/PullImageCmdImplTest.java b/src/test/java/com/github/dockerjava/core/command/PullImageCmdImplTest.java
index 43291f0..861c107 100644
--- a/src/test/java/com/github/dockerjava/core/command/PullImageCmdImplTest.java
+++ b/src/test/java/com/github/dockerjava/core/command/PullImageCmdImplTest.java
@@ -49,7 +49,7 @@
 
     @Test
     public void nullAuthConfig() throws Exception {
-        PullImageCmdImpl pullImageCmd = new PullImageCmdImpl(NOP_EXEC, "");
+        PullImageCmdImpl pullImageCmd = new PullImageCmdImpl(NOP_EXEC, null, "");
         try {
             pullImageCmd.withAuthConfig(null);
             fail();
