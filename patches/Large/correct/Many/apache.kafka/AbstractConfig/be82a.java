diff --git a/clients/src/main/java/org/apache/kafka/common/config/AbstractConfig.java b/clients/src/main/java/org/apache/kafka/common/config/AbstractConfig.java
index bae528d..ec3ae15 100644
--- a/clients/src/main/java/org/apache/kafka/common/config/AbstractConfig.java
+++ b/clients/src/main/java/org/apache/kafka/common/config/AbstractConfig.java
@@ -122,7 +122,7 @@
      */
     public void logUnused() {
         for (String key : unused())
-            log.warn("The configuration {} = {} was supplied but isn't a known config.", key, this.values.get(key));
+            log.warn("The configuration {} = {} was supplied but isn't a known config.", key, this.originals.get(key));
     }
 
     /**
