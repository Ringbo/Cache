diff --git a/requery/src/main/java/io/requery/sql/BuildableEntityResultReader.java b/requery/src/main/java/io/requery/sql/BuildableEntityResultReader.java
index 05288a2..3560e7c 100644
--- a/requery/src/main/java/io/requery/sql/BuildableEntityResultReader.java
+++ b/requery/src/main/java/io/requery/sql/BuildableEntityResultReader.java
@@ -28,7 +28,7 @@
     private final EntityReader<E, S> reader;
     private Attribute<?, ?>[] attributes;
 
-    public BuildableEntityResultReader(EntityReader<E, S> reader, Attribute<?, ?>[] attributes) {
+    BuildableEntityResultReader(EntityReader<E, S> reader, Attribute<?, ?>[] attributes) {
         this.reader = reader;
         this.attributes = attributes;
     }
