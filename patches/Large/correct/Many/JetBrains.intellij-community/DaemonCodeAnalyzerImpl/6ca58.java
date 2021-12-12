diff --git a/source/com/intellij/codeInsight/daemon/impl/DaemonCodeAnalyzerImpl.java b/source/com/intellij/codeInsight/daemon/impl/DaemonCodeAnalyzerImpl.java
index d2803c0..2144dfb 100644
--- a/source/com/intellij/codeInsight/daemon/impl/DaemonCodeAnalyzerImpl.java
+++ b/source/com/intellij/codeInsight/daemon/impl/DaemonCodeAnalyzerImpl.java
@@ -265,7 +265,7 @@
 
     IdeFrame frame = ((WindowManagerEx)WindowManager.getInstance()).getFrame(myProject);
     if (frame != null) {
-      frame.addWindowFocusListener(myIdeFrameFocusListener);
+      frame.removeWindowFocusListener(myIdeFrameFocusListener);
     }
   }
 
