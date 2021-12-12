diff --git a/src/java/org/apache/cassandra/hadoop/cql3/CqlConfigHelper.java b/src/java/org/apache/cassandra/hadoop/cql3/CqlConfigHelper.java
index 73a291b..30d742c 100644
--- a/src/java/org/apache/cassandra/hadoop/cql3/CqlConfigHelper.java
+++ b/src/java/org/apache/cassandra/hadoop/cql3/CqlConfigHelper.java
@@ -525,7 +525,7 @@
         String setting = conf.get(parameter);
         if (setting == null)
             return Optional.absent();
-        return Optional.of(Integer.parseInt(setting));  
+        return Optional.of(Integer.valueOf(setting));  
     }
 
     private static Optional<Boolean> getBooleanSetting(String parameter, Configuration conf)
@@ -533,7 +533,7 @@
         String setting = conf.get(parameter);
         if (setting == null)
             return Optional.absent();
-        return Optional.of(Boolean.parseBoolean(setting));  
+        return Optional.of(Boolean.valueOf(setting));  
     }
 
     private static Optional<String> getStringSetting(String parameter, Configuration conf)
