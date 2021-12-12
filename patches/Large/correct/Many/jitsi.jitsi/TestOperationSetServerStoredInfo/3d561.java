diff --git a/test/net/java/sip/communicator/slick/protocol/sip/TestOperationSetServerStoredInfo.java b/test/net/java/sip/communicator/slick/protocol/sip/TestOperationSetServerStoredInfo.java
index 4aa9631..84eb8ef 100644
--- a/test/net/java/sip/communicator/slick/protocol/sip/TestOperationSetServerStoredInfo.java
+++ b/test/net/java/sip/communicator/slick/protocol/sip/TestOperationSetServerStoredInfo.java
@@ -113,7 +113,7 @@
     {
         super.tearDown();
         fixture.tearDown();
-        xCapClient.dicsonnect();
+        xCapClient.disconnect();
     }
 
     /**
