diff --git a/src/test/java/com/github/dockerjava/api/model/StatisticsTest.java b/src/test/java/com/github/dockerjava/api/model/StatisticsTest.java
index 6082731..261fe7d 100644
--- a/src/test/java/com/github/dockerjava/api/model/StatisticsTest.java
+++ b/src/test/java/com/github/dockerjava/api/model/StatisticsTest.java
@@ -23,7 +23,7 @@
     @Test
     public void serderJson1() throws IOException {
         final ObjectMapper mapper = new ObjectMapper();
-        final JavaType type = mapper.getTypeFactory().uncheckedSimpleType(Statistics.class);
+        final JavaType type = mapper.getTypeFactory().constructType(Statistics.class);
 
         final Statistics statistics = testRoundTrip(RemoteApiVersion.VERSION_1_27,
                 "containers/container/stats/stats1.json",
