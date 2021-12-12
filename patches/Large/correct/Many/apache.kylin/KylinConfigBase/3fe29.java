diff --git a/core-common/src/main/java/org/apache/kylin/common/KylinConfigBase.java b/core-common/src/main/java/org/apache/kylin/common/KylinConfigBase.java
index 4833ca9..c9e2b97 100644
--- a/core-common/src/main/java/org/apache/kylin/common/KylinConfigBase.java
+++ b/core-common/src/main/java/org/apache/kylin/common/KylinConfigBase.java
@@ -799,7 +799,7 @@
         int v = Integer.parseInt(getOptional("kylin.source.hive.default-varchar-precision", "256"));
         if (v < 1) {
             return 256;
-        } else if (v > 65355) {
+        } else if (v > 65535) {
             return 65535;
         } else {
             return v;
