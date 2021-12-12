diff --git a/h2o-parsers/h2o-parquet-parser/src/test/java/water/parser/parquet/ParseTestParquet.java b/h2o-parsers/h2o-parquet-parser/src/test/java/water/parser/parquet/ParseTestParquet.java
index fc68686..e558a7b 100644
--- a/h2o-parsers/h2o-parquet-parser/src/test/java/water/parser/parquet/ParseTestParquet.java
+++ b/h2o-parsers/h2o-parquet-parser/src/test/java/water/parser/parquet/ParseTestParquet.java
@@ -17,7 +17,7 @@
 public class ParseTestParquet extends TestUtil {
 
   @BeforeClass
-  static public void setup() { TestUtil.stall_till_cloudsize(1); }
+  static public void setup() { TestUtil.stall_till_cloudsize(5); }
 
   @Test
   public void testParseSimple() {
