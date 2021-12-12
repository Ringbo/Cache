diff --git a/azkaban-common/src/test/java/azkaban/executor/JdbcExecutorLoaderTest.java b/azkaban-common/src/test/java/azkaban/executor/JdbcExecutorLoaderTest.java
index 04ae03d..71be50f 100644
--- a/azkaban-common/src/test/java/azkaban/executor/JdbcExecutorLoaderTest.java
+++ b/azkaban-common/src/test/java/azkaban/executor/JdbcExecutorLoaderTest.java
@@ -144,7 +144,7 @@
   }
 
   @After
-  public static void clearDB() {
+  public void clearDB() {
     if (!testDBExists) {
       return;
     }
