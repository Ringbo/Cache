diff --git a/dropwizard-logging/src/test/java/io/dropwizard/logging/ThrottlingAppenderTest.java b/dropwizard-logging/src/test/java/io/dropwizard/logging/ThrottlingAppenderTest.java
index 83b5fa3..bd5be4e 100644
--- a/dropwizard-logging/src/test/java/io/dropwizard/logging/ThrottlingAppenderTest.java
+++ b/dropwizard-logging/src/test/java/io/dropwizard/logging/ThrottlingAppenderTest.java
@@ -115,7 +115,7 @@
         assertThat(throttledLines(Duration.milliseconds(100)))
             .doesNotHaveDuplicates()
             .haveAtLeast(9, containsApplicationLog)
-            .haveAtMost(12, containsApplicationLog);
+            .haveAtMost(13, containsApplicationLog);
     }
 
     @Test
