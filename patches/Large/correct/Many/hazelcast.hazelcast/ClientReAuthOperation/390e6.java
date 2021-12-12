diff --git a/hazelcast/src/main/java/com/hazelcast/client/ClientReAuthOperation.java b/hazelcast/src/main/java/com/hazelcast/client/ClientReAuthOperation.java
index 4188e52..4bc71c9 100644
--- a/hazelcast/src/main/java/com/hazelcast/client/ClientReAuthOperation.java
+++ b/hazelcast/src/main/java/com/hazelcast/client/ClientReAuthOperation.java
@@ -49,7 +49,7 @@
     }
 
     public boolean returnsResponse() {
-        return true;
+        return false;
     }
 
     public Object getResponse() {
