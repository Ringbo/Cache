diff --git a/h2o-algos/src/test/java/hex/glm/GLMTest.java b/h2o-algos/src/test/java/hex/glm/GLMTest.java
index 8a97998..007e557 100644
--- a/h2o-algos/src/test/java/hex/glm/GLMTest.java
+++ b/h2o-algos/src/test/java/hex/glm/GLMTest.java
@@ -25,7 +25,7 @@
 import static org.junit.Assert.assertEquals;
 
 public class GLMTest  extends TestUtil {
-  @BeforeClass public static void setup() { stall_till_cloudsize(1);   jobKey = Key.make("job");}
+  @BeforeClass public static void setup() { stall_till_cloudsize(5);   jobKey = Key.make("job");}
   static Key jobKey;
 
   //------------------- simple tests on synthetic data------------------------------------
