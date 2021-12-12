diff --git a/hazelcast/src/main/java/com/hazelcast/impl/ConcurrentMapManager.java b/hazelcast/src/main/java/com/hazelcast/impl/ConcurrentMapManager.java
index 40bb342..3160244 100644
--- a/hazelcast/src/main/java/com/hazelcast/impl/ConcurrentMapManager.java
+++ b/hazelcast/src/main/java/com/hazelcast/impl/ConcurrentMapManager.java
@@ -1784,7 +1784,7 @@
                     if (oldObject == null) {
                         return Boolean.FALSE;
                     } else {
-                        if (expectedValue.equals(oldValue)) {
+                        if (expectedValue.equals(oldObject)) {
                             txn.attachPutOp(name, key, toData(newValue), false);
                             return Boolean.TRUE;
                         } else {
