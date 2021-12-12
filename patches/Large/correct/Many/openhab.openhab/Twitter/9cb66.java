diff --git a/bundles/action/org.openhab.action.twitter/src/main/java/org/openhab/action/twitter/internal/Twitter.java b/bundles/action/org.openhab.action.twitter/src/main/java/org/openhab/action/twitter/internal/Twitter.java
index eecc57c..5f48f69 100644
--- a/bundles/action/org.openhab.action.twitter/src/main/java/org/openhab/action/twitter/internal/Twitter.java
+++ b/bundles/action/org.openhab.action.twitter/src/main/java/org/openhab/action/twitter/internal/Twitter.java
@@ -115,7 +115,7 @@
         if (!checkPrerequisites()) {
             return false;
         }
-        return doSendTweet(tweetTxt, null);
+        return sendTweet(tweetTxt, (File)null);
     }
 
     /**
@@ -167,7 +167,7 @@
         }
     
         // send the Tweet
-        final boolean result = sendTweet(tweetTxt, fileToAttach);
+        boolean result = sendTweet(tweetTxt, fileToAttach);
         // delete temp file (if needed)
         if (deleteTemporaryFile) {
         	FileUtils.deleteQuietly(fileToAttach);
