diff --git a/core/common/src/test/java/alluxio/underfs/options/MkdirsOptionsTest.java b/core/common/src/test/java/alluxio/underfs/options/MkdirsOptionsTest.java
index 6513a7b..2e5e1e0 100644
--- a/core/common/src/test/java/alluxio/underfs/options/MkdirsOptionsTest.java
+++ b/core/common/src/test/java/alluxio/underfs/options/MkdirsOptionsTest.java
@@ -31,7 +31,7 @@
 @RunWith(PowerMockRunner.class)
 // Need to mock Permission to use CommonTestUtils#testEquals.
 @PrepareForTest(Permission.class)
-public class MkdirsOptionsTest {
+public final class MkdirsOptionsTest {
   /**
    * Tests for default {@link MkdirsOptions}.
    */
