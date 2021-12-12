diff --git a/app/controllers/SearchController.java b/app/controllers/SearchController.java
index 0ee950f..ce1dd13 100755
--- a/app/controllers/SearchController.java
+++ b/app/controllers/SearchController.java
@@ -126,7 +126,7 @@
     }
 
     protected Set<String> getSelectedFields(String fields) {
-        Set<String> selectedFields = Sets.newHashSet();
+        Set<String> selectedFields = Sets.newLinkedHashSet();
         if (fields != null && !fields.isEmpty()) {
             Iterables.addAll(selectedFields, Splitter.on(',').split(fields));
         } else {
