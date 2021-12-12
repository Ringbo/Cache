diff --git a/x-pack/plugin/sql/src/test/java/org/elasticsearch/xpack/sql/plan/logical/command/sys/SysTypesTests.java b/x-pack/plugin/sql/src/test/java/org/elasticsearch/xpack/sql/plan/logical/command/sys/SysTypesTests.java
index 56dfdce..7843392 100644
--- a/x-pack/plugin/sql/src/test/java/org/elasticsearch/xpack/sql/plan/logical/command/sys/SysTypesTests.java
+++ b/x-pack/plugin/sql/src/test/java/org/elasticsearch/xpack/sql/plan/logical/command/sys/SysTypesTests.java
@@ -32,11 +32,11 @@
 
     private Tuple<Command, SqlSession> sql(String sql) {
         EsIndex test = new EsIndex("test", TypesTests.loadMapping("mapping-multi-field-with-nested.json", true));
-        Analyzer analyzer = new Analyzer(new FunctionRegistry(), IndexResolution.valid(test), TimeZone.getTimeZone("UTC"));
+        Analyzer analyzer = new Analyzer(new FunctionRegistry(), IndexResolution.valid(test), TimeZone.getTimeZone("UTC"), null);
         Command cmd = (Command) analyzer.analyze(parser.createStatement(sql), true);
 
         IndexResolver resolver = mock(IndexResolver.class);
-        SqlSession session = new SqlSession(null, null, null, resolver, null, null, null);
+        SqlSession session = new SqlSession(null, null, null, resolver, null, null, null, null);
         return new Tuple<>(cmd, session);
     }
 
