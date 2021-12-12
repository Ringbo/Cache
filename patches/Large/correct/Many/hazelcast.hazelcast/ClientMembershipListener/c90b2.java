diff --git a/hazelcast-client-new/src/main/java/com/hazelcast/client/spi/impl/ClientMembershipListener.java b/hazelcast-client-new/src/main/java/com/hazelcast/client/spi/impl/ClientMembershipListener.java
index 6a8b0b4..ba8552e 100644
--- a/hazelcast-client-new/src/main/java/com/hazelcast/client/spi/impl/ClientMembershipListener.java
+++ b/hazelcast-client-new/src/main/java/com/hazelcast/client/spi/impl/ClientMembershipListener.java
@@ -101,7 +101,7 @@
 
     private void waitInitialMemberListFetched() throws InterruptedException {
         boolean success = initialListFetchedLatch.await(INITIAL_MEMBERS_TIMEOUT_SECONDS, TimeUnit.SECONDS);
-        if (success) {
+        if (!success) {
             LOGGER.warning("Error while getting initial member list from cluster!");
         }
     }
