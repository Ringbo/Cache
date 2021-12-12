diff --git a/flyway-commandline/src/main/java/org/flywaydb/commandline/Main.java b/flyway-commandline/src/main/java/org/flywaydb/commandline/Main.java
index 162d929..d054656 100644
--- a/flyway-commandline/src/main/java/org/flywaydb/commandline/Main.java
+++ b/flyway-commandline/src/main/java/org/flywaydb/commandline/Main.java
@@ -182,7 +182,7 @@
      * @throws IOException when the version could not be read.
      */
     private static void printVersion() throws IOException {
-        VersionPrinter.printVersion(Thread.currentThread().getContextClassLoader());
+        VersionPrinter.printVersion();
         LOG.info("");
 
         LOG.debug("Java " + System.getProperty("java.version") + " (" + System.getProperty("java.vendor") + ")");
