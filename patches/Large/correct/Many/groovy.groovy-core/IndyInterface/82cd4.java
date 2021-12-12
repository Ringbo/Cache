diff --git a/src/main/org/codehaus/groovy/vmplugin/v7/IndyInterface.java b/src/main/org/codehaus/groovy/vmplugin/v7/IndyInterface.java
index 8d4c305..943c5da 100644
--- a/src/main/org/codehaus/groovy/vmplugin/v7/IndyInterface.java
+++ b/src/main/org/codehaus/groovy/vmplugin/v7/IndyInterface.java
@@ -70,7 +70,7 @@
         static {
             try {
                 UNWRAP_METHOD = LOOKUP.findStatic(IndyInterface.class, "unwrap", O2O);
-                TO_STRING = LOOKUP.findStatic(IndyInterface.class, "coerceToString", O2O);
+                TO_STRING = LOOKUP.findStatic(IndyInterface.class, "coerceToString", MethodType.methodType(String.class, Object.class));
                 TO_BYTE = LOOKUP.findStatic(IndyInterface.class, "coerceToByte", O2O);
                 TO_BIGINT = LOOKUP.findStatic(IndyInterface.class, "coerceToBigInt", O2O);
                 SAME_MC = LOOKUP.findStatic(IndyInterface.class, "isSameMetaClass", MethodType.methodType(boolean.class, MetaClassImpl.class, Object.class));
@@ -208,7 +208,7 @@
         /**
          * called by handle
          */
-        public static Object coerceToString(Object o) {
+        public static String coerceToString(Object o) {
             return o.toString();
         }
         
@@ -252,16 +252,16 @@
         
         private static void correctCoerce(CallInfo ci) {
             if (ci.useMetaClass) return;
-            Class[] parameters = ci.targetType.parameterArray();
+            Class[] parameters = ci.handle.type().parameterArray();
             for (int i=1; i<ci.args.length; i++) {
                 Object arg = ci.args[i];
                 if (arg==null) continue;
                 Class got = arg.getClass(); 
-                if (got == GString.class && parameters[i+1] == String.class) {
+                if (arg instanceof GString && parameters[i] == String.class) {
                     ci.handle = MethodHandles.filterArguments(ci.handle, i, TO_STRING);                    
-                } else if (parameters[i+1] == Byte.class && got != Byte.class) {
+                } else if (parameters[i] == Byte.class && got != Byte.class) {
                     ci.handle = MethodHandles.filterArguments(ci.handle, i, TO_BYTE);
-                } else if (parameters[i+1] == BigInteger.class && got != BigInteger.class) {
+                } else if (parameters[i] == BigInteger.class && got != BigInteger.class) {
                     ci.handle = MethodHandles.filterArguments(ci.handle, i, TO_BIGINT);
                 }
             }
