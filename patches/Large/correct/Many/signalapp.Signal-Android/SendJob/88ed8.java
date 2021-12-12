diff --git a/src/org/thoughtcrime/securesms/jobs/SendJob.java b/src/org/thoughtcrime/securesms/jobs/SendJob.java
index 3d8ad73..51d62b5 100644
--- a/src/org/thoughtcrime/securesms/jobs/SendJob.java
+++ b/src/org/thoughtcrime/securesms/jobs/SendJob.java
@@ -53,7 +53,11 @@
     } catch (MmsException me) {
       throw new UndeliverableMessageException(me);
     }
-    return new SendReq(message.getPduHeaders(), body);
+    return new SendReq(message.getPduHeaders(),
+                       body,
+                       message.getDatabaseMessageId(),
+                       message.getDatabaseMessageBox(),
+                       message.getSentTimestamp());
   }
 
   private PduPart getResolvedPart(MasterSecret masterSecret, MediaConstraints constraints,
