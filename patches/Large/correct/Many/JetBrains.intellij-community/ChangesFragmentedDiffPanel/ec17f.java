diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/ChangesFragmentedDiffPanel.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/ChangesFragmentedDiffPanel.java
index e6337cf..256384d 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/ChangesFragmentedDiffPanel.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/ChangesFragmentedDiffPanel.java
@@ -588,7 +588,7 @@
 
     private PopupAction() {
       super("Settings", "Settings", IconLoader.getIcon("/general/secondaryGroup.png"));
-      myUsual = new AnAction("Top | Bottom") {
+      myUsual = new AnAction("Top | Bottom", "", VcsUtil.ourNotDot) {
         @Override
         public void actionPerformed(AnActionEvent e) {
           boolean was = myConfiguration.SHORT_DIFF_HORISONTALLY;
@@ -602,7 +602,7 @@
           e.getPresentation().setIcon(myConfiguration.SHORT_DIFF_HORISONTALLY ? VcsUtil.ourNotDot : VcsUtil.ourDot);
         }
       };
-      myNumbered = new AnAction("Left | Right") {
+      myNumbered = new AnAction("Left | Right", "", VcsUtil.ourNotDot) {
         @Override
         public void actionPerformed(AnActionEvent e) {
           boolean was = myConfiguration.SHORT_DIFF_HORISONTALLY;
@@ -755,7 +755,7 @@
     private final Icon myIcon;
 
     private MyUseSoftWrapsAction(boolean turned) {
-      super("Use soft wraps");
+      super("Use soft wraps", "", ourIcon);
       myIcon = ourIcon;
     }
 
