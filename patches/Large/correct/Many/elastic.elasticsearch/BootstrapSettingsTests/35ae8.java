diff --git a/core/src/test/java/org/elasticsearch/bootstrap/BootstrapSettingsTests.java b/core/src/test/java/org/elasticsearch/bootstrap/BootstrapSettingsTests.java
index 8fd1b5a..0ed6c8d 100644
--- a/core/src/test/java/org/elasticsearch/bootstrap/BootstrapSettingsTests.java
+++ b/core/src/test/java/org/elasticsearch/bootstrap/BootstrapSettingsTests.java
@@ -43,7 +43,7 @@
         long maxFileDescriptorCount = ProcessProbe.getInstance().getMaxFileDescriptorCount();
         try {
             Bootstrap.enforceOrLogLimits(build);
-            if (maxFileDescriptorCount != -1 || maxFileDescriptorCount < (1 << 16)) {
+            if (maxFileDescriptorCount != -1 && maxFileDescriptorCount < (1 << 16)) {
                 fail("must have enforced limits: " + maxFileDescriptorCount);
             }
         } catch (IllegalStateException ex) {
