diff --git a/src/java/org/apache/cassandra/tools/BulkLoader.java b/src/java/org/apache/cassandra/tools/BulkLoader.java
index 65240cc..f57ebfe 100644
--- a/src/java/org/apache/cassandra/tools/BulkLoader.java
+++ b/src/java/org/apache/cassandra/tools/BulkLoader.java
@@ -314,12 +314,12 @@
                     {
                         for (String node : nodes)
                         {
-                            opts.ignores.add(InetAddress.getByName(node));
+                            opts.ignores.add(InetAddress.getByName(node.trim()));
                         }
                     }
                     catch (UnknownHostException e)
                     {
-                        errorMsg(e.getMessage(), options);
+                        errorMsg("Unknown host: " + e.getMessage(), options);
                     }
                 }
 
@@ -357,7 +357,7 @@
             options.addOption("v",  VERBOSE_OPTION,      "verbose output");
             options.addOption("h",  HELP_OPTION,         "display this help message");
             options.addOption(null, NOPROGRESS_OPTION,   "don't display progress");
-            options.addOption("i",  IGNORE_NODES_OPTION, "don't stream to this (comma separated) list of nodes");
+            options.addOption("i",  IGNORE_NODES_OPTION, "NODES", "don't stream to this (comma separated) list of nodes");
             return options;
         }
 
