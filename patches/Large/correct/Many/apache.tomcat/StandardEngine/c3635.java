diff --git a/java/org/apache/catalina/core/StandardEngine.java b/java/org/apache/catalina/core/StandardEngine.java
index eebb937..3e2f051 100644
--- a/java/org/apache/catalina/core/StandardEngine.java
+++ b/java/org/apache/catalina/core/StandardEngine.java
@@ -424,7 +424,7 @@
                 // Force re-calculation but do not disable listener since it
                 // might be re-used
                 engine.defaultAccessLog = null;
-            } else if (Lifecycle.BEFORE_DESTROY_EVENT.endsWith(type)) {
+            } else if (Lifecycle.BEFORE_DESTROY_EVENT.equals(type)) {
                 // Container is being removed
                 // Force re-calculation and disable listener since it won't
                 // be re-used
