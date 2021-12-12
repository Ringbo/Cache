diff --git a/src/net/java/sip/communicator/plugin/simpleaccreg/InitialAccountRegistrationFrame.java b/src/net/java/sip/communicator/plugin/simpleaccreg/InitialAccountRegistrationFrame.java
index 59a6f64..12f0fb4 100644
--- a/src/net/java/sip/communicator/plugin/simpleaccreg/InitialAccountRegistrationFrame.java
+++ b/src/net/java/sip/communicator/plugin/simpleaccreg/InitialAccountRegistrationFrame.java
@@ -94,7 +94,7 @@
         this.initAccountWizards();
         
         // Create the default group
-        String groupName = Resources.getString("defaultGroupName");
+        String groupName = Resources.getApplicationProperty("defaultGroupName");
         
         if(groupName != null && groupName.length() > 0)
         {            
