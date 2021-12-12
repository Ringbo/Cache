diff --git a/tools/layoutlib/bridge/tests/src/com/android/layoutlib/bridge/intensive/Main.java b/tools/layoutlib/bridge/tests/src/com/android/layoutlib/bridge/intensive/Main.java
index b2909c9..ee448ca 100644
--- a/tools/layoutlib/bridge/tests/src/com/android/layoutlib/bridge/intensive/Main.java
+++ b/tools/layoutlib/bridge/tests/src/com/android/layoutlib/bridge/intensive/Main.java
@@ -285,7 +285,7 @@
                 ConfigGenerator.getEnumMap(attrs), getLayoutLog());
     }
 
-    /** Text activity.xml */
+    /** Test activity.xml */
     @Test
     public void testActivity() throws ClassNotFoundException {
         renderAndVerify("activity.xml", "activity.png");
@@ -404,7 +404,7 @@
         ResourceResolver resourceResolver =
                 ResourceResolver.create(sProjectResources.getConfiguredResources(config),
                         sFrameworkRepo.getConfiguredResources(config),
-                        themeName, true);
+                        themeName, false);
 
         return new SessionParams(
                 layoutParser,
