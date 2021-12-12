diff --git a/sql/src/main/java/io/crate/metadata/TableIdent.java b/sql/src/main/java/io/crate/metadata/TableIdent.java
index 52ffe17..c20e6a0 100644
--- a/sql/src/main/java/io/crate/metadata/TableIdent.java
+++ b/sql/src/main/java/io/crate/metadata/TableIdent.java
@@ -46,7 +46,7 @@
         if (parts.size() == 2) {
             return new TableIdent(parts.get(0), parts.get(1));
         }
-        return new TableIdent(null, parts.get(1));
+        return new TableIdent(null, parts.get(0));
     }
 
     public TableIdent() {
