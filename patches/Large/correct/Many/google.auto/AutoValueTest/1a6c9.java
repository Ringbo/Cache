diff --git a/value/src/it/functional/src/test/java/com/google/auto/value/AutoValueTest.java b/value/src/it/functional/src/test/java/com/google/auto/value/AutoValueTest.java
index fbd378a..b2ed4be 100644
--- a/value/src/it/functional/src/test/java/com/google/auto/value/AutoValueTest.java
+++ b/value/src/it/functional/src/test/java/com/google/auto/value/AutoValueTest.java
@@ -2189,13 +2189,13 @@
   public abstract static class BuilderWithCopyingSetters<T extends Number> {
     public abstract ImmutableSet<? extends T> things();
 
-    public abstract ImmutableList<String> strings();
+    public abstract ImmutableList<Number> numbers();
 
     public abstract ImmutableMap<String, T> map();
 
     public static <T extends Number> Builder<T> builder(T value) {
       return new AutoValue_AutoValueTest_BuilderWithCopyingSetters.Builder<T>()
-          .setStrings(ImmutableSet.of("foo", "bar"))
+          .setNumbers(ImmutableSet.of(17, 23.0))
           .setMap(Collections.singletonMap("foo", value));
     }
 
@@ -2207,7 +2207,7 @@
 
       Builder<T> setThings(T... things);
 
-      Builder<T> setStrings(Collection<String> strings);
+      Builder<T> setNumbers(Collection<? extends Number> strings);
 
       Builder<T> setMap(Map<String, T> map);
 
@@ -2221,7 +2221,7 @@
 
     BuilderWithCopyingSetters<Integer> a = builder.setThings(ImmutableSet.of(1, 2)).build();
     assertEquals(ImmutableSet.of(1, 2), a.things());
-    assertEquals(ImmutableList.of("foo", "bar"), a.strings());
+    assertEquals(ImmutableList.of(17, 23.0), a.numbers());
     assertEquals(ImmutableMap.of("foo", 23), a.map());
 
     BuilderWithCopyingSetters<Integer> b = builder.setThings(Arrays.asList(1, 2)).build();
