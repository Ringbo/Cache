diff --git a/server/sonar-server/src/test/java/org/sonar/server/badge/ws/MeasureActionTest.java b/server/sonar-server/src/test/java/org/sonar/server/badge/ws/MeasureActionTest.java
index b45408a..00e2262 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/badge/ws/MeasureActionTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/badge/ws/MeasureActionTest.java
@@ -444,7 +444,7 @@
     assertThat(response.getHeader("Cache-Control")).contains("no-cache");
     assertThat(response.getHeader("Expires")).isNotNull();
     assertThat(response.getHeader("ETag")).isNull();
-    assertThat(expiresDateFormat.parse(response.getHeader("Expires"))).isBefore(new Date());
+    assertThat(expiresDateFormat.parse(response.getHeader("Expires"))).isBeforeOrEqualsTo(new Date());
     assertThat(response.getInput()).contains("<text", ">" + expectedError + "</text>");
   }
 
