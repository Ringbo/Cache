diff --git a/src/main/java/org/tron/core/db2/core/SnapshotManager.java b/src/main/java/org/tron/core/db2/core/SnapshotManager.java
index 2c9ca35..e216131 100644
--- a/src/main/java/org/tron/core/db2/core/SnapshotManager.java
+++ b/src/main/java/org/tron/core/db2/core/SnapshotManager.java
@@ -469,7 +469,7 @@
     .map(b -> Maps.immutableEntry(ByteUtil.toHexString(b), tronApplicationContext.getBean(
         AccountStore.class).get(b)))
         .map(e -> Maps.immutableEntry(e.getKey(), e.getValue()))
-        .collect(Collectors.toMap(Entry::getKey, Entry::getValue));
+        .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (k, v) -> k));
 //    return values.entrySet().stream()
 //        .map(e -> Maps.immutableEntry(e.getKey(), new AccountCapsule(e.getValue())))
 //        .collect(Collectors.toMap(Entry::getKey, Entry::getValue));
