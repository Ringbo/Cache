diff --git a/hazelcast/src/main/java/com/hazelcast/management/operation/UpdateMapConfigOperation.java b/hazelcast/src/main/java/com/hazelcast/management/operation/UpdateMapConfigOperation.java
index 52605b9..7a59187 100644
--- a/hazelcast/src/main/java/com/hazelcast/management/operation/UpdateMapConfigOperation.java
+++ b/hazelcast/src/main/java/com/hazelcast/management/operation/UpdateMapConfigOperation.java
@@ -64,7 +64,7 @@
     }
 
     public boolean returnsResponse() {
-        return false;
+        return true;
     }
 
     public Object getResponse() {
