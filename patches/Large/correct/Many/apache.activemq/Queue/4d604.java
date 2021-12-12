diff --git a/activemq-core/src/main/java/org/apache/activemq/broker/region/Queue.java b/activemq-core/src/main/java/org/apache/activemq/broker/region/Queue.java
index 91c9e52..830dd22 100755
--- a/activemq-core/src/main/java/org/apache/activemq/broker/region/Queue.java
+++ b/activemq-core/src/main/java/org/apache/activemq/broker/region/Queue.java
@@ -245,13 +245,13 @@
             if( sub instanceof QueueBrowserSubscription ) {
                 ((QueueBrowserSubscription)sub).incrementQueueRef();
             }
-            if (!this.optimizedDispatch) {
+            if (!(this.optimizedDispatch || isSlave())) {
                 wakeup();
             }
         }finally {
             dispatchLock.unlock();
         }
-        if (this.optimizedDispatch) {
+        if (this.optimizedDispatch || isSlave()) {
             // Outside of dispatchLock() to maintain the lock hierarchy of
             // iteratingMutex -> dispatchLock. - see https://issues.apache.org/activemq/browse/AMQ-1878
             wakeup();
@@ -307,13 +307,13 @@
             if (consumers.isEmpty()) {
                 messages.gc();
             }
-            if (!this.optimizedDispatch) {
+            if (!(this.optimizedDispatch || isSlave())) {
                 wakeup();
             }
         }finally {
             dispatchLock.unlock();
         }
-        if (this.optimizedDispatch) {
+        if (this.optimizedDispatch || isSlave()) {
             // Outside of dispatchLock() to maintain the lock hierarchy of
             // iteratingMutex -> dispatchLock. - see https://issues.apache.org/activemq/browse/AMQ-1878
             wakeup();
