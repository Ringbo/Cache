diff --git a/core/server/common/src/main/java/alluxio/master/journal/raft/JournalStateMachine.java b/core/server/common/src/main/java/alluxio/master/journal/raft/JournalStateMachine.java
index ae2d441..4f5b02f 100644
--- a/core/server/common/src/main/java/alluxio/master/journal/raft/JournalStateMachine.java
+++ b/core/server/common/src/main/java/alluxio/master/journal/raft/JournalStateMachine.java
@@ -48,7 +48,7 @@
  */
 @ThreadSafe
 public class JournalStateMachine extends StateMachine implements Snapshottable {
-  private static final Logger LOG = LoggerFactory.getLogger(RaftJournalSystem.class);
+  private static final Logger LOG = LoggerFactory.getLogger(JournalStateMachine.class);
 
   private final Map<String, RaftJournal> mJournals;
   @GuardedBy("this")
@@ -136,7 +136,10 @@
     }
     long newSN = entry.getSequenceNumber();
     if (newSN < mNextSequenceNumberToRead) {
-      LOG.info("Ignoring duplicate journal entry with SN {} when next SN is {}", newSN,
+      // This can happen due to retried writes. For example, if flushing [3, 4] fails, we will
+      // retry, and the log may end up looking like [1, 2, 3, 4, 3, 4] if the original request
+      // eventually succeeds. Once we've read the first "4", we must ignore the next two entries.
+      LOG.debug("Ignoring duplicate journal entry with SN {} when next SN is {}", newSN,
           mNextSequenceNumberToRead);
       return;
     }
