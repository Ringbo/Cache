diff --git a/java/org/apache/catalina/ha/session/DeltaManager.java b/java/org/apache/catalina/ha/session/DeltaManager.java
index 0e46482..c6f3aec 100644
--- a/java/org/apache/catalina/ha/session/DeltaManager.java
+++ b/java/org/apache/catalina/ha/session/DeltaManager.java
@@ -880,7 +880,7 @@
                      receiverQueue = true ;
                 }
                 cluster.send(msg, mbr);
-                if (log.isWarnEnabled()) log.warn(sm.getString("deltaManager.waitForSessionState",getName(), mbr));
+                if (log.isWarnEnabled()) log.warn(sm.getString("deltaManager.waitForSessionState",getName(), mbr,getStateTransferTimeout()));
                 // FIXME At sender ack mode this method check only the state transfer and resend is a problem!
                 waitForSendAllSessions(beforeSendTime);
             } finally {
