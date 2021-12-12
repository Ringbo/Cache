diff --git a/graylog2-inputs/src/main/java/org/graylog2/inputs/raw/tcp/RawTCPInput.java b/graylog2-inputs/src/main/java/org/graylog2/inputs/raw/tcp/RawTCPInput.java
index bdffce2..2ce82e9 100644
--- a/graylog2-inputs/src/main/java/org/graylog2/inputs/raw/tcp/RawTCPInput.java
+++ b/graylog2-inputs/src/main/java/org/graylog2/inputs/raw/tcp/RawTCPInput.java
@@ -42,7 +42,7 @@
  */
 public class RawTCPInput extends RawInputBase {
 
-    private static final Logger LOG = LoggerFactory.getLogger(RawUDPInput.class);
+    private static final Logger LOG = LoggerFactory.getLogger(RawTCPInput.class);
 
     public static final String NAME = "Raw/Plaintext TCP";
 
