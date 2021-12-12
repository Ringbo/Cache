diff --git a/java/org/apache/catalina/core/StandardWrapper.java b/java/org/apache/catalina/core/StandardWrapper.java
index 35613a7..d5f7ffb 100644
--- a/java/org/apache/catalina/core/StandardWrapper.java
+++ b/java/org/apache/catalina/core/StandardWrapper.java
@@ -1480,7 +1480,7 @@
                         try {
                             SecurityUtil.doAsPrivilege("destroy", s);
                         } finally {
-                            SecurityUtil.remove(instance);
+                            SecurityUtil.remove(s);
                         }
                     } else {
                         s.destroy();
