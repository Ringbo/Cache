diff --git a/moshi/src/main/java/com/squareup/moshi/Types.java b/moshi/src/main/java/com/squareup/moshi/Types.java
index 5a4dbbb..c5b3dd0 100644
--- a/moshi/src/main/java/com/squareup/moshi/Types.java
+++ b/moshi/src/main/java/com/squareup/moshi/Types.java
@@ -93,7 +93,7 @@
     }
   }
 
-  static Class<?> getRawType(Type type) {
+  public static Class<?> getRawType(Type type) {
     if (type instanceof Class<?>) {
       // type is a normal class.
       return (Class<?>) type;
@@ -260,7 +260,7 @@
    * Returns the element type of this collection type.
    * @throws IllegalArgumentException if this type is not a collection.
    */
-  static Type collectionElementType(Type context, Class<?> contextRawType) {
+  public static Type collectionElementType(Type context, Class<?> contextRawType) {
     Type collectionType = getSupertype(context, contextRawType, Collection.class);
 
     if (collectionType instanceof WildcardType) {
