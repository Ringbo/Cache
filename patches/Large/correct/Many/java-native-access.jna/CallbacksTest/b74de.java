diff --git a/jnalib/test/com/sun/jna/CallbacksTest.java b/jnalib/test/com/sun/jna/CallbacksTest.java
index b9148c2..428bd9e 100644
--- a/jnalib/test/com/sun/jna/CallbacksTest.java
+++ b/jnalib/test/com/sun/jna/CallbacksTest.java
@@ -777,19 +777,19 @@
     public static interface CallbackTestLibrary extends Library {
         final TypeMapper _MAPPER = new DefaultTypeMapper() {
             {
-                // Convert java floats into native integers and back
+                // Convert java doubles into native integers and back
                 TypeConverter converter = new TypeConverter() {
                     public Object fromNative(Object value, FromNativeContext context) {
-                        return new Float(((Integer)value).intValue());
+                        return new Double(((Integer)value).intValue());
                     }
                     public Class nativeType() {
                         return Integer.class;
                     }
                     public Object toNative(Object value, ToNativeContext ctx) {
-                        return new Integer(Math.round(((Float)value).floatValue()));
+                        return new Integer(((Double)value).intValue());
                     }
                 };
-                addTypeConverter(float.class, converter);
+                addTypeConverter(double.class, converter);
             }
         };
         final Map _OPTIONS = new HashMap() {
@@ -798,9 +798,9 @@
             }
         };
         interface Int32Callback extends Callback {
-            float callback(float arg, float arg2);
+            double callback(double arg, double arg2);
         }
-        float callInt32Callback(Int32Callback c, float arg, float arg2);
+        double callInt32Callback(Int32Callback c, double arg, double arg2);
     }
 
     protected CallbackTestLibrary loadCallbackTestLibrary() {
@@ -816,10 +816,10 @@
     public void testCallbackUsesTypeMapper() throws Exception {
         CallbackTestLibrary lib = loadCallbackTestLibrary();
 
-        final float[] ARGS = new float[2];
+        final double[] ARGS = new double[2];
 
         CallbackTestLibrary.Int32Callback cb = new CallbackTestLibrary.Int32Callback() {
-            public float callback(float arg, float arg2) {
+            public double callback(double arg, double arg2) {
                 ARGS[0] = arg;
                 ARGS[1] = arg2;
                 return arg + arg2;
@@ -830,7 +830,7 @@
         assertEquals("Wrong type mapper for callback object", lib._MAPPER,
                      Native.getTypeMapper(cb.getClass()));
 
-        float result = lib.callInt32Callback(cb, -1, -1);
+        double result = lib.callInt32Callback(cb, -1, -1);
         assertEquals("Wrong callback argument 1", -1, ARGS[0], 0);
         assertEquals("Wrong callback argument 2", -1, ARGS[1], 0);
         assertEquals("Incorrect result of callback invocation", -2, result, 0);
