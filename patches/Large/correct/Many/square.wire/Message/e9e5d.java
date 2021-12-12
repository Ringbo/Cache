diff --git a/wire-runtime/src/main/java/com/squareup/wire/Message.java b/wire-runtime/src/main/java/com/squareup/wire/Message.java
index bf4e3dc..147db1a 100644
--- a/wire-runtime/src/main/java/com/squareup/wire/Message.java
+++ b/wire-runtime/src/main/java/com/squareup/wire/Message.java
@@ -101,7 +101,7 @@
   /**
    * Superclass for protocol buffer message builders.
    */
-  public abstract static class Builder<T extends Message<T, B>, B extends Builder<T, B>> {
+  public abstract static class Builder<M extends Message<M, B>, B extends Builder<M, B>> {
     /**
      * Caches unknown fields as a {@link ByteString} when {@link #buildUnknownFields()} is called.
      * When the caller adds an additional unknown field after that, it will be written to the new
@@ -120,7 +120,7 @@
     protected Builder() {
     }
 
-    public final Builder<T, B> addUnknownFields(ByteString unknownFields) {
+    public final Builder<M, B> addUnknownFields(ByteString unknownFields) {
       if (unknownFields.size() > 0) {
         prepareForNewUnknownFields();
         try {
@@ -132,7 +132,7 @@
       return this;
     }
 
-    public final Builder<T, B> addUnknownField(int tag, FieldEncoding fieldEncoding, Object value) {
+    public final Builder<M, B> addUnknownField(int tag, FieldEncoding fieldEncoding, Object value) {
       prepareForNewUnknownFields();
       try {
         ProtoAdapter<Object> protoAdapter = (ProtoAdapter<Object>) fieldEncoding.rawProtoAdapter();
@@ -143,7 +143,7 @@
       return this;
     }
 
-    public final Builder<T, B> clearUnknownFields() {
+    public final Builder<M, B> clearUnknownFields() {
       unknownFieldsByteString = ByteString.EMPTY;
       if (unknownFieldsBuffer != null) {
         unknownFieldsBuffer.clear();
@@ -168,7 +168,7 @@
     }
 
     /** Returns an immutable {@link Message} based on the fields that set in this builder. */
-    public abstract T build();
+    public abstract M build();
 
     private void prepareForNewUnknownFields() {
       if (unknownFieldsBuffer == null) {
