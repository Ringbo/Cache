diff --git a/core/client/src/test/java/alluxio/client/file/options/CreateUfsFileOptionsTest.java b/core/client/src/test/java/alluxio/client/file/options/CreateUfsFileOptionsTest.java
index 4e29f31..9daa1b6 100644
--- a/core/client/src/test/java/alluxio/client/file/options/CreateUfsFileOptionsTest.java
+++ b/core/client/src/test/java/alluxio/client/file/options/CreateUfsFileOptionsTest.java
@@ -27,7 +27,7 @@
 /**
  * Tests for the {@link CreateUfsFileOptions} class.
  */
-public class CreateUfsFileOptionsTest {
+public final class CreateUfsFileOptionsTest {
   /**
    * Tests that building an {@link CreateUfsFileOptions} with the defaults works.
    */
