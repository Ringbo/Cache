diff --git a/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-framework-core/src/main/java/org/apache/nifi/controller/FlowController.java b/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-framework-core/src/main/java/org/apache/nifi/controller/FlowController.java
index a3246fd..73cdea1 100644
--- a/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-framework-core/src/main/java/org/apache/nifi/controller/FlowController.java
+++ b/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-framework-core/src/main/java/org/apache/nifi/controller/FlowController.java
@@ -3397,7 +3397,7 @@
             .addParentUuid(parentUUID)
             .setFlowFileUUID(parentUUID)
             .setAttributes(Collections.<String, String> emptyMap(), flowFileRecord.getAttributes())
-            .setCurrentContentClaim(event.getContentClaimSection(), event.getContentClaimContainer(), event.getContentClaimIdentifier(), event.getContentClaimOffset(), event.getFileSize())
+            .setCurrentContentClaim(event.getContentClaimContainer(), event.getContentClaimSection(), event.getContentClaimIdentifier(), event.getContentClaimOffset(), event.getFileSize())
             .setDetails("Replay requested by " + requestor)
             .setEventTime(System.currentTimeMillis())
             .setFlowFileEntryDate(System.currentTimeMillis())
