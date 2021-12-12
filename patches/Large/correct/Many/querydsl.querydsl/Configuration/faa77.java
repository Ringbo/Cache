diff --git a/querydsl-sql/src/main/java/com/querydsl/sql/Configuration.java b/querydsl-sql/src/main/java/com/querydsl/sql/Configuration.java
index acacb58..c5d6bc9 100644
--- a/querydsl-sql/src/main/java/com/querydsl/sql/Configuration.java
+++ b/querydsl-sql/src/main/java/com/querydsl/sql/Configuration.java
@@ -234,7 +234,7 @@
         if (nameMapping == null) {
             this.nameMapping = this.internalNameMapping;
         } else {
-            this.nameMapping = new ChainedNameMapping(this.nameMapping, nameMapping);
+            this.nameMapping = new ChainedNameMapping(this.internalNameMapping, nameMapping);
         }
     }
 
