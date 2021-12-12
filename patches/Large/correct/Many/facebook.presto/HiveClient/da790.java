diff --git a/presto-hive/src/main/java/com/facebook/presto/hive/HiveClient.java b/presto-hive/src/main/java/com/facebook/presto/hive/HiveClient.java
index 57c3201..5278d05 100644
--- a/presto-hive/src/main/java/com/facebook/presto/hive/HiveClient.java
+++ b/presto-hive/src/main/java/com/facebook/presto/hive/HiveClient.java
@@ -585,7 +585,7 @@
                                 break;
                             case DOUBLE:
                                 if (value.isEmpty()) {
-                                    builder.put(columnHandle, 0L);
+                                    builder.put(columnHandle, 0.0);
                                 }
                                 else {
                                     builder.put(columnHandle, parseDouble(value));
