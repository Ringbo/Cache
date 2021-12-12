diff --git a/src/test/java/com/fasterxml/jackson/failing/NestedTypes1604Test.java b/src/test/java/com/fasterxml/jackson/failing/NestedTypes1604Test.java
index 0d0687d..b77d3f8 100644
--- a/src/test/java/com/fasterxml/jackson/failing/NestedTypes1604Test.java
+++ b/src/test/java/com/fasterxml/jackson/failing/NestedTypes1604Test.java
@@ -38,12 +38,15 @@
         }
     }
 
-    public static class RefinedDataList<T> extends Data<List<T>> {
+    // And then add one level between types
+    public static class RefinedDataList<T> extends DataList<T> {
         public RefinedDataList(List<T> data) {
             super(data);
         }
     }
 
+    // And/or add another type parameter that is not relevant (less common
+    // but potential concern)
     public static class SneakyDataList<BOGUS,T> extends Data<List<T>> {
         public SneakyDataList(List<T> data) {
             super(data);
