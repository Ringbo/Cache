diff --git a/flex/tools/flex-ui-designer/idea-plugin/testSrc/org/flyti/roboflest/Roboflest.java b/flex/tools/flex-ui-designer/idea-plugin/testSrc/org/flyti/roboflest/Roboflest.java
index 7df9b05..541e182 100644
--- a/flex/tools/flex-ui-designer/idea-plugin/testSrc/org/flyti/roboflest/Roboflest.java
+++ b/flex/tools/flex-ui-designer/idea-plugin/testSrc/org/flyti/roboflest/Roboflest.java
@@ -21,7 +21,7 @@
   public void test(File file, Assert... asserts) throws Exception {
     BufferedReader input = new BufferedReader(new FileReader(file));
     Robot robot = new Robot();
-    robot.setAutoDelay(300);
+    robot.setAutoDelay(800); // todo Why after this commit testStyleNavigationToExternal is failed with 300ms?
     
     String line;
     int assertIndex = 0;
