diff --git a/presto-hive/src/main/java/com/facebook/presto/hive/HiveUtil.java b/presto-hive/src/main/java/com/facebook/presto/hive/HiveUtil.java
index e4ae774..6b67380 100644
--- a/presto-hive/src/main/java/com/facebook/presto/hive/HiveUtil.java
+++ b/presto-hive/src/main/java/com/facebook/presto/hive/HiveUtil.java
@@ -390,7 +390,7 @@
             deserializer.initialize(configuration, schema);
         }
         catch (SerDeException e) {
-            throw new RuntimeException("error initializing deserializer: " + deserializer.getClass().getName());
+            throw new RuntimeException("error initializing deserializer: " + deserializer.getClass().getName(), e);
         }
     }
 
