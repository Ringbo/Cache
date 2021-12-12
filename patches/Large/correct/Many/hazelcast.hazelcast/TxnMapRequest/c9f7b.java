diff --git a/hazelcast/src/main/java/com/hazelcast/map/client/TxnMapRequest.java b/hazelcast/src/main/java/com/hazelcast/map/client/TxnMapRequest.java
index 9059937..3fc88fd 100644
--- a/hazelcast/src/main/java/com/hazelcast/map/client/TxnMapRequest.java
+++ b/hazelcast/src/main/java/com/hazelcast/map/client/TxnMapRequest.java
@@ -83,7 +83,7 @@
                 return map.putIfAbsent(key, value);
             case REPLACE:
                 return map.replace(key, value);
-            case REPLACE_IS_SAME:
+            case REPLACE_IF_SAME:
                 return map.replace(key, value, newValue);
             case SET:
                 map.set(key, value);
@@ -142,7 +142,7 @@
         PUT(4),
         PUT_IF_ABSENT(5),
         REPLACE(6),
-        REPLACE_IS_SAME(7),
+        REPLACE_IF_SAME(7),
         SET(8),
         REMOVE(9),
         DELETE(10),
