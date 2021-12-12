diff --git a/core-common/src/main/java/org/apache/kylin/common/KylinConfig.java b/core-common/src/main/java/org/apache/kylin/common/KylinConfig.java
index 959bc14..191d767 100644
--- a/core-common/src/main/java/org/apache/kylin/common/KylinConfig.java
+++ b/core-common/src/main/java/org/apache/kylin/common/KylinConfig.java
@@ -406,7 +406,7 @@
         if (mgr != null)
             return (T) mgr;
         
-        synchronized (this) {
+        synchronized (clz) {
             mgr = managersCache.get(clz);
             if (mgr != null)
                 return (T) mgr;
