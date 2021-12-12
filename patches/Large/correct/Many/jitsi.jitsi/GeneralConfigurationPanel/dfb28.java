diff --git a/src/net/java/sip/communicator/plugin/generalconfig/GeneralConfigurationPanel.java b/src/net/java/sip/communicator/plugin/generalconfig/GeneralConfigurationPanel.java
index d913ba6..5958fbf 100644
--- a/src/net/java/sip/communicator/plugin/generalconfig/GeneralConfigurationPanel.java
+++ b/src/net/java/sip/communicator/plugin/generalconfig/GeneralConfigurationPanel.java
@@ -623,7 +623,7 @@
     {
         JPanel checkBoxPanel = new TransparentPanel(new BorderLayout());
 
-        JCheckBox formatPhoneNumber = new JCheckBox("",
+        SIPCommCheckBox formatPhoneNumber = new SIPCommCheckBox("",
             ConfigurationManager.isNormalizePhoneNumber());
 
         formatPhoneNumber.setAlignmentY(Component.TOP_ALIGNMENT);
