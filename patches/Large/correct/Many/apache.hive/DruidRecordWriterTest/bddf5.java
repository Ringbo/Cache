diff --git a/druid-handler/src/test/org/apache/hadoop/hive/ql/io/DruidRecordWriterTest.java b/druid-handler/src/test/org/apache/hadoop/hive/ql/io/DruidRecordWriterTest.java
index b1310b6..f72a735 100644
--- a/druid-handler/src/test/org/apache/hadoop/hive/ql/io/DruidRecordWriterTest.java
+++ b/druid-handler/src/test/org/apache/hadoop/hive/ql/io/DruidRecordWriterTest.java
@@ -231,7 +231,7 @@
   @Test
   public void testSerDesr() throws IOException {
     String segment = "{\"dataSource\":\"datasource2015\",\"interval\":\"2015-06-01T00:00:00.000-04:00/2015-06-02T00:00:00.000-04:00\",\"version\":\"2016-11-04T19:24:01.732-04:00\",\"loadSpec\":{\"type\":\"hdfs\",\"path\":\"hdfs://cn105-10.l42scl.hortonworks.com:8020/apps/hive/warehouse/druid.db/.hive-staging_hive_2016-11-04_19-23-50_168_1550339856804207572-1/_task_tmp.-ext-10002/_tmp.000000_0/datasource2015/20150601T000000.000-0400_20150602T000000.000-0400/2016-11-04T19_24_01.732-04_00/0/index.zip\"},\"dimensions\":\"dimension1\",\"metrics\":\"bigint\",\"shardSpec\":{\"type\":\"linear\",\"partitionNum\":0},\"binaryVersion\":9,\"size\":1765,\"identifier\":\"datasource2015_2015-06-01T00:00:00.000-04:00_2015-06-02T00:00:00.000-04:00_2016-11-04T19:24:01.732-04:00\"}";
-    DataSegment dataSegment = objectMapper.readerFor(DataSegment.class)
+    DataSegment dataSegment = objectMapper.reader(DataSegment.class)
             .readValue(segment);
     Assert.assertTrue(dataSegment.getDataSource().equals("datasource2015"));
   }
