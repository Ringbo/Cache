diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridChangeGlobalStateMessageResponse.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridChangeGlobalStateMessageResponse.java
index 62b67b1..0d04ccb 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridChangeGlobalStateMessageResponse.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridChangeGlobalStateMessageResponse.java
@@ -157,7 +157,7 @@
 
     /** {@inheritDoc} */
     @Override public short directType() {
-        return -46;
+        return -45;
     }
 
     /** {@inheritDoc} */
