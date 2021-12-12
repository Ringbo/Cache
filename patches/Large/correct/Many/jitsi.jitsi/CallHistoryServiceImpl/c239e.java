diff --git a/src/net/java/sip/communicator/impl/callhistory/CallHistoryServiceImpl.java b/src/net/java/sip/communicator/impl/callhistory/CallHistoryServiceImpl.java
index a1aba99..62ff3cb 100644
--- a/src/net/java/sip/communicator/impl/callhistory/CallHistoryServiceImpl.java
+++ b/src/net/java/sip/communicator/impl/callhistory/CallHistoryServiceImpl.java
@@ -371,7 +371,7 @@
         for (int i = 0; i < callParticipantIDs.size(); i++)
         {
 
-            CallParticipantRecord cpr = new CallParticipantRecord(
+            CallParticipantRecordImpl cpr = new CallParticipantRecordImpl(
                 (String)callParticipantIDs.get(i),
                 new Date(Long.parseLong((String)callParticipantStart.get(i))),
                 new Date(Long.parseLong((String)callParticipantEnd.get(i)))
@@ -756,7 +756,7 @@
         if(callRecord == null)
             return;
 
-        CallParticipantRecord newRec = new CallParticipantRecord(
+        CallParticipantRecordImpl newRec = new CallParticipantRecordImpl(
             callParticipant.getAddress(),
             new Date(),
             null);
