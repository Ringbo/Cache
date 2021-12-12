diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-client/src/main/java/org/apache/hadoop/yarn/client/cli/RMAdminCLI.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-client/src/main/java/org/apache/hadoop/yarn/client/cli/RMAdminCLI.java
index 068eaa8..356a8ce 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-client/src/main/java/org/apache/hadoop/yarn/client/cli/RMAdminCLI.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-client/src/main/java/org/apache/hadoop/yarn/client/cli/RMAdminCLI.java
@@ -187,7 +187,8 @@
   private static void appendHAUsage(final StringBuilder usageBuilder) {
     for (Map.Entry<String,UsageInfo> cmdEntry : USAGE.entrySet()) {
       if (cmdEntry.getKey().equals("-help")
-          || cmdEntry.getKey().equals("-failover")) {
+          || cmdEntry.getKey().equals("-failover")
+          || cmdEntry.getKey().equals("-transitionToObserver")) {
         continue;
       }
       UsageInfo usageInfo = cmdEntry.getValue();
@@ -302,7 +303,8 @@
     }
     if (isHAEnabled) {
       for (String cmdKey : USAGE.keySet()) {
-        if (!cmdKey.equals("-help") && !cmdKey.equals("-failover")) {
+        if (!cmdKey.equals("-help") && !cmdKey.equals("-failover")
+            && !cmdKey.equals("-transitionToObserver")) {
           buildHelpMsg(cmdKey, helpBuilder);
           helpBuilder.append("\n");
         }
