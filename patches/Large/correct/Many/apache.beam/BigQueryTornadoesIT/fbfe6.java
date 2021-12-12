diff --git a/examples/java/src/test/java/org/apache/beam/examples/cookbook/BigQueryTornadoesIT.java b/examples/java/src/test/java/org/apache/beam/examples/cookbook/BigQueryTornadoesIT.java
index 461787f..b20c796 100644
--- a/examples/java/src/test/java/org/apache/beam/examples/cookbook/BigQueryTornadoesIT.java
+++ b/examples/java/src/test/java/org/apache/beam/examples/cookbook/BigQueryTornadoesIT.java
@@ -28,7 +28,25 @@
 import org.junit.runner.RunWith;
 import org.junit.runners.JUnit4;
 
-/** End-to-end tests of BigQueryTornadoes. */
+/**
+ * An end-to-end test for {@link org.apache.beam.examples.cookbook.BigQueryTornadoes}.
+ *
+ * <p>This test reads the public samples of weather data from BigQuery, counts the number of
+ * tornadoes that occur in each month, and writes the results to BigQuery. It requires
+ * "BigQueryTornadoesIT" BigQuery dataset to be created before running.
+ *
+ * <p>Running instructions:
+ *
+ * <pre>
+ *  ./gradlew integrationTest -p examples/java/ -DintegrationTestPipelineOptions='[
+ *  "--tempLocation=gs://your-location/"]'
+ *  --tests org.apache.beam.examples.cookbook.BigQueryTornadoesIT
+ *  -DintegrationTestRunner=direct
+ * </pre>
+ *
+ * <p>Check {@link org.apache.beam.examples.cookbook.BigQueryTornadoes} form more configuration
+ * options via PipelineOptions.
+ */
 @RunWith(JUnit4.class)
 public class BigQueryTornadoesIT {
 
@@ -40,7 +58,7 @@
 
   @BeforeClass
   public static void setUp() {
-    PipelineOptionsFactory.register(TestPipelineOptions.class);
+    PipelineOptionsFactory.register(BigQueryTornadoesITOptions.class);
   }
 
   @Test
