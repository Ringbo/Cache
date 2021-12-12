diff --git a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/ipc/Client.java b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/ipc/Client.java
index c9ac615..a0417d6 100644
--- a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/ipc/Client.java
+++ b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/ipc/Client.java
@@ -212,7 +212,8 @@
    * @param conf Configuration
    * @param pingInterval the ping interval
    */
-  static final void setPingInterval(Configuration conf, int pingInterval) {
+  public static final void setPingInterval(Configuration conf,
+      int pingInterval) {
     conf.setInt(CommonConfigurationKeys.IPC_PING_INTERVAL_KEY, pingInterval);
   }
 
@@ -223,7 +224,7 @@
    * @param conf Configuration
    * @return the ping interval
    */
-  static final int getPingInterval(Configuration conf) {
+  public static final int getPingInterval(Configuration conf) {
     return conf.getInt(CommonConfigurationKeys.IPC_PING_INTERVAL_KEY,
         CommonConfigurationKeys.IPC_PING_INTERVAL_DEFAULT);
   }
