diff --git a/server/sonar-server/src/test/java/org/sonar/server/platform/SwitchLogbackAppenderTest.java b/server/sonar-server/src/test/java/org/sonar/server/platform/SwitchLogbackAppenderTest.java
index faaa89a..83a282b 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/platform/SwitchLogbackAppenderTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/platform/SwitchLogbackAppenderTest.java
@@ -87,7 +87,7 @@
       assertThat(console.list).hasSize(1);
       assertThat(console.list.get(0).getMessage()).isEqualTo("a warning");
 
-      logger.warn("an error");
+      logger.error("an error");
       assertThat(analyisReports.list).hasSize(3);
       assertThat(analyisReports.list.get(2).getMessage()).isEqualTo("an error");
       assertThat(console.list).hasSize(2);
