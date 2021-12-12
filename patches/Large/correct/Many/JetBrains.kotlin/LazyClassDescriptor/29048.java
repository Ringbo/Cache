diff --git a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/lazy/LazyClassDescriptor.java b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/lazy/LazyClassDescriptor.java
index 42fdd8f..18b54c0 100644
--- a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/lazy/LazyClassDescriptor.java
+++ b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/lazy/LazyClassDescriptor.java
@@ -48,7 +48,7 @@
  */
 public class LazyClassDescriptor extends ClassDescriptorBase implements ClassDescriptorFromSource {
 
-    private static final Predicate<Object> ONLY_ENUM_ENTIRES = Predicates.instanceOf(JetEnumEntry.class);
+    private static final Predicate<Object> ONLY_ENUM_ENTRIES = Predicates.instanceOf(JetEnumEntry.class);
     private static final Predicate<JetType> VALID_SUPERTYPE = new Predicate<JetType>() {
         @Override
         public boolean apply(JetType type) {
@@ -396,11 +396,11 @@
     }
 
     private static JetClassLikeInfo noEnumEntries(JetClassLikeInfo classLikeInfo) {
-        return new FilteringClassLikeInfo(classLikeInfo, Predicates.not(ONLY_ENUM_ENTIRES));
+        return new FilteringClassLikeInfo(classLikeInfo, Predicates.not(ONLY_ENUM_ENTRIES));
     }
 
     private static JetClassLikeInfo onlyEnumEntries(JetClassLikeInfo classLikeInfo) {
-        return new FilteringClassLikeInfo(classLikeInfo, ONLY_ENUM_ENTIRES) {
+        return new FilteringClassLikeInfo(classLikeInfo, ONLY_ENUM_ENTRIES) {
             @Override
             public JetClassOrObject getCorrespondingClassOrObject() {
                 return null;
