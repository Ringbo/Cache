diff --git a/src/net/java/sip/communicator/plugin/simpleaccreg/SimpleAccountRegistrationActivator.java b/src/net/java/sip/communicator/plugin/simpleaccreg/SimpleAccountRegistrationActivator.java
index 47180c8..e945fa5 100644
--- a/src/net/java/sip/communicator/plugin/simpleaccreg/SimpleAccountRegistrationActivator.java
+++ b/src/net/java/sip/communicator/plugin/simpleaccreg/SimpleAccountRegistrationActivator.java
@@ -84,7 +84,7 @@
 
             for (int j = 0; j < accountsList.size(); j++)
             {
-                accountID = (AccountID) accountsList.get(i);
+                accountID = (AccountID) accountsList.get(j);
 
                 boolean isHidden = 
                     accountID.getAccountProperties()
