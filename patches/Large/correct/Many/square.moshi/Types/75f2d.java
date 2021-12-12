diff --git a/moshi/src/main/java/com/squareup/moshi/Types.java b/moshi/src/main/java/com/squareup/moshi/Types.java
index 80459d1..ae6fdf0 100644
--- a/moshi/src/main/java/com/squareup/moshi/Types.java
+++ b/moshi/src/main/java/com/squareup/moshi/Types.java
@@ -373,7 +373,8 @@
     return new Type[] { Object.class, Object.class };
   }
 
-  static Type resolve(Type context, Class<?> contextRawType, Type toResolve) {
+  @CheckReturnValue // TODO(eric): Move this to internal Utils.
+  public static Type resolve(Type context, Class<?> contextRawType, Type toResolve) {
     // This implementation is made a little more complicated in an attempt to avoid object-creation.
     while (true) {
       if (toResolve instanceof TypeVariable) {
