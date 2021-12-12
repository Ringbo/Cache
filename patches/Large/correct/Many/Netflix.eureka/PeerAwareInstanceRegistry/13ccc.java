diff --git a/eureka-core/src/main/java/com/netflix/eureka/PeerAwareInstanceRegistry.java b/eureka-core/src/main/java/com/netflix/eureka/PeerAwareInstanceRegistry.java
index 0acae98..047b4fa 100644
--- a/eureka-core/src/main/java/com/netflix/eureka/PeerAwareInstanceRegistry.java
+++ b/eureka-core/src/main/java/com/netflix/eureka/PeerAwareInstanceRegistry.java
@@ -674,14 +674,14 @@
     }
 
     /**
-     * Checks if the number of renewals is lesser than threshold.
+     * Checks if the number of renewals is lesser than threshold. This method is for servo metrics only.
      *
      * @return 0 if the renewals are greater than threshold, 1 otherwise.
      */
     @com.netflix.servo.annotations.Monitor(name = "isBelowRenewThreshold", description = "0 = false, 1 = true",
             type = com.netflix.servo.annotations.DataSourceType.GAUGE)
     public int isBelowRenewThresold() {
-        if ((getNumOfRenewsInLastMin() < numberOfRenewsPerMinThreshold)
+        if ((getNumOfRenewsInLastMin() <= numberOfRenewsPerMinThreshold)
                 && ((this.startupTime > 0) && (System.currentTimeMillis() > this.startupTime
                 + (EUREKA_SERVER_CONFIG.getWaitTimeInMsWhenSyncEmpty())))) {
             return 1;
