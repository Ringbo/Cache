diff --git a/driver-core/src/main/java/com/datastax/driver/core/querybuilder/Utils.java b/driver-core/src/main/java/com/datastax/driver/core/querybuilder/Utils.java
index 7ea0bfd..e9818c0 100644
--- a/driver-core/src/main/java/com/datastax/driver/core/querybuilder/Utils.java
+++ b/driver-core/src/main/java/com/datastax/driver/core/querybuilder/Utils.java
@@ -270,11 +270,12 @@
     }
 
     /**
-     * This method is a copy of the one declared in {@link com.datastax.driver.core.SimpleStatement}.
-     * <p/>
      * Utility method to serialize user-provided values.
      * <p/>
-     * This method is useful in situations where there is no metadata available and the underlying CQL
+     * This method is a copy of the one declared in {@link com.datastax.driver.core.SimpleStatement}, it was duplicated
+     * to avoid having to make it public.
+     * <p/>
+     * It is useful in situations where there is no metadata available and the underlying CQL
      * type for the values is not known.
      * <p/>
      * This situation happens when a {@link com.datastax.driver.core.SimpleStatement}
@@ -290,7 +291,7 @@
      * @param codecRegistry   The {@link CodecRegistry} to use.
      * @return The converted values.
      */
-    public static ByteBuffer[] convert(Object[] values, ProtocolVersion protocolVersion, CodecRegistry codecRegistry) {
+    static ByteBuffer[] convert(Object[] values, ProtocolVersion protocolVersion, CodecRegistry codecRegistry) {
         ByteBuffer[] serializedValues = new ByteBuffer[values.length];
         for (int i = 0; i < values.length; i++) {
             Object value = values[i];
@@ -317,9 +318,11 @@
     }
 
     /**
-     * This method is a copy of the one declared in {@link com.datastax.driver.core.SimpleStatement}.
      * Utility method to assemble different routing key components into a single {@link ByteBuffer}.
      * Mainly intended for statements that need to generate a routing key out of their current values.
+     * <p/>
+     * This method is a copy of the one declared in {@link com.datastax.driver.core.SimpleStatement}, it was duplicated
+     * to avoid having to make it public.
      *
      * @param buffers the components of the routing key.
      * @return A ByteBuffer containing the serialized routing key
