diff --git a/common/src/main/java/com/kylinolap/common/util/AbstractKylinTestCase.java b/common/src/main/java/com/kylinolap/common/util/AbstractKylinTestCase.java
index a8c3cd2..fdbe0e0 100644
--- a/common/src/main/java/com/kylinolap/common/util/AbstractKylinTestCase.java
+++ b/common/src/main/java/com/kylinolap/common/util/AbstractKylinTestCase.java
@@ -66,7 +66,7 @@
 
         try {
             config = KylinConfig.getInstanceFromEnv();
-        } catch (IllegalArgumentException e) {
+        } catch (Exception e) {
             // do nothing.
         }
         if (config == null) // there is no Kylin config in current env.
