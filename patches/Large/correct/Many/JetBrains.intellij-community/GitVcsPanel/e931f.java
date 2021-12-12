diff --git a/plugins/git4idea/src/git4idea/config/GitVcsPanel.java b/plugins/git4idea/src/git4idea/config/GitVcsPanel.java
index 6eedc15..d031d59 100644
--- a/plugins/git4idea/src/git4idea/config/GitVcsPanel.java
+++ b/plugins/git4idea/src/git4idea/config/GitVcsPanel.java
@@ -164,7 +164,7 @@
            !crlfPolicyItem(settings).equals(myConvertTextFilesComboBox.getSelectedItem()) ||
            !settings.autoUpdateIfPushRejected() == myAutoUpdateIfPushRejected.isSelected() ||
            ((settings.getSyncSetting() == GitBranchSyncSetting.SYNC) != mySyncBranchControl.isSelected() ||
-           settings.isAutoCommitOnCherryPick() == myAutoCommitOnCherryPick.isSelected());
+           settings.isAutoCommitOnCherryPick() != myAutoCommitOnCherryPick.isSelected());
   }
 
   /**
