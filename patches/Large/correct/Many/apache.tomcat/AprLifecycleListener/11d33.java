diff --git a/java/org/apache/catalina/core/AprLifecycleListener.java b/java/org/apache/catalina/core/AprLifecycleListener.java
index 8523555..e7b4d94 100644
--- a/java/org/apache/catalina/core/AprLifecycleListener.java
+++ b/java/org/apache/catalina/core/AprLifecycleListener.java
@@ -161,7 +161,7 @@
         int patch = 0;
         int apver = 0;
         int rqver = TCN_REQUIRED_MAJOR * 1000 + TCN_REQUIRED_MINOR * 100 + TCN_REQUIRED_PATCH;
-        int rcver = TCN_REQUIRED_MAJOR * 1000 + TCN_REQUIRED_MINOR * 100 + TCN_RECOMMENDED_PV;
+        int rcver = TCN_REQUIRED_MAJOR * 1000 + TCN_RECOMMENDED_MINOR * 100 + TCN_RECOMMENDED_PV;
 
         if (aprInitialized) {
             return;
