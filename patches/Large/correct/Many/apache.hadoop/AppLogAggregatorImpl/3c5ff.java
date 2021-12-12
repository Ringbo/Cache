diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/main/java/org/apache/hadoop/yarn/server/nodemanager/containermanager/logaggregation/AppLogAggregatorImpl.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/main/java/org/apache/hadoop/yarn/server/nodemanager/containermanager/logaggregation/AppLogAggregatorImpl.java
index 8eb00f4..787422b 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/main/java/org/apache/hadoop/yarn/server/nodemanager/containermanager/logaggregation/AppLogAggregatorImpl.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/main/java/org/apache/hadoop/yarn/server/nodemanager/containermanager/logaggregation/AppLogAggregatorImpl.java
@@ -248,7 +248,7 @@
 
       } catch (IOException e1) {
         LOG.error("Cannot create writer for app " + this.applicationId
-            + ". Skip log upload this time. ");
+            + ". Skip log upload this time. ", e1);
         return;
       }
 
@@ -549,7 +549,7 @@
         writer.append(logKey, logValue);
       } catch (Exception e) {
         LOG.error("Couldn't upload logs for " + containerId
-            + ". Skipping this container.");
+            + ". Skipping this container.", e);
         return new HashSet<Path>();
       }
       this.uploadedFileMeta.addAll(logValue
