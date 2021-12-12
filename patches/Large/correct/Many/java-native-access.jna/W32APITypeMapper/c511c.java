diff --git a/jnalib/src/com/sun/jna/win32/W32APITypeMapper.java b/jnalib/src/com/sun/jna/win32/W32APITypeMapper.java
index 5370ac3..f18eff1 100644
--- a/jnalib/src/com/sun/jna/win32/W32APITypeMapper.java
+++ b/jnalib/src/com/sun/jna/win32/W32APITypeMapper.java
@@ -48,10 +48,10 @@
                 public Object fromNative(Object value, FromNativeContext context) {
                     if (value == null)
                         return null;
-                    return ((Pointer)value).getString(0, true);
+                    return value.toString();
                 }
                 public Class nativeType() {
-                    return Pointer.class;
+                    return WString.class;
                 }
             };
             addTypeConverter(String.class, stringConverter);
