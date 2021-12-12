diff --git a/src/java/com/twitter/common/net/http/handlers/VarsJsonHandler.java b/src/java/com/twitter/common/net/http/handlers/VarsJsonHandler.java
index c376dce..98a5da4 100644
--- a/src/java/com/twitter/common/net/http/handlers/VarsJsonHandler.java
+++ b/src/java/com/twitter/common/net/http/handlers/VarsJsonHandler.java
@@ -50,7 +50,7 @@
 
   @VisibleForTesting
   String getBody(boolean pretty) {
-    Map<String, Object> vars = Maps.newHashMap();
+    Map<String, Object> vars = Maps.newLinkedHashMap();
     for (Stat<?> var : statSupplier.get()) {
       vars.put(var.getName(), var.read());
     }
