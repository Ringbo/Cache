diff --git a/hazelcast/src/main/java/com/hazelcast/ascii/memcache/SetCommandParser.java b/hazelcast/src/main/java/com/hazelcast/ascii/memcache/SetCommandParser.java
index c7d803b..5dcc1ca 100644
--- a/hazelcast/src/main/java/com/hazelcast/ascii/memcache/SetCommandParser.java
+++ b/hazelcast/src/main/java/com/hazelcast/ascii/memcache/SetCommandParser.java
@@ -44,7 +44,7 @@
             return new ErrorCommand(ERROR_CLIENT);
         }
         if (st.hasMoreTokens()) {
-            flag = Integer.valueOf(st.nextToken());
+            flag = Integer.parseInt(st.nextToken());
         } else {
             return new ErrorCommand(ERROR_CLIENT);
         }
