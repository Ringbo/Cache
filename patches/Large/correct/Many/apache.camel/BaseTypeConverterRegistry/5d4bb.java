diff --git a/camel-core/src/main/java/org/apache/camel/impl/converter/BaseTypeConverterRegistry.java b/camel-core/src/main/java/org/apache/camel/impl/converter/BaseTypeConverterRegistry.java
index d4cab43..5e0ccf0 100644
--- a/camel-core/src/main/java/org/apache/camel/impl/converter/BaseTypeConverterRegistry.java
+++ b/camel-core/src/main/java/org/apache/camel/impl/converter/BaseTypeConverterRegistry.java
@@ -268,11 +268,11 @@
             if (statistics.isStatisticsEnabled()) {
                 noopCounter.increment();
             }
-            return type.cast(value);
+            return value;
         }
 
         // special for NaN numbers, which we can only convert for floating numbers
-        if (ObjectHelper.isNaN(value)) {
+        if (value.equals(Float.NaN) || value.equals(Double.NaN) ) {
             // no type conversion was needed
             if (statistics.isStatisticsEnabled()) {
                 noopCounter.increment();
@@ -757,7 +757,7 @@
     /**
      * Represents a mapping from one type (which can be null) to another
      */
-    protected static class TypeMapping {
+    protected static final class TypeMapping {
         private final Class<?> toType;
         private final Class<?> fromType;
 
@@ -778,8 +778,7 @@
         public boolean equals(Object object) {
             if (object instanceof TypeMapping) {
                 TypeMapping that = (TypeMapping) object;
-                return ObjectHelper.equal(this.fromType, that.fromType)
-                        && ObjectHelper.equal(this.toType, that.toType);
+                return this.fromType == that.fromType && this.toType == that.toType;
             }
             return false;
         }
