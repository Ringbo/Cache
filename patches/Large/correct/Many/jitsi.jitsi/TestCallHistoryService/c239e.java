diff --git a/test/net/java/sip/communicator/slick/callhistory/TestCallHistoryService.java b/test/net/java/sip/communicator/slick/callhistory/TestCallHistoryService.java
index 9766180..19be609 100644
--- a/test/net/java/sip/communicator/slick/callhistory/TestCallHistoryService.java
+++ b/test/net/java/sip/communicator/slick/callhistory/TestCallHistoryService.java
@@ -220,14 +220,14 @@
 
         assertTrue("Participant incorrect ",
                    participant.getParticipantAddress().
-                   equals(participantAddresses.get(1)));
+                   equals(participantAddresses.get(2)));
 
         rec = (CallRecord)resultIter.next();
         participant = (CallParticipantRecord)rec.getParticipantRecords().get(0);
 
         assertTrue("Participant incorrect ",
                    participant.getParticipantAddress().
-                   equals(participantAddresses.get(2)));
+                   equals(participantAddresses.get(1)));
 
         /**
          * must find 1 record
@@ -257,7 +257,7 @@
 
         assertTrue("Participant incorrect ",
                    participant.getParticipantAddress().
-                   equals(participantAddresses.get(1)));
+                   equals(participantAddresses.get(3)));
 
         rec = (CallRecord)resultIter.next();
         participant = (CallParticipantRecord) rec.getParticipantRecords().get(0);
@@ -271,7 +271,7 @@
 
         assertTrue("Participant incorrect ",
                    participant.getParticipantAddress().
-                   equals(participantAddresses.get(3)));
+                   equals(participantAddresses.get(1)));
     }
 
     public void checkRecordCompleteness()
