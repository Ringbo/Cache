diff --git a/src/test/java/org/mapdb/elsa/Bean1.java b/src/test/java/org/mapdb/elsa/Bean1.java
index f4822dd..626bb69 100644
--- a/src/test/java/org/mapdb/elsa/Bean1.java
+++ b/src/test/java/org/mapdb/elsa/Bean1.java
@@ -45,11 +45,11 @@
             this.field2 = field2;
         }
 
-        Bean1(String field1, String field2) {
+        public Bean1(String field1, String field2) {
             this.field1 = field1;
             this.field2 = field2;
         }
 
-        Bean1() {
+        public Bean1() {
         }
     }
