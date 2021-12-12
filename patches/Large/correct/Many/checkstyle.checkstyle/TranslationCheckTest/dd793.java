diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/checks/TranslationCheckTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/checks/TranslationCheckTest.java
index 0493e7b..b77aa8f 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/checks/TranslationCheckTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/checks/TranslationCheckTest.java
@@ -123,7 +123,7 @@
                 IOException.class,
                 File.class);
         logIOException.setAccessible(true);
-        logIOException.invoke(check, new IOException(), new File(""));
+        logIOException.invoke(check, new IOException("test exception"), new File(""));
     }
 
 }
