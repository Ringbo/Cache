diff --git a/hazelcast/src/test/java/com/hazelcast/map/impl/nearcache/invalidation/InvalidationMemberAddRemoveTest.java b/hazelcast/src/test/java/com/hazelcast/map/impl/nearcache/invalidation/InvalidationMemberAddRemoveTest.java
index 87ce4cd..9ed7930 100644
--- a/hazelcast/src/test/java/com/hazelcast/map/impl/nearcache/invalidation/InvalidationMemberAddRemoveTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/map/impl/nearcache/invalidation/InvalidationMemberAddRemoveTest.java
@@ -153,7 +153,7 @@
         //stop threads
         stopTest.set(true);
         shadowMember.join();
-        clearFromMember.start();
+        clearFromMember.join();
         populateClientNearCache.join();
         putFromMember.join();
 
