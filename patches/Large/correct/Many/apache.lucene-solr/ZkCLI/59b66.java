diff --git a/solr/core/src/java/org/apache/solr/cloud/ZkCLI.java b/solr/core/src/java/org/apache/solr/cloud/ZkCLI.java
index 63d02dd..4190aa3 100644
--- a/solr/core/src/java/org/apache/solr/cloud/ZkCLI.java
+++ b/solr/core/src/java/org/apache/solr/cloud/ZkCLI.java
@@ -222,7 +222,7 @@
           ZkController.downloadConfigDir(zkClient, confName, new File(confDir));
         } else if (line.getOptionValue(CMD).equals(LINKCONFIG)) {
           if (!line.hasOption(COLLECTION) || !line.hasOption(CONFNAME)) {
-            System.out.println("-" + CONFDIR + " and -" + CONFNAME
+            System.out.println("-" + COLLECTION + " and -" + CONFNAME
                 + " are required for " + LINKCONFIG);
             System.exit(1);
           }
