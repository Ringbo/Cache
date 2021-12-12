diff --git a/graylog2-server/src/main/java/org/graylog2/cluster/NodeImpl.java b/graylog2-server/src/main/java/org/graylog2/cluster/NodeImpl.java
index 903f552..190cf9b 100644
--- a/graylog2-server/src/main/java/org/graylog2/cluster/NodeImpl.java
+++ b/graylog2-server/src/main/java/org/graylog2/cluster/NodeImpl.java
@@ -58,7 +58,7 @@
 
     @Override
     public DateTime getLastSeen() {
-        return new DateTime(((Integer) fields.get("last_seen")) * 1000L, DateTimeZone.UTC);
+        return new DateTime(((Integer) fields.getOrDefault("last_seen", 0)) * 1000L, DateTimeZone.UTC);
     }
 
     @Override
