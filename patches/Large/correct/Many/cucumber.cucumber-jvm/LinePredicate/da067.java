diff --git a/core/src/main/java/cucumber/runtime/LinePredicate.java b/core/src/main/java/cucumber/runtime/LinePredicate.java
index 042dfed..e9e5069 100644
--- a/core/src/main/java/cucumber/runtime/LinePredicate.java
+++ b/core/src/main/java/cucumber/runtime/LinePredicate.java
@@ -17,7 +17,7 @@
     public boolean apply(PickleEvent pickleEvent) {
         String picklePath = pickleEvent.uri;
         if (!lineFilters.containsKey(picklePath)) {
-            return false;
+            return true;
         }
         for (Long line : lineFilters.get(picklePath)) {
             for (PickleLocation location : pickleEvent.pickle.getLocations()) {
