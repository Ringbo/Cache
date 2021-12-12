diff --git a/hazelcast/src/main/java/com/hazelcast/collection/CollectionService.java b/hazelcast/src/main/java/com/hazelcast/collection/CollectionService.java
index 08a72f8..972001e 100644
--- a/hazelcast/src/main/java/com/hazelcast/collection/CollectionService.java
+++ b/hazelcast/src/main/java/com/hazelcast/collection/CollectionService.java
@@ -330,7 +330,7 @@
         map.put(Command.MMCONTAINSENTRY, new ContainsEntryHandler(this));
         map.put(Command.MMKEYS, new MMKeysHandler(this));
         map.put(Command.MMLOCK, new LockHandler(this));
-        map.put(Command.MMUNLOCK, new UnlockHandler(this));
+        map.put(Command.MMUNLOCK, new MMUnlockHandler(this));
         map.put(Command.MMTRYLOCK, new TryLockHandler(this));
         map.put(Command.MMLISTEN, new ListenHandler(this));
         return map;
