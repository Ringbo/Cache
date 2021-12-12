diff --git a/jOOQ/src/main/java/org/jooq/impl/DataTypes.java b/jOOQ/src/main/java/org/jooq/impl/DataTypes.java
index 524d84f..baf7df4 100644
--- a/jOOQ/src/main/java/org/jooq/impl/DataTypes.java
+++ b/jOOQ/src/main/java/org/jooq/impl/DataTypes.java
@@ -47,12 +47,13 @@
  *
  * @author Lukas Eder
  */
-public final class DataTypes {
+final class DataTypes {
 
     private static final Map<Class<?>, Converter<?, ?>> CONVERTERS = new HashMap<Class<?>, Converter<?, ?>>();
 
     // ------------------------------------------------------------------------
     // XXX: Public API used for initialisation from generated artefacts
+    // (this may be rendered public in the future)
     // ------------------------------------------------------------------------
 
     /**
@@ -70,7 +71,7 @@
      *
      * @see #registerConverter(Class, Converter)
      */
-    public static final synchronized <U> void registerConverter(Class<U> customType,
+    static final synchronized <U> void registerConverter(Class<U> customType,
         Class<? extends Converter<?, U>> converter) {
 
         try {
@@ -93,7 +94,7 @@
      * A custom type can be registered only once. Duplicate registrations will
      * be ignored
      */
-    public static final synchronized <U> void registerConverter(Class<U> customType, Converter<?, U> converter) {
+    static final synchronized <U> void registerConverter(Class<U> customType, Converter<?, U> converter) {
 
         // A converter can be registered only once
         if (!CONVERTERS.containsKey(customType)) {
