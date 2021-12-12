diff --git a/engine/src/main/java/org/terasology/persistence/serializers/EntityDataJSONFormat.java b/engine/src/main/java/org/terasology/persistence/serializers/EntityDataJSONFormat.java
index 5296733..e5d5a9f 100644
--- a/engine/src/main/java/org/terasology/persistence/serializers/EntityDataJSONFormat.java
+++ b/engine/src/main/java/org/terasology/persistence/serializers/EntityDataJSONFormat.java
@@ -57,11 +57,11 @@
     private EntityDataJSONFormat() {
     }
 
-    public static void write(EntityData.GlobalStore world, BufferedWriter writer) throws IOException {
+    public static void write(EntityData.GlobalStore world, BufferedWriter writer) {
         newGson().toJson(world, writer);
     }
 
-    public static void write(EntityData.Prefab prefab, BufferedWriter writer) throws IOException {
+    public static void write(EntityData.Prefab prefab, BufferedWriter writer) {
         newGson().toJson(prefab, writer);
     }
 
