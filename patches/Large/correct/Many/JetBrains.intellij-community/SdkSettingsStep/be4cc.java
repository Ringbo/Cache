diff --git a/java/idea-ui/src/com/intellij/ide/util/projectWizard/SdkSettingsStep.java b/java/idea-ui/src/com/intellij/ide/util/projectWizard/SdkSettingsStep.java
index feda049..49e43f0 100644
--- a/java/idea-ui/src/com/intellij/ide/util/projectWizard/SdkSettingsStep.java
+++ b/java/idea-ui/src/com/intellij/ide/util/projectWizard/SdkSettingsStep.java
@@ -97,7 +97,7 @@
                                  null,
                                  false);
 
-    myJdkPanel.add(myJdkComboBox, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, CENTER, HORIZONTAL, JBUI.insetsLeft(4), 0, 0));
+    myJdkPanel.add(myJdkComboBox, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, CENTER, HORIZONTAL, JBUI.emptyInsets(), 0, 0));
     myJdkPanel.add(myJdkComboBox.getSetUpButton(), new GridBagConstraints(1, 0, 1, 1, 0, 0, WEST, NONE, JBUI.insetsLeft(4), 0, 0));
   }
 
