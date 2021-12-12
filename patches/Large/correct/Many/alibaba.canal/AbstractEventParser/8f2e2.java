diff --git a/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/AbstractEventParser.java b/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/AbstractEventParser.java
index 8902c05..4d5cf7e 100644
--- a/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/AbstractEventParser.java
+++ b/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/AbstractEventParser.java
@@ -417,7 +417,7 @@
     }
 
     protected LogPosition buildLastTransactionPosition(List<CanalEntry.Entry> entries) { // 初始化一下
-        for (int i = entries.size() - 1; i > 0; i--) {
+        for (int i = entries.size() - 1; i >= 0; i--) {
             CanalEntry.Entry entry = entries.get(i);
             if (entry.getEntryType() == CanalEntry.EntryType.TRANSACTIONEND) {// 尽量记录一个事务做为position
                 return buildLastPosition(entry);
