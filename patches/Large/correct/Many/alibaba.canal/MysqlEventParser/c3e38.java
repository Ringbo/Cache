diff --git a/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/MysqlEventParser.java b/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/MysqlEventParser.java
index dc480e3..5644651 100644
--- a/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/MysqlEventParser.java
+++ b/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/MysqlEventParser.java
@@ -68,7 +68,7 @@
 
     // update by yishun.chen,特殊异常处理参数
     private int                dumpErrorCount                    = 0;        // binlogDump失败异常计数
-    private int                dumpErrorCountThreshold           = 3;        // binlogDump失败异常计数阀值
+    private int                dumpErrorCountThreshold           = 2;        // binlogDump失败异常计数阀值
 
     protected ErosaConnection buildErosaConnection() {
         return buildMysqlConnection(this.runningInfo);
@@ -395,7 +395,8 @@
                     // binlog定位位点失败,可能有两个原因:
                     // 1. binlog位点被删除
                     // 2.vip模式的mysql,发生了主备切换,判断一下serverId是否变化,针对这种模式可以发起一次基于时间戳查找合适的binlog位点
-                    boolean case2 = standbyInfo == null && logPosition.getPostion().getServerId() != null
+                    boolean case2 = (standbyInfo.getAddress() == null)
+                                    && logPosition.getPostion().getServerId() != null
                                     && !logPosition.getPostion().getServerId().equals(findServerId(mysqlConnection));
                     if (case2) {
                         long timestamp = logPosition.getPostion().getTimestamp();
