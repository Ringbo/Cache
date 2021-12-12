diff --git a/platform/lang-impl/src/com/intellij/execution/ui/layout/impl/RunnerContentUi.java b/platform/lang-impl/src/com/intellij/execution/ui/layout/impl/RunnerContentUi.java
index a09b4ab..109ff6f 100644
--- a/platform/lang-impl/src/com/intellij/execution/ui/layout/impl/RunnerContentUi.java
+++ b/platform/lang-impl/src/com/intellij/execution/ui/layout/impl/RunnerContentUi.java
@@ -1382,7 +1382,7 @@
     public MyComponent() {
       setOpaque(true);
       setFocusCycleRoot(true);
-      setBorder(new ToolWindow.Border(true, false, false, false));
+      setBorder(new ToolWindow.Border(false, false, false, false));
     }
 
     @Override
