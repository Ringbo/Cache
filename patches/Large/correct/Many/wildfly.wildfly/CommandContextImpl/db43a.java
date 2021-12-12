diff --git a/cli/src/main/java/org/jboss/as/cli/impl/CommandContextImpl.java b/cli/src/main/java/org/jboss/as/cli/impl/CommandContextImpl.java
index e7acad2..ee576ed 100644
--- a/cli/src/main/java/org/jboss/as/cli/impl/CommandContextImpl.java
+++ b/cli/src/main/java/org/jboss/as/cli/impl/CommandContextImpl.java
@@ -709,6 +709,14 @@
         }
     }
 
+    /**
+     * Set the exit code of the process to indicate an error and output the error message.
+     *
+     * WARNING This method should only be called for unrecoverable errors as once the exit code is set subsequent operations may
+     * not be possible.
+     *
+     * @param message The message to display.
+     */
     protected void error(String message) {
         this.exitCode = 1;
         printLine(message);
@@ -910,7 +918,7 @@
      * @return true if the certificate validation should be retried.
      */
     private boolean handleSSLFailure(Certificate[] lastChain) throws CommandLineException {
-        error("Unable to connect due to unrecognised server certificate");
+        printLine("Unable to connect due to unrecognised server certificate");
         for (Certificate current : lastChain) {
             if (current instanceof X509Certificate) {
                 X509Certificate x509Current = (X509Certificate) current;
