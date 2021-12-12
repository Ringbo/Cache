diff --git a/camel-core/src/test/java/org/apache/camel/component/file/FileConsumerBeginAndCommitRenameStrategyTest.java b/camel-core/src/test/java/org/apache/camel/component/file/FileConsumerBeginAndCommitRenameStrategyTest.java
index 2982cf4..539fc51 100644
--- a/camel-core/src/test/java/org/apache/camel/component/file/FileConsumerBeginAndCommitRenameStrategyTest.java
+++ b/camel-core/src/test/java/org/apache/camel/component/file/FileConsumerBeginAndCommitRenameStrategyTest.java
@@ -48,10 +48,10 @@
         mock.assertIsSatisfied();
 
         // sleep to let the file consumer do its renaming
-        Thread.sleep(100);
+        Thread.sleep(500);
 
         // content of file should be Hello Paris
-        String content = IOConverter.toString(new File("./target/done/paris.txt"));
+        String content = IOConverter.toString(new File("./target/done/paris.txt").getAbsoluteFile());
         assertEquals("The file should have been renamed", "Hello Paris", content);
     }
 
