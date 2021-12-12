diff --git a/core/common/src/test/java/alluxio/underfs/options/MkdirsOptionsTest.java b/core/common/src/test/java/alluxio/underfs/options/MkdirsOptionsTest.java
index bcf823f..84e9413 100644
--- a/core/common/src/test/java/alluxio/underfs/options/MkdirsOptionsTest.java
+++ b/core/common/src/test/java/alluxio/underfs/options/MkdirsOptionsTest.java
@@ -93,6 +93,6 @@
 
   @Test
   public void equalsTest() throws Exception {
-    CommonTestUtils.testEquals(CreateOptions.class);
+    CommonTestUtils.testEquals(MkdirsOptions.class);
   }
 }
