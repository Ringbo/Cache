diff --git a/demos/src/main/java/org/jboss/as/demos/domain/configs/runner/ExampleRunner.java b/demos/src/main/java/org/jboss/as/demos/domain/configs/runner/ExampleRunner.java
index e16da56..827bd73 100644
--- a/demos/src/main/java/org/jboss/as/demos/domain/configs/runner/ExampleRunner.java
+++ b/demos/src/main/java/org/jboss/as/demos/domain/configs/runner/ExampleRunner.java
@@ -78,7 +78,7 @@
 
             System.out.println("-- host configuration");
             final ModelNode hostResult = result.get(RESULT).clone();
-            System.out.println();
+            System.out.println(hostResult);
             System.out.println("--");
 
         } finally {
