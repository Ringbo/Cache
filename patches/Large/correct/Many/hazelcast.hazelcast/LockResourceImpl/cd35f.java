diff --git a/hazelcast/src/main/java/com/hazelcast/concurrent/lock/LockResourceImpl.java b/hazelcast/src/main/java/com/hazelcast/concurrent/lock/LockResourceImpl.java
index 623354a..6baf4fb 100644
--- a/hazelcast/src/main/java/com/hazelcast/concurrent/lock/LockResourceImpl.java
+++ b/hazelcast/src/main/java/com/hazelcast/concurrent/lock/LockResourceImpl.java
@@ -85,7 +85,7 @@
             this.transactional = transactional;
             return true;
         } else if (isLockedBy(owner, threadId)) {
-            if (this.referenceId == referenceId) {
+            if (!transactional && this.referenceId == referenceId) {
                 return true;
             }
             this.referenceId = referenceId;
@@ -134,7 +134,7 @@
             return false;
         }
 
-        if (this.referenceId == referenceId) {
+        if (!this.transactional && this.referenceId == referenceId) {
             return true;
         }
 
