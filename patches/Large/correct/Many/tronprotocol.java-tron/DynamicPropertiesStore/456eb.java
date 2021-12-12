diff --git a/src/main/java/org/tron/core/db/DynamicPropertiesStore.java b/src/main/java/org/tron/core/db/DynamicPropertiesStore.java
index f53c6ff..3ddfd66 100755
--- a/src/main/java/org/tron/core/db/DynamicPropertiesStore.java
+++ b/src/main/java/org/tron/core/db/DynamicPropertiesStore.java
@@ -221,7 +221,7 @@
     try {
       this.getTotalNetWeight();
     } catch (IllegalArgumentException e) {
-      this.saveTotalNetWeight(0L);
+      this.saveTotalNetWeight(1L);
     }
 
     try {
