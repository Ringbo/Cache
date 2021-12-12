diff --git a/cli/src/main/java/org/jboss/as/cli/impl/CommandContextImpl.java b/cli/src/main/java/org/jboss/as/cli/impl/CommandContextImpl.java
index a8e6c73..80276c8 100644
--- a/cli/src/main/java/org/jboss/as/cli/impl/CommandContextImpl.java
+++ b/cli/src/main/java/org/jboss/as/cli/impl/CommandContextImpl.java
@@ -850,7 +850,7 @@
         if (trustManager == null || (lastChain = trustManager.getLastFailedCertificateChain()) == null) {
             return false;
         }
-        error("Unable to connect due to unrecognised server certificate");
+        printLine("Unable to connect due to unrecognised server certificate");
         for (Certificate current : lastChain) {
             if (current instanceof X509Certificate) {
                 X509Certificate x509Current = (X509Certificate) current;
