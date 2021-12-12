diff --git a/src/java/org/apache/cassandra/tools/StandaloneSplitter.java b/src/java/org/apache/cassandra/tools/StandaloneSplitter.java
index bcf9869..3baf833 100644
--- a/src/java/org/apache/cassandra/tools/StandaloneSplitter.java
+++ b/src/java/org/apache/cassandra/tools/StandaloneSplitter.java
@@ -201,7 +201,7 @@
                 opts.sizeInMB = DEFAULT_SSTABLE_SIZE;
 
                 if (cmd.hasOption(SIZE_OPTION))
-                    opts.sizeInMB = Integer.valueOf(cmd.getOptionValue(SIZE_OPTION));
+                    opts.sizeInMB = Integer.parseInt(cmd.getOptionValue(SIZE_OPTION));
 
                 return opts;
             }
