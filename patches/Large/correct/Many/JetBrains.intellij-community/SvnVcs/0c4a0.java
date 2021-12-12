diff --git a/plugins/svn4idea/src/org/jetbrains/idea/svn/SvnVcs.java b/plugins/svn4idea/src/org/jetbrains/idea/svn/SvnVcs.java
index c0781e3..54e0fcf 100644
--- a/plugins/svn4idea/src/org/jetbrains/idea/svn/SvnVcs.java
+++ b/plugins/svn4idea/src/org/jetbrains/idea/svn/SvnVcs.java
@@ -215,7 +215,7 @@
     }
 
     // do one time after project loaded
-    startupManager.registerPostStartupActivity(new DumbAwareRunnable() {
+    startupManager.runWhenProjectIsInitialized(new DumbAwareRunnable() {
       public void run() {
         postStartup();
 
