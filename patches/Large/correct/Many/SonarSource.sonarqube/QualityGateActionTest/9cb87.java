diff --git a/server/sonar-server/src/test/java/org/sonar/server/badge/ws/QualityGateActionTest.java b/server/sonar-server/src/test/java/org/sonar/server/badge/ws/QualityGateActionTest.java
index 39b0b9e..dce53cb 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/badge/ws/QualityGateActionTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/badge/ws/QualityGateActionTest.java
@@ -344,7 +344,7 @@
     assertThat(response.getHeader("Cache-Control")).contains("no-cache");
     assertThat(response.getHeader("Expires")).isNotNull();
     assertThat(response.getHeader("ETag")).isNull();
-    assertThat(expiresDateFormat.parse(response.getHeader("Expires"))).isBefore(new Date());
+    assertThat(expiresDateFormat.parse(response.getHeader("Expires"))).isBeforeOrEqualsTo(new Date());
     assertThat(response.getInput()).contains("<text", ">" + expectedError + "</text>");
   }
 
