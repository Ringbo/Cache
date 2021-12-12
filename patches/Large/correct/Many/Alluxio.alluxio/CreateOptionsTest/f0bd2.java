diff --git a/core/common/src/test/java/alluxio/underfs/options/CreateOptionsTest.java b/core/common/src/test/java/alluxio/underfs/options/CreateOptionsTest.java
index e516c83..8428a36 100644
--- a/core/common/src/test/java/alluxio/underfs/options/CreateOptionsTest.java
+++ b/core/common/src/test/java/alluxio/underfs/options/CreateOptionsTest.java
@@ -31,7 +31,7 @@
 @RunWith(PowerMockRunner.class)
 // Need to mock Permission to use CommonTestUtils#testEquals.
 @PrepareForTest(Permission.class)
-public class CreateOptionsTest {
+public final class CreateOptionsTest {
   /**
    * Tests for default {@link CreateOptions}.
    */
