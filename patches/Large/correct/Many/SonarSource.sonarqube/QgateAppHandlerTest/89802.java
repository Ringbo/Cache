diff --git a/sonar-server/src/test/java/org/sonar/server/qualitygate/ws/QgateAppHandlerTest.java b/sonar-server/src/test/java/org/sonar/server/qualitygate/ws/QgateAppHandlerTest.java
index f46bb13..bc03342 100644
--- a/sonar-server/src/test/java/org/sonar/server/qualitygate/ws/QgateAppHandlerTest.java
+++ b/sonar-server/src/test/java/org/sonar/server/qualitygate/ws/QgateAppHandlerTest.java
@@ -89,7 +89,7 @@
     Collection<Map> periods = (Collection<Map>) responseJson.get("periods");
     assertThat(periods).hasSize(3);
     Map messages = (Map) responseJson.get("messages");
-    assertThat(messages).isNotNull().isNotEmpty().hasSize(51);
+    assertThat(messages).isNotNull().isNotEmpty().hasSize(53);
     for (Entry message: (Set<Entry>) messages.entrySet()) {
       assertThat(message.getKey()).isEqualTo(message.getValue());
     }
