diff --git a/gemfire/src/main/java/com/yahoo/ycsb/db/GemFireClient.java b/gemfire/src/main/java/com/yahoo/ycsb/db/GemFireClient.java
index 9fe598a..aa0cd64 100644
--- a/gemfire/src/main/java/com/yahoo/ycsb/db/GemFireClient.java
+++ b/gemfire/src/main/java/com/yahoo/ycsb/db/GemFireClient.java
@@ -133,7 +133,7 @@
     if (val != null) {
       if (fields == null) {
         for (String k : val.keySet()) {
-          result.put(key, new ByteArrayByteIterator(val.get(key)));
+          result.put(key, new ByteArrayByteIterator(val.get(k)));
         }
       } else {
         for (String field : fields) {
