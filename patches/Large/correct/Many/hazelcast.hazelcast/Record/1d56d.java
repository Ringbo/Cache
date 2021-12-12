diff --git a/hazelcast/src/main/java/com/hazelcast/impl/Record.java b/hazelcast/src/main/java/com/hazelcast/impl/Record.java
index a40063b..43c0d70 100644
--- a/hazelcast/src/main/java/com/hazelcast/impl/Record.java
+++ b/hazelcast/src/main/java/com/hazelcast/impl/Record.java
@@ -343,7 +343,7 @@
     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
-        if ((o instanceof Record)) return false;
+        if (!(o instanceof Record)) return false;
         Record record = (Record) o;
         return record.getId().equals(getId());
     }
