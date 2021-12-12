diff --git a/cas-server-support-jpa-ticket-registry/src/main/java/org/jasig/cas/ticket/registry/support/JpaLockingStrategy.java b/cas-server-support-jpa-ticket-registry/src/main/java/org/jasig/cas/ticket/registry/support/JpaLockingStrategy.java
index e2b8262..39af8ff 100644
--- a/cas-server-support-jpa-ticket-registry/src/main/java/org/jasig/cas/ticket/registry/support/JpaLockingStrategy.java
+++ b/cas-server-support-jpa-ticket-registry/src/main/java/org/jasig/cas/ticket/registry/support/JpaLockingStrategy.java
@@ -95,7 +95,7 @@
 
     @Override
     public boolean acquire() {
-        Lock lock;
+        final Lock lock;
         try {
             lock = entityManager.find(Lock.class, applicationId, LockModeType.PESSIMISTIC_WRITE);
         } catch (final PersistenceException e) {
