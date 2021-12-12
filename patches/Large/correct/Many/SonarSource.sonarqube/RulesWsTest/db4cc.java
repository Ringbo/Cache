diff --git a/sonar-server/src/test/java/org/sonar/server/rule/ws/RulesWsTest.java b/sonar-server/src/test/java/org/sonar/server/rule/ws/RulesWsTest.java
index 3c71fd5..a8e0e86 100644
--- a/sonar-server/src/test/java/org/sonar/server/rule/ws/RulesWsTest.java
+++ b/sonar-server/src/test/java/org/sonar/server/rule/ws/RulesWsTest.java
@@ -64,7 +64,7 @@
     assertThat(list.handler()).isNotNull();
     assertThat(list.since()).isEqualTo("4.3");
     assertThat(list.isPost()).isFalse();
-    assertThat(list.isInternal()).isFalse();
+    assertThat(list.isInternal()).isTrue();
     assertThat(list.params()).hasSize(11);
 
     WebService.Action show = controller.action("show");
