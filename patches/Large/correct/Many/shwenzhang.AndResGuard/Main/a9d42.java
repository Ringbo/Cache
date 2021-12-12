diff --git a/AndResGuard-core/src/main/java/com/tencent/mm/resourceproguard/Main.java b/AndResGuard-core/src/main/java/com/tencent/mm/resourceproguard/Main.java
index ec54411..a5be176 100644
--- a/AndResGuard-core/src/main/java/com/tencent/mm/resourceproguard/Main.java
+++ b/AndResGuard-core/src/main/java/com/tencent/mm/resourceproguard/Main.java
@@ -52,10 +52,7 @@
 
     private void loadConfigFromGradle(InputParam inputParam) {
         try {
-            config = new Configuration(
-                inputParam,
-                m7zipPath
-            );
+            config = new Configuration(inputParam);
         } catch (IOException e) {
             e.printStackTrace();
         }
