diff --git a/common/src/test/java/org/apache/kylin/common/util/BasicTest.java b/common/src/test/java/org/apache/kylin/common/util/BasicTest.java
index 3bc4fda..b924ad5 100644
--- a/common/src/test/java/org/apache/kylin/common/util/BasicTest.java
+++ b/common/src/test/java/org/apache/kylin/common/util/BasicTest.java
@@ -77,9 +77,9 @@
     @Test
     @Ignore("convenient trial tool for dev")
     public void test1() throws Exception {
-        System.out.println(org.apache.kylin.common.util.DateFormat.formatToTimeStr(1433250418000L));
+        System.out.println(org.apache.kylin.common.util.DateFormat.formatToTimeStr(1430438400000L));
         System.out.println(org.apache.kylin.common.util.DateFormat.formatToTimeStr(1433250517000L));
-        System.out.println(org.apache.kylin.common.util.DateFormat.stringToMillis("2015-06-02 13:05:00"));
+        System.out.println(org.apache.kylin.common.util.DateFormat.stringToMillis("2015-06-01 00:00:00"));
         System.out.println(org.apache.kylin.common.util.DateFormat.stringToMillis("2015-05-15 17:00:00"));
 
         String bb = "\\x00\\x00\\x00\\x00\\x01\\x3F\\xD0\\x2D\\58\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00";//2013/07/12 07:59:37
