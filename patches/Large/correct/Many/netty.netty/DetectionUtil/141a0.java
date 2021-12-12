diff --git a/common/src/main/java/io/netty/util/internal/DetectionUtil.java b/common/src/main/java/io/netty/util/internal/DetectionUtil.java
index 9a77cb7..abe8de9 100644
--- a/common/src/main/java/io/netty/util/internal/DetectionUtil.java
+++ b/common/src/main/java/io/netty/util/internal/DetectionUtil.java
@@ -68,7 +68,7 @@
         if (value == null) {
             value = SystemPropertyUtil.get("org.jboss.netty.tryUnsafe", "true");
         }
-        if ("true".equalsIgnoreCase(value)) {
+        if (!"true".equalsIgnoreCase(value)) {
             return false;
         }
 
