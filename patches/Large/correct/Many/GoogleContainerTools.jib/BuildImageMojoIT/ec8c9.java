diff --git a/jib-maven-plugin/src/test/java/com/google/cloud/tools/jib/maven/BuildImageMojoIT.java b/jib-maven-plugin/src/test/java/com/google/cloud/tools/jib/maven/BuildImageMojoIT.java
index 4ed3990..a883ac6 100644
--- a/jib-maven-plugin/src/test/java/com/google/cloud/tools/jib/maven/BuildImageMojoIT.java
+++ b/jib-maven-plugin/src/test/java/com/google/cloud/tools/jib/maven/BuildImageMojoIT.java
@@ -70,7 +70,13 @@
 
     verifier.verifyErrorFreeLog();
 
-    Assert.assertTrue(timeOne > timeTwo);
+    Assert.assertTrue(
+        "First build time ("
+            + timeOne
+            + ") is not greater than second build time ("
+            + timeTwo
+            + ")",
+        timeOne > timeTwo);
 
     new Command("docker", "pull", imageReference).run();
     return new Command("docker", "run", imageReference).run();
