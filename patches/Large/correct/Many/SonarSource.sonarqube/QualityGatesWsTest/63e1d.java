diff --git a/sonar-server/src/test/java/org/sonar/server/qualitygate/ws/QualityGatesWsTest.java b/sonar-server/src/test/java/org/sonar/server/qualitygate/ws/QualityGatesWsTest.java
index 29c211a..065b408 100644
--- a/sonar-server/src/test/java/org/sonar/server/qualitygate/ws/QualityGatesWsTest.java
+++ b/sonar-server/src/test/java/org/sonar/server/qualitygate/ws/QualityGatesWsTest.java
@@ -77,7 +77,7 @@
     assertThat(list.handler()).isNotNull();
     assertThat(list.since()).isEqualTo("4.3");
     assertThat(list.isPost()).isFalse();
-    assertThat(list.isPrivate()).isFalse();
+    assertThat(list.isInternal()).isFalse();
 
     WebService.Action show = controller.action("show");
     assertThat(show).isNotNull();
@@ -85,7 +85,7 @@
     assertThat(show.since()).isEqualTo("4.3");
     assertThat(show.isPost()).isFalse();
     assertThat(show.param("id")).isNotNull();
-    assertThat(show.isPrivate()).isFalse();
+    assertThat(show.isInternal()).isFalse();
 
     WebService.Action create = controller.action("create");
     assertThat(create).isNotNull();
@@ -93,7 +93,7 @@
     assertThat(create.since()).isEqualTo("4.3");
     assertThat(create.isPost()).isTrue();
     assertThat(create.param("name")).isNotNull();
-    assertThat(create.isPrivate()).isFalse();
+    assertThat(create.isInternal()).isFalse();
 
     WebService.Action copy = controller.action("copy");
     assertThat(copy).isNotNull();
@@ -102,7 +102,7 @@
     assertThat(copy.isPost()).isTrue();
     assertThat(copy.param("id")).isNotNull();
     assertThat(copy.param("name")).isNotNull();
-    assertThat(copy.isPrivate()).isFalse();
+    assertThat(copy.isInternal()).isFalse();
 
     WebService.Action destroy = controller.action("destroy");
     assertThat(destroy).isNotNull();
@@ -110,7 +110,7 @@
     assertThat(destroy.since()).isEqualTo("4.3");
     assertThat(destroy.isPost()).isTrue();
     assertThat(destroy.param("id")).isNotNull();
-    assertThat(destroy.isPrivate()).isFalse();
+    assertThat(destroy.isInternal()).isFalse();
 
     WebService.Action rename = controller.action("rename");
     assertThat(rename).isNotNull();
@@ -119,7 +119,7 @@
     assertThat(rename.isPost()).isTrue();
     assertThat(rename.param("id")).isNotNull();
     assertThat(rename.param("name")).isNotNull();
-    assertThat(rename.isPrivate()).isFalse();
+    assertThat(rename.isInternal()).isFalse();
 
     WebService.Action setDefault = controller.action("set_as_default");
     assertThat(setDefault).isNotNull();
@@ -127,14 +127,14 @@
     assertThat(setDefault.since()).isEqualTo("4.3");
     assertThat(setDefault.isPost()).isTrue();
     assertThat(setDefault.param("id")).isNotNull();
-    assertThat(setDefault.isPrivate()).isFalse();
+    assertThat(setDefault.isInternal()).isFalse();
 
     WebService.Action unsetDefault = controller.action("unset_default");
     assertThat(unsetDefault).isNotNull();
     assertThat(unsetDefault.handler()).isNotNull();
     assertThat(unsetDefault.since()).isEqualTo("4.3");
     assertThat(unsetDefault.isPost()).isTrue();
-    assertThat(unsetDefault.isPrivate()).isFalse();
+    assertThat(unsetDefault.isInternal()).isFalse();
 
     WebService.Action createCondition = controller.action("create_condition");
     assertThat(createCondition).isNotNull();
@@ -147,7 +147,7 @@
     assertThat(createCondition.param("warning")).isNotNull();
     assertThat(createCondition.param("error")).isNotNull();
     assertThat(createCondition.param("period")).isNotNull();
-    assertThat(createCondition.isPrivate()).isFalse();
+    assertThat(createCondition.isInternal()).isFalse();
 
     WebService.Action updateCondition = controller.action("update_condition");
     assertThat(updateCondition).isNotNull();
@@ -160,7 +160,7 @@
     assertThat(updateCondition.param("warning")).isNotNull();
     assertThat(updateCondition.param("error")).isNotNull();
     assertThat(updateCondition.param("period")).isNotNull();
-    assertThat(updateCondition.isPrivate()).isFalse();
+    assertThat(updateCondition.isInternal()).isFalse();
 
     WebService.Action deleteCondition = controller.action("delete_condition");
     assertThat(deleteCondition).isNotNull();
@@ -168,7 +168,7 @@
     assertThat(deleteCondition.since()).isEqualTo("4.3");
     assertThat(deleteCondition.isPost()).isTrue();
     assertThat(deleteCondition.param("id")).isNotNull();
-    assertThat(deleteCondition.isPrivate()).isFalse();
+    assertThat(deleteCondition.isInternal()).isFalse();
 
   }
 
