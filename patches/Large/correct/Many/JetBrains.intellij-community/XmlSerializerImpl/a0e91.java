diff --git a/platform/util/src/com/intellij/util/xmlb/XmlSerializerImpl.java b/platform/util/src/com/intellij/util/xmlb/XmlSerializerImpl.java
index 7501f69..184114b 100644
--- a/platform/util/src/com/intellij/util/xmlb/XmlSerializerImpl.java
+++ b/platform/util/src/com/intellij/util/xmlb/XmlSerializerImpl.java
@@ -113,7 +113,7 @@
   }
 
   @NotNull
-  static Binding getMainBinding(@NotNull Class<?> aClass, @NotNull Type originalType, @Nullable MutableAccessor accessor) {
+  synchronized static Binding getMainBinding(@NotNull Class<?> aClass, @NotNull Type originalType, @Nullable MutableAccessor accessor) {
     Pair<Type, MutableAccessor> key = Pair.create(originalType, accessor);
     Map<Pair<Type, MutableAccessor>, Binding> map = getBindingCacheMap();
     Binding binding = map.get(key);
