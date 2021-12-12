diff --git a/src/core/org/apache/jmeter/util/SSLManager.java b/src/core/org/apache/jmeter/util/SSLManager.java
index bd50649..f2cde2e 100644
--- a/src/core/org/apache/jmeter/util/SSLManager.java
+++ b/src/core/org/apache/jmeter/util/SSLManager.java
@@ -120,7 +120,7 @@
                 log.info("KeyStore created OK");
             } catch (Exception e) {
                 this.keyStore = null;
-                throw new RuntimeException("Could not create keystore: "+e.getMessage(), e);
+                throw new IllegalArgumentException("Could not create keystore: "+e.getMessage(), e);
             }
 
             try {
