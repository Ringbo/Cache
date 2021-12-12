diff --git a/plugins/git4idea/src/git4idea/push/GitPushTargetPanel.java b/plugins/git4idea/src/git4idea/push/GitPushTargetPanel.java
index 40eaf69..aa03697 100644
--- a/plugins/git4idea/src/git4idea/push/GitPushTargetPanel.java
+++ b/plugins/git4idea/src/git4idea/push/GitPushTargetPanel.java
@@ -182,7 +182,7 @@
 
   @Override
   public void fireOnChange() {
-    if (myError == null) {
+    if (myError != null) {
       return;
     }
     String remoteName = myRemoteLabel.getText();
