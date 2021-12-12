diff --git a/src/net/java/sip/communicator/plugin/generalconfig/GeneralConfigurationPanel.java b/src/net/java/sip/communicator/plugin/generalconfig/GeneralConfigurationPanel.java
index 03fc308..f5b97c9 100644
--- a/src/net/java/sip/communicator/plugin/generalconfig/GeneralConfigurationPanel.java
+++ b/src/net/java/sip/communicator/plugin/generalconfig/GeneralConfigurationPanel.java
@@ -266,7 +266,7 @@
                 boolean value = ((JCheckBox) e.getSource()).isSelected();
                 ConfigurationUtils.setIsMinimizeInsteadOfHide(value);
                 UtilActivator.getUIService().setMainWindowCanHide(
-                    !UtilActivator.getSystrayService().checkInitialized());
+                    UtilActivator.getSystrayService().checkInitialized());
             }
         });
 
