diff --git a/server/sonar-ce/src/main/java/org/sonar/ce/app/CeServer.java b/server/sonar-ce/src/main/java/org/sonar/ce/app/CeServer.java
index 3488766..532d5b5 100644
--- a/server/sonar-ce/src/main/java/org/sonar/ce/app/CeServer.java
+++ b/server/sonar-ce/src/main/java/org/sonar/ce/app/CeServer.java
@@ -109,7 +109,7 @@
       while (!stopAwait) {
         try {
           // wait for a quite long time but we will be interrupted if flag changes anyway
-          Thread.sleep(10000);
+          Thread.sleep(10_000);
         } catch (InterruptedException e) {
           // continue and check the flag
         }
