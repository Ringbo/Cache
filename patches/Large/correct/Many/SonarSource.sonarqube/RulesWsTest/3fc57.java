diff --git a/sonar-server/src/test/java/org/sonar/server/rule/ws/RulesWsTest.java b/sonar-server/src/test/java/org/sonar/server/rule/ws/RulesWsTest.java
index ed1aef2..3c71fd5 100644
--- a/sonar-server/src/test/java/org/sonar/server/rule/ws/RulesWsTest.java
+++ b/sonar-server/src/test/java/org/sonar/server/rule/ws/RulesWsTest.java
@@ -65,7 +65,7 @@
     assertThat(list.since()).isEqualTo("4.3");
     assertThat(list.isPost()).isFalse();
     assertThat(list.isInternal()).isFalse();
-    assertThat(list.params()).hasSize(4);
+    assertThat(list.params()).hasSize(11);
 
     WebService.Action show = controller.action("show");
     assertThat(show).isNotNull();
