diff --git a/smack-core/src/main/java/org/jivesoftware/smack/SynchronizationPoint.java b/smack-core/src/main/java/org/jivesoftware/smack/SynchronizationPoint.java
index 73d4e8b..78918a0 100644
--- a/smack-core/src/main/java/org/jivesoftware/smack/SynchronizationPoint.java
+++ b/smack-core/src/main/java/org/jivesoftware/smack/SynchronizationPoint.java
@@ -153,7 +153,7 @@
         connectionLock.lock();
         try {
             state = State.Success;
-            condition.signal();
+            condition.signalAll();
         }
         finally {
             connectionLock.unlock();
@@ -174,7 +174,7 @@
         try {
             state = State.Failure;
             this.failureException = failureException;
-            condition.signal();
+            condition.signalAll();
         }
         finally {
             connectionLock.unlock();
