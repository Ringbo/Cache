diff --git a/driver-compat/src/main/org/bson/BSON.java b/driver-compat/src/main/org/bson/BSON.java
index cd44437..3c26ca6 100644
--- a/driver-compat/src/main/org/bson/BSON.java
+++ b/driver-compat/src/main/org/bson/BSON.java
@@ -240,7 +240,7 @@
      * @param bytes a document encoded as BSON
      * @return the document as a DBObject
      */
-    public static DBObject decode(final byte[] bytes) {
+    public static BSONObject decode(final byte[] bytes) {
         final InputBuffer buffer = new BasicInputBuffer(ByteBuffer.wrap(bytes));
         return new DBObjectCodec(PrimitiveCodecs.createDefault()).decode(new BSONBinaryReader(buffer));
     }
