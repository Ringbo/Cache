diff --git a/src/test/java/org/tron/core/witness/ProposalControllerTest.java b/src/test/java/org/tron/core/witness/ProposalControllerTest.java
index f7622bb..2b6ef21 100644
--- a/src/test/java/org/tron/core/witness/ProposalControllerTest.java
+++ b/src/test/java/org/tron/core/witness/ProposalControllerTest.java
@@ -151,9 +151,9 @@
     dbManager.getProposalStore().put(proposalCapsule4.createDbKey(), proposalCapsule4);
     dbManager.getProposalStore().put(proposalCapsule5.createDbKey(), proposalCapsule5);
 
-    long currentMaintenanceTime = 10000L;
+    dbManager.getDynamicPropertiesStore().updateNextMaintenanceTime(10000L);
 
-    proposalController.processProposals(currentMaintenanceTime);
+    proposalController.processProposals();
 
     try {
       proposalCapsule3 = dbManager.getProposalStore().get(proposalCapsule3.createDbKey());
