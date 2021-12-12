diff --git a/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/MysqlEventParser.java b/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/MysqlEventParser.java
index 7060f26..9b7b152 100644
--- a/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/MysqlEventParser.java
+++ b/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/MysqlEventParser.java
@@ -182,7 +182,7 @@
     protected void stopHeartBeat() {
         TimerTask heartBeatTimerTask = this.heartBeatTimerTask;
         super.stopHeartBeat();
-        if (heartBeatTimerTask != null) {
+        if (heartBeatTimerTask != null && heartBeatTimerTask instanceof MysqlDetectingTimeTask) {
             MysqlConnection mysqlConnection = ((MysqlDetectingTimeTask) heartBeatTimerTask).getMysqlConnection();
             try {
                 mysqlConnection.disconnect();
