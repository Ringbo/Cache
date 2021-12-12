diff --git a/h2/src/test/org/h2/test/TestBase.java b/h2/src/test/org/h2/test/TestBase.java
index e6fb0f5..43d763a 100644
--- a/h2/src/test/org/h2/test/TestBase.java
+++ b/h2/src/test/org/h2/test/TestBase.java
@@ -273,7 +273,7 @@
             url = name;
         }
         if (config.mvStore) {
-            url = addOption(name, "MV_STORE", "true");
+            url = addOption(url, "MV_STORE", "true");
         }
         if (!config.memory) {
             if (config.smallLog && admin) {
