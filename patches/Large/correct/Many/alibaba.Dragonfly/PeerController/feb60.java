diff --git a/src/supernode/src/main/java/com/alibaba/dragonfly/supernode/rest/controller/PeerController.java b/src/supernode/src/main/java/com/alibaba/dragonfly/supernode/rest/controller/PeerController.java
index 739058a..df2f80f 100644
--- a/src/supernode/src/main/java/com/alibaba/dragonfly/supernode/rest/controller/PeerController.java
+++ b/src/supernode/src/main/java/com/alibaba/dragonfly/supernode/rest/controller/PeerController.java
@@ -121,7 +121,7 @@
             String taskId = req.getTaskId();
             String cid = req.getCid();
             String dstCid = req.getDstCid();
-            String range = req.getRange();
+            String range = req.getPieceRange();
 
             if (StringUtils.isBlank(taskId) || StringUtils.isBlank(cid)
                 || StringUtils.isBlank(range)) {
