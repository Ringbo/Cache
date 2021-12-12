diff --git a/core/src/main/java/org/apache/mahout/cf/taste/impl/model/AbstractIDMigrator.java b/core/src/main/java/org/apache/mahout/cf/taste/impl/model/AbstractIDMigrator.java
index 0338548..30db22b 100644
--- a/core/src/main/java/org/apache/mahout/cf/taste/impl/model/AbstractIDMigrator.java
+++ b/core/src/main/java/org/apache/mahout/cf/taste/impl/model/AbstractIDMigrator.java
@@ -56,7 +56,7 @@
   }
 
   @Override
-  public long toLongID(String stringID) throws TasteException {
+  public long toLongID(String stringID) {
     return hash(stringID);
   }
 
