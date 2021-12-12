diff --git a/memcached/src/main/java/com/yahoo/ycsb/db/MemcachedClient.java b/memcached/src/main/java/com/yahoo/ycsb/db/MemcachedClient.java
index b8f6938..40efb7e 100644
--- a/memcached/src/main/java/com/yahoo/ycsb/db/MemcachedClient.java
+++ b/memcached/src/main/java/com/yahoo/ycsb/db/MemcachedClient.java
@@ -277,7 +277,7 @@
          /* increment in loop body */) {
       Map.Entry<String, JsonNode> jsonField = jsonFields.next();
       String name = jsonField.getKey();
-      if (checkFields && fields.contains(name)) {
+      if (checkFields && !fields.contains(name)) {
         continue;
       }
       JsonNode jsonValue = jsonField.getValue();
