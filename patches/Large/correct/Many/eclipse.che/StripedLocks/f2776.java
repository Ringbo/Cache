diff --git a/wsmaster/che-core-api-workspace/src/main/java/org/eclipse/che/api/workspace/server/StripedLocks.java b/wsmaster/che-core-api-workspace/src/main/java/org/eclipse/che/api/workspace/server/StripedLocks.java
index 9b1023e..c807f07 100644
--- a/wsmaster/che-core-api-workspace/src/main/java/org/eclipse/che/api/workspace/server/StripedLocks.java
+++ b/wsmaster/che-core-api-workspace/src/main/java/org/eclipse/che/api/workspace/server/StripedLocks.java
@@ -95,12 +95,12 @@
 
         private WriteLock(String key) {
             this.key = key;
-            striped.get(key).readLock().lock();
+            striped.get(key).writeLock().lock();
         }
 
         @Override
         public void close() {
-            striped.get(key).readLock().unlock();
+            striped.get(key).writeLock().unlock();
         }
     }
 
