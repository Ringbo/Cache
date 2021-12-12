diff --git a/src/net/java/sip/communicator/util/ConferenceInfoDocument.java b/src/net/java/sip/communicator/util/ConferenceInfoDocument.java
index b39991b..f3247ae 100644
--- a/src/net/java/sip/communicator/util/ConferenceInfoDocument.java
+++ b/src/net/java/sip/communicator/util/ConferenceInfoDocument.java
@@ -228,7 +228,7 @@
             throw(e);
         }
 
-        conferenceInfo = document.getElementById(CONFERENCE_INFO_ELEMENT_NAME);
+        conferenceInfo = document.getDocumentElement();
         if (conferenceInfo == null)
         {
             throw(new Exception("Could not parse conference-info document,"
