diff --git a/lts-jobtracker/src/main/java/com/lts/jobtracker/complete/chain/JobProcessChain.java b/lts-jobtracker/src/main/java/com/lts/jobtracker/complete/chain/JobProcessChain.java
index 334db29..fa5dfcb 100644
--- a/lts-jobtracker/src/main/java/com/lts/jobtracker/complete/chain/JobProcessChain.java
+++ b/lts-jobtracker/src/main/java/com/lts/jobtracker/complete/chain/JobProcessChain.java
@@ -89,7 +89,7 @@
             }
         } else {
             // 需要retry
-            jobFinishHandler.onComplete(results);
+            retryHandler.onComplete(results);
         }
     }
 
