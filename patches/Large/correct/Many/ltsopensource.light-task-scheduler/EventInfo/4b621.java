diff --git a/lts-core/src/main/java/com/lts/ec/EventInfo.java b/lts-core/src/main/java/com/lts/ec/EventInfo.java
index 51474ed..1077861 100644
--- a/lts-core/src/main/java/com/lts/ec/EventInfo.java
+++ b/lts-core/src/main/java/com/lts/ec/EventInfo.java
@@ -32,7 +32,7 @@
 
     public Object getParam(String key) {
         if (params != null) {
-            return params.remove(key);
+            return params.get(key);
         }
         return null;
     }
