diff --git a/driver/src/examples/primer/IndexesPrimer.java b/driver/src/examples/primer/IndexesPrimer.java
index dde3cc5..c2a6873 100644
--- a/driver/src/examples/primer/IndexesPrimer.java
+++ b/driver/src/examples/primer/IndexesPrimer.java
@@ -41,7 +41,7 @@
     public void  createCompoundIndex() {
         // @begin: create-compound-index
         // @code: start
-        db.getCollection("restaurants").createIndex(new Document("cuisine", 1).append("address.zipcode", 1));
+        db.getCollection("restaurants").createIndex(new Document("cuisine", 1).append("address.zipcode", -1));
         // @code: end
 
         // @post: The method does not return a result.
