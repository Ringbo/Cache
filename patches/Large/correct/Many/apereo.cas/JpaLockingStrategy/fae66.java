diff --git a/cas-server-support-jpa-ticket-registry/src/main/java/org/jasig/cas/ticket/registry/support/JpaLockingStrategy.java b/cas-server-support-jpa-ticket-registry/src/main/java/org/jasig/cas/ticket/registry/support/JpaLockingStrategy.java
index 50352e0..7c26d19 100644
--- a/cas-server-support-jpa-ticket-registry/src/main/java/org/jasig/cas/ticket/registry/support/JpaLockingStrategy.java
+++ b/cas-server-support-jpa-ticket-registry/src/main/java/org/jasig/cas/ticket/registry/support/JpaLockingStrategy.java
@@ -102,12 +102,12 @@
 
         boolean result = false;
         if (lock != null) {
-            final ZonedDateTime expDate = ZonedDateTime.from(lock.getExpirationDate());
+            final ZonedDateTime expDate = lock.getExpirationDate();
             if (lock.getUniqueId() == null) {
                 // No one currently possesses lock
                 logger.debug("{} trying to acquire {} lock.", uniqueId, applicationId);
                 result = acquire(entityManager, lock);
-            } else if (ZonedDateTime.now(ZoneOffset.UTC).isAfter(expDate)) {
+            } else if (expDate == null || ZonedDateTime.now(ZoneOffset.UTC).isAfter(expDate)) {
                 // Acquire expired lock regardless of who formerly owned it
                 logger.debug("{} trying to acquire expired {} lock.", uniqueId, applicationId);
                 result = acquire(entityManager, lock);
