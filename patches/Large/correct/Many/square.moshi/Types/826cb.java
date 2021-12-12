diff --git a/moshi/src/main/java/com/squareup/moshi/Types.java b/moshi/src/main/java/com/squareup/moshi/Types.java
index 51157e1..5a4dbbb 100644
--- a/moshi/src/main/java/com/squareup/moshi/Types.java
+++ b/moshi/src/main/java/com/squareup/moshi/Types.java
@@ -29,13 +29,8 @@
 import java.util.NoSuchElementException;
 import java.util.Properties;
 
-/**
- * Static methods for working with types.
- *
- * @author Bob Lee
- * @author Jesse Wilson
- */
-final class Types {
+/** Factory methods for types. */
+public final class Types {
   static final Type[] EMPTY_TYPE_ARRAY = new Type[] {};
 
   private Types() {
@@ -75,7 +70,7 @@
    * Returns a type that is functionally equal but not necessarily equal according to {@link
    * Object#equals(Object) Object.equals()}.
    */
-  public static Type canonicalize(Type type) {
+  static Type canonicalize(Type type) {
     if (type instanceof Class) {
       Class<?> c = (Class<?>) type;
       return c.isArray() ? new GenericArrayTypeImpl(canonicalize(c.getComponentType())) : c;
@@ -98,7 +93,7 @@
     }
   }
 
-  public static Class<?> getRawType(Type type) {
+  static Class<?> getRawType(Type type) {
     if (type instanceof Class<?>) {
       // type is a normal class.
       return (Class<?>) type;
@@ -135,7 +130,7 @@
   }
 
   /** Returns true if {@code a} and {@code b} are equal. */
-  public static boolean equals(Type a, Type b) {
+  static boolean equals(Type a, Type b) {
     if (a == b) {
       return true; // Also handles (a == null && b == null).
 
@@ -186,7 +181,7 @@
     return o != null ? o.hashCode() : 0;
   }
 
-  public static String typeToString(Type type) {
+  static String typeToString(Type type) {
     return type instanceof Class ? ((Class<?>) type).getName() : type.toString();
   }
 
@@ -242,7 +237,7 @@
         getGenericSupertype(context, contextRawType, supertype));
   }
 
-  public static Type getGenericSuperclass(Type type) {
+  static Type getGenericSuperclass(Type type) {
     Class<?> rawType = Types.getRawType(type);
     return resolve(type, rawType, rawType.getGenericSuperclass());
   }
@@ -251,7 +246,7 @@
    * Returns the element type of {@code type} if it is an array type, or null if it is not an
    * array type.
    */
-  public static Type arrayComponentType(Type type) {
+  static Type arrayComponentType(Type type) {
     if (type instanceof GenericArrayType) {
       return ((GenericArrayType) type).getGenericComponentType();
     } else if (type instanceof Class) {
@@ -265,7 +260,7 @@
    * Returns the element type of this collection type.
    * @throws IllegalArgumentException if this type is not a collection.
    */
-  public static Type collectionElementType(Type context, Class<?> contextRawType) {
+  static Type collectionElementType(Type context, Class<?> contextRawType) {
     Type collectionType = getSupertype(context, contextRawType, Collection.class);
 
     if (collectionType instanceof WildcardType) {
@@ -281,7 +276,7 @@
    * Returns a two element array containing this map's key and value types in positions 0 and 1
    * respectively.
    */
-  public static Type[] mapKeyAndValueTypes(Type context, Class<?> contextRawType) {
+  static Type[] mapKeyAndValueTypes(Type context, Class<?> contextRawType) {
     // Work around a problem with the declaration of java.util.Properties. That class should extend
     // Hashtable<String, String>, but it's declared to extend Hashtable<Object, Object>.
     if (context == Properties.class) return new Type[] { String.class, String.class };
@@ -294,7 +289,7 @@
     return new Type[] { Object.class, Object.class };
   }
 
-  public static Type resolve(Type context, Class<?> contextRawType, Type toResolve) {
+  static Type resolve(Type context, Class<?> contextRawType, Type toResolve) {
     // This implementation is made a little more complicated in an attempt to avoid object-creation.
     while (true) {
       if (toResolve instanceof TypeVariable) {
