diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/UtilsTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/UtilsTest.java
index f3c6677..e14f103 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/UtilsTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/UtilsTest.java
@@ -288,7 +288,7 @@
 
             @Override
             public void close() throws IOException {
-                throw new IOException();
+                throw new IOException("Test IOException");
             }
         });
     }
