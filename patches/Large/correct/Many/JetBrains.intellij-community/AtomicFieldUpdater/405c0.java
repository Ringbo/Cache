diff --git a/platform/util/src/com/intellij/util/concurrency/AtomicFieldUpdater.java b/platform/util/src/com/intellij/util/concurrency/AtomicFieldUpdater.java
index 0f0768f..81014fc 100644
--- a/platform/util/src/com/intellij/util/concurrency/AtomicFieldUpdater.java
+++ b/platform/util/src/com/intellij/util/concurrency/AtomicFieldUpdater.java
@@ -35,7 +35,7 @@
  * - removed access check in getAndSet() hot path for performance
  * - new methods "forFieldXXX" added that search by field type instead of field name, which is useful in scrambled classes
  */
-public class AtomicFieldUpdater<T,V> {
+public class AtomicFieldUpdater<ContainingClass, FieldType> {
   private static final Unsafe unsafe;
   static {
     unsafe = ReflectionUtil.getStaticFieldValue(Unsafe.class, Unsafe.class, "theUnsafe");
@@ -66,7 +66,7 @@
     return new AtomicFieldUpdater<T, Integer>(ownerClass, int.class);
   }
 
-  private AtomicFieldUpdater(@NotNull Class<T> ownerClass, @NotNull Class<V> fieldType) {
+  private AtomicFieldUpdater(@NotNull Class<ContainingClass> ownerClass, @NotNull Class<FieldType> fieldType) {
     Field found = getTheOnlyVolatileFieldOfClass(ownerClass, fieldType);
     offset = unsafe.objectFieldOffset(found);
   }
@@ -98,24 +98,24 @@
     return found;
   }
 
-  public boolean compareAndSet(@NotNull T owner, V expected, V newValue) {
+  public boolean compareAndSet(@NotNull ContainingClass owner, FieldType expected, FieldType newValue) {
     return unsafe.compareAndSwapObject(owner, offset, expected, newValue);
   }
 
-  public boolean compareAndSetLong(@NotNull T owner, long expected, long newValue) {
+  public boolean compareAndSetLong(@NotNull ContainingClass owner, long expected, long newValue) {
     return unsafe.compareAndSwapLong(owner, offset, expected, newValue);
   }
 
-  public boolean compareAndSetInt(@NotNull T owner, int expected, int newValue) {
+  public boolean compareAndSetInt(@NotNull ContainingClass owner, int expected, int newValue) {
     return unsafe.compareAndSwapInt(owner, offset, expected, newValue);
   }
 
-  public void set(@NotNull T owner, V newValue) {
+  public void set(@NotNull ContainingClass owner, FieldType newValue) {
     unsafe.putObjectVolatile(owner, offset, newValue);
   }
 
-  public V get(@NotNull T owner) {
+  public FieldType get(@NotNull ContainingClass owner) {
     //noinspection unchecked
-    return (V)unsafe.getObjectVolatile(owner, offset);
+    return (FieldType)unsafe.getObjectVolatile(owner, offset);
   }
 }
