diff --git a/server/sonar-server/src/test/java/org/sonar/server/measure/template/ProjectFilterTest.java b/server/sonar-server/src/test/java/org/sonar/server/measure/template/ProjectFilterTest.java
index e5ea290..85950a8 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/measure/template/ProjectFilterTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/measure/template/ProjectFilterTest.java
@@ -34,6 +34,6 @@
     assertThat(template.getName()).isEqualTo("Projects");
     assertThat(filter).isNotNull();
     assertThat(filter.getCriteria()).hasSize(1);
-    assertThat(filter.getColumns()).hasSize(6);
+    assertThat(filter.getColumns()).hasSize(8);
   }
 }
