diff --git a/h2o-algos/src/test/java/hex/word2vec/Word2VecTest.java b/h2o-algos/src/test/java/hex/word2vec/Word2VecTest.java
index e0f0b1c..75aa70a 100644
--- a/h2o-algos/src/test/java/hex/word2vec/Word2VecTest.java
+++ b/h2o-algos/src/test/java/hex/word2vec/Word2VecTest.java
@@ -19,7 +19,7 @@
  * ./gradlew syncBigdataLaptop
  */
 public class Word2VecTest extends TestUtil {
-  @BeforeClass() public static void setup() { stall_till_cloudsize(1); }
+  @BeforeClass() public static void setup() { stall_till_cloudsize(3); }
 
   private void printResults(HashMap<String, Float> hm) {
     TreeMap<Float, String> reversedMap = new TreeMap<Float, String>();
