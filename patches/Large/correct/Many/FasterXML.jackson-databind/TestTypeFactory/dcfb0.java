diff --git a/src/test/java/com/fasterxml/jackson/databind/type/TestTypeFactory.java b/src/test/java/com/fasterxml/jackson/databind/type/TestTypeFactory.java
index a2350cb..23a29c4 100644
--- a/src/test/java/com/fasterxml/jackson/databind/type/TestTypeFactory.java
+++ b/src/test/java/com/fasterxml/jackson/databind/type/TestTypeFactory.java
@@ -239,7 +239,7 @@
     {
         TypeFactory tf = TypeFactory.defaultInstance();
         Object objects = new TreeMap<Object, Object>() { }; // to get subtype
-        String reflectTypeName = objects.getClass().getGenericSuperclass().getTypeName();
+        String reflectTypeName = objects.getClass().getGenericSuperclass().toString();
         JavaType t1 = tf.constructType(objects.getClass().getGenericSuperclass());
         // This will throw an Exception if you don't remove all white spaces from the String.
         JavaType t2 = tf.constructFromCanonical(reflectTypeName);
