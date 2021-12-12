diff --git a/src/test/java/com/alibaba/json/bvt/joda/JodaTest_7_DateTimeZone.java b/src/test/java/com/alibaba/json/bvt/joda/JodaTest_7_DateTimeZone.java
index cc75fd4..85d97e7 100644
--- a/src/test/java/com/alibaba/json/bvt/joda/JodaTest_7_DateTimeZone.java
+++ b/src/test/java/com/alibaba/json/bvt/joda/JodaTest_7_DateTimeZone.java
@@ -8,7 +8,7 @@
     public void test_for_joda_0() throws Exception {
 
        Model m = new Model();
-       m.zone = DateTimeZone.getDefault();
+       m.zone = DateTimeZone.forID("Asia/Shanghai");
 
        String json = JSON.toJSONString(m);
 
