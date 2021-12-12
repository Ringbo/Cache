diff --git a/dom/openapi/src/com/intellij/util/xml/ModelMergerUtil.java b/dom/openapi/src/com/intellij/util/xml/ModelMergerUtil.java
index a0d8a47..c281eb0 100644
--- a/dom/openapi/src/com/intellij/util/xml/ModelMergerUtil.java
+++ b/dom/openapi/src/com/intellij/util/xml/ModelMergerUtil.java
@@ -20,7 +20,7 @@
   public static <T> T getFirstImplementation(final T t) {
     T cur = t;
     while (cur instanceof MergedObject) {
-      final List<T> implementations = ((MergedObject<T>)t).getImplementations();
+      final List<T> implementations = ((MergedObject<T>)cur).getImplementations();
       cur = implementations.isEmpty()? null : implementations.get(0);
     }
     return cur;
