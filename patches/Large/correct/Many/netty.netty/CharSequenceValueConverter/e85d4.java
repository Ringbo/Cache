diff --git a/codec/src/main/java/io/netty/handler/codec/CharSequenceValueConverter.java b/codec/src/main/java/io/netty/handler/codec/CharSequenceValueConverter.java
index 0e243ce..dfdc856 100644
--- a/codec/src/main/java/io/netty/handler/codec/CharSequenceValueConverter.java
+++ b/codec/src/main/java/io/netty/handler/codec/CharSequenceValueConverter.java
@@ -82,7 +82,7 @@
         if (value instanceof AsciiString) {
             return ((AsciiString) value).byteAt(0);
         }
-        return Byte.valueOf(value.toString());
+        return Byte.parseByte(value.toString());
     }
 
     @Override
@@ -100,7 +100,7 @@
         if (value instanceof AsciiString) {
             return ((AsciiString) value).parseShort();
         }
-        return Short.valueOf(value.toString());
+        return Short.parseShort(value.toString());
     }
 
     @Override
@@ -139,7 +139,7 @@
         if (value instanceof AsciiString) {
             return ((AsciiString) value).parseFloat();
         }
-        return Float.valueOf(value.toString());
+        return Float.parseFloat(value.toString());
     }
 
     @Override
@@ -147,6 +147,6 @@
         if (value instanceof AsciiString) {
             return ((AsciiString) value).parseDouble();
         }
-        return Double.valueOf(value.toString());
+        return Double.parseDouble(value.toString());
     }
 }
