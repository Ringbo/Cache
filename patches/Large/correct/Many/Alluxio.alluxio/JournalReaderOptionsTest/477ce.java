diff --git a/tests/src/test/java/alluxio/master/journal/options/JournalReaderOptionsTest.java b/tests/src/test/java/alluxio/master/journal/options/JournalReaderOptionsTest.java
index da338df..2d808fc 100644
--- a/tests/src/test/java/alluxio/master/journal/options/JournalReaderOptionsTest.java
+++ b/tests/src/test/java/alluxio/master/journal/options/JournalReaderOptionsTest.java
@@ -31,7 +31,7 @@
    * Tests getting and setting fields.
    */
   @Test
-  public void fields() {
+  public void fields() throws Exception {
     Random random = new Random();
     boolean isPrimary = random.nextBoolean();
     long sequenceNumber = random.nextLong();
