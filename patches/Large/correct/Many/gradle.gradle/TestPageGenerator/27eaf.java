diff --git a/subprojects/performance/src/testFixtures/groovy/org/gradle/performance/results/TestPageGenerator.java b/subprojects/performance/src/testFixtures/groovy/org/gradle/performance/results/TestPageGenerator.java
index bc4b025..d5ef8c8 100644
--- a/subprojects/performance/src/testFixtures/groovy/org/gradle/performance/results/TestPageGenerator.java
+++ b/subprojects/performance/src/testFixtures/groovy/org/gradle/performance/results/TestPageGenerator.java
@@ -100,7 +100,7 @@
                             th().text("Test version").end();
                             th().text("Branch").end();
                             th().text("Git commit").end();
-                            for (int i = 0; i < 6; i++) {
+                            for (int i = 0; i < 8; i++) {
                                 for (String label : testHistory.getExperimentLabels()) {
                                     th().classAttr("numeric").text(label).end();
                                 }
