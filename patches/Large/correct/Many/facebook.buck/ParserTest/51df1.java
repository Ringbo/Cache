diff --git a/test/com/facebook/buck/parser/ParserTest.java b/test/com/facebook/buck/parser/ParserTest.java
index 9a798db..8438a5f 100644
--- a/test/com/facebook/buck/parser/ParserTest.java
+++ b/test/com/facebook/buck/parser/ParserTest.java
@@ -891,8 +891,7 @@
                 "[buildfile]",
                 "includes = //java/com/facebook/defaultIncludeFile",
                 "[project]",
-                "check_package_boundary = false",
-                "temp_files = ''")
+                "check_package_boundary = false")
             .build();
     Cell cell = new TestCellBuilder().setFilesystem(filesystem).setBuckConfig(config).build();
 
