diff --git a/servers/src/test/java/tachyon/master/next/filesystem/meta/InodeFileTests.java b/servers/src/test/java/tachyon/master/next/filesystem/meta/InodeFileTests.java
index a2626ef..272a97f 100644
--- a/servers/src/test/java/tachyon/master/next/filesystem/meta/InodeFileTests.java
+++ b/servers/src/test/java/tachyon/master/next/filesystem/meta/InodeFileTests.java
@@ -25,7 +25,7 @@
  * Unit tests for tachyon.InodeFile
  */
 public final class InodeFileTests extends AbstractInodeTests {
-  private static long LENGTH = 100;
+  private static final long LENGTH = 100;
 
   @Test
   public void equalsTest() {
