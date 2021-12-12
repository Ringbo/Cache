diff --git a/requery-processor/src/main/java/io/requery/processor/AndroidParcelableExtension.java b/requery-processor/src/main/java/io/requery/processor/AndroidParcelableExtension.java
index 1728a1d..0c4577f 100644
--- a/requery-processor/src/main/java/io/requery/processor/AndroidParcelableExtension.java
+++ b/requery-processor/src/main/java/io/requery/processor/AndroidParcelableExtension.java
@@ -43,7 +43,7 @@
 
     private final Types types;
 
-    public AndroidParcelableExtension(Types types) {
+    AndroidParcelableExtension(Types types) {
         this.types = types;
     }
 
