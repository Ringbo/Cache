diff --git a/test/com/facebook/buck/java/MissingSymbolsHandlerIntegrationTest.java b/test/com/facebook/buck/java/MissingSymbolsHandlerIntegrationTest.java
index f4520ba..417feac 100644
--- a/test/com/facebook/buck/java/MissingSymbolsHandlerIntegrationTest.java
+++ b/test/com/facebook/buck/java/MissingSymbolsHandlerIntegrationTest.java
@@ -117,7 +117,7 @@
 
     assertThat(
         "Output should describe the missing dependency.",
-        processResult.getStdout(),
+        processResult.getStderr(),
         containsString(expectedDependencyOutput));
   }
 
@@ -140,7 +140,7 @@
 
     assertThat(
         "Output should describe the missing dependency.",
-        processResult.getStdout(),
+        processResult.getStderr(),
         containsString(expectedDependencyOutput));
   }
 }
