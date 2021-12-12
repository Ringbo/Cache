diff --git a/src/core/org/apache/jmeter/gui/action/Restart.java b/src/core/org/apache/jmeter/gui/action/Restart.java
index b330880..4e5a2f8 100644
--- a/src/core/org/apache/jmeter/gui/action/Restart.java
+++ b/src/core/org/apache/jmeter/gui/action/Restart.java
@@ -79,9 +79,8 @@
      * 
      * @param runBeforeRestart
      *            some custom code to be run before restarting
-     * @throws Exception
      */
-    public static void restartApplication(Runnable runBeforeRestart) throws Exception {
+    public static void restartApplication(Runnable runBeforeRestart) {
         // java binary
         String java = System.getProperty("java.home") + "/bin/java";
         // vm arguments
