diff --git a/java/org/apache/catalina/core/AprLifecycleListener.java b/java/org/apache/catalina/core/AprLifecycleListener.java
index 8029097..da94c6b 100644
--- a/java/org/apache/catalina/core/AprLifecycleListener.java
+++ b/java/org/apache/catalina/core/AprLifecycleListener.java
@@ -213,7 +213,10 @@
         }
 
         log.info(sm.getString("aprListener.tcnValid", major + "."
-                    + minor + "." + patch));
+                    + minor + "." + patch,
+                    Library.APR_MAJOR_VERSION + "."
+                    + Library.APR_MINOR_VERSION + "."
+                    + Library.APR_PATCH_VERSION));
 
         // Log APR flags
         log.info(sm.getString("aprListener.flags",
