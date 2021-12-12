diff --git a/tests/src/test/java/org/sonarqube/tests/analysis/ProjectBuilderTest.java b/tests/src/test/java/org/sonarqube/tests/analysis/ProjectBuilderTest.java
index 21546d2..d409a22 100644
--- a/tests/src/test/java/org/sonarqube/tests/analysis/ProjectBuilderTest.java
+++ b/tests/src/test/java/org/sonarqube/tests/analysis/ProjectBuilderTest.java
@@ -65,7 +65,7 @@
     assertThat(getComponent(orchestrator, "com.sonarsource.it.projects.batch:project-builder").getName()).isEqualTo("Name changed by plugin");
 
     Map<String, Double> measures = getMeasures("com.sonarsource.it.projects.batch:project-builder");
-    assertThat(measures.get("files")).isEqualTo(2);
+    assertThat(measures.get("files")).isEqualTo(3);
     assertThat(measures.get("lines")).isGreaterThan(10);
   }
 
