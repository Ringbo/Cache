diff --git a/server/src/test/java/com/metamx/druid/master/DruidMasterRuleRunnerTest.java b/server/src/test/java/com/metamx/druid/master/DruidMasterRuleRunnerTest.java
index 81e8d5e..8679daf 100644
--- a/server/src/test/java/com/metamx/druid/master/DruidMasterRuleRunnerTest.java
+++ b/server/src/test/java/com/metamx/druid/master/DruidMasterRuleRunnerTest.java
@@ -926,7 +926,8 @@
         Lists.<String>newArrayList(),
         Lists.<String>newArrayList(),
         new NoneShardSpec(),
-        1
+        1,
+        0
     );
 
     afterParams = ruleRunner.run(
@@ -971,7 +972,8 @@
         Lists.<String>newArrayList(),
         Lists.<String>newArrayList(),
         new NoneShardSpec(),
-        1
+        1,
+        0
     );
     List<DataSegment> longerAvailableSegments = Lists.newArrayList(availableSegments);
     longerAvailableSegments.add(overFlowSegment);
