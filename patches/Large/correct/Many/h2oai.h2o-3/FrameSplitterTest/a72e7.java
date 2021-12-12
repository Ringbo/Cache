diff --git a/h2o-core/src/test/java/hex/FrameSplitterTest.java b/h2o-core/src/test/java/hex/FrameSplitterTest.java
index d6b95be..147594e 100644
--- a/h2o-core/src/test/java/hex/FrameSplitterTest.java
+++ b/h2o-core/src/test/java/hex/FrameSplitterTest.java
@@ -16,7 +16,7 @@
 import static water.util.FrameUtils.generateNumKeys;
 
 public class FrameSplitterTest extends TestUtil {
-  @BeforeClass() public static void setup() { stall_till_cloudsize(1); }
+  @BeforeClass() public static void setup() { stall_till_cloudsize(5); }
 
   @Test public void splitTinyFrame() {
     Frame   dataset = null;
