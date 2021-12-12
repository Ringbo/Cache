diff --git a/src/net/java/sip/communicator/util/ConferenceInfoDocument.java b/src/net/java/sip/communicator/util/ConferenceInfoDocument.java
index e8273cd..5ad16e5 100644
--- a/src/net/java/sip/communicator/util/ConferenceInfoDocument.java
+++ b/src/net/java/sip/communicator/util/ConferenceInfoDocument.java
@@ -188,7 +188,7 @@
         setUserCount(0);
 
         users = document.createElement(USERS_ELEMENT_NAME);
-        conferenceState.appendChild(users);
+        conferenceInfo.appendChild(users);
     }
 
     /**
