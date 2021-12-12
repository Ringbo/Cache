diff --git a/plugins/core/impl/src/main/java/org/pentaho/di/trans/steps/checksum/CheckSumMeta.java b/plugins/core/impl/src/main/java/org/pentaho/di/trans/steps/checksum/CheckSumMeta.java
index 3410453..d79c38e 100644
--- a/plugins/core/impl/src/main/java/org/pentaho/di/trans/steps/checksum/CheckSumMeta.java
+++ b/plugins/core/impl/src/main/java/org/pentaho/di/trans/steps/checksum/CheckSumMeta.java
@@ -132,7 +132,7 @@
   }
 
   public String[] getChecksumtypeDescs() {
-    return checksumtypeCodes;
+    return checksumtypeDescs;
   }
 
   public String[] getResultTypeDescs() {
