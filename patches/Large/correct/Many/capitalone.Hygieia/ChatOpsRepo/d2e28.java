diff --git a/chat-ops-collector/src/main/java/com/capitalone/dashboard/model/ChatOpsRepo.java b/chat-ops-collector/src/main/java/com/capitalone/dashboard/model/ChatOpsRepo.java
index d0e0406..46bed84 100755
--- a/chat-ops-collector/src/main/java/com/capitalone/dashboard/model/ChatOpsRepo.java
+++ b/chat-ops-collector/src/main/java/com/capitalone/dashboard/model/ChatOpsRepo.java
@@ -43,7 +43,7 @@
         	return false;
         }
 
-        return getChatopsServerUrl().equals(ChatOpsRepo.getChatopsServerUrl()) & getChatopsServerUrl().equals(ChatOpsRepo.getChatopsServerUrl()) & getChatopsAuthToken().equals(ChatOpsRepo.getChatopsAuthToken());
+        return getChatopsServerUrl().equals(ChatOpsRepo.getChatopsServerUrl()) && getChatopsServerUrl().equals(ChatOpsRepo.getChatopsServerUrl()) && getChatopsAuthToken().equals(ChatOpsRepo.getChatopsAuthToken());
     }
 
     @Override
