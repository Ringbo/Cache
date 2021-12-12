diff --git a/driver-compat/src/main/com/mongodb/DBCollection.java b/driver-compat/src/main/com/mongodb/DBCollection.java
index a348f2d..e1abb35 100644
--- a/driver-compat/src/main/com/mongodb/DBCollection.java
+++ b/driver-compat/src/main/com/mongodb/DBCollection.java
@@ -525,19 +525,19 @@
      *
      * @param query        the deletion criteria using query operators. Omit the query parameter or pass an empty document to delete all
      *                     documents in the collection.
-     * @param writeConcern {@code WriteConcern} to be used during operation
+     * @param aWriteConcern {@code WriteConcern} to be used during operation
      * @param encoder      {@code DBEncoder} to be used
      * @return the result of the operation
      */
     @Override
-    public WriteResult remove(final DBObject query, final WriteConcern writeConcern, final DBEncoder encoder) {
+    public WriteResult remove(final DBObject query, final WriteConcern aWriteConcern, final DBEncoder encoder) {
         final Document filter = toDocument(query, encoder, getDocumentCodec());
-        final Remove remove = new Remove(writeConcern.toNew(), filter);
+        final Remove remove = new Remove(aWriteConcern.toNew(), filter);
 
         try {
             return new WriteResult(translateCommandResult(
                     new RemoveOperation(getNamespace(), remove, getDocumentCodec(), getBufferPool(), getSession(), false).execute()),
-                    writeConcern);
+                    aWriteConcern);
         } catch (org.mongodb.MongoException e) {
             throw mapException(e);
         }
