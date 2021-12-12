diff --git a/src/main/java/com/gitblit/service/LuceneService.java b/src/main/java/com/gitblit/service/LuceneService.java
index 285ea8d..097a39b 100644
--- a/src/main/java/com/gitblit/service/LuceneService.java
+++ b/src/main/java/com/gitblit/service/LuceneService.java
@@ -437,7 +437,7 @@
 					// skip non-annotated tags
 					continue;
 				}
-				if (!tags.containsKey(tag.getObjectId().getName())) {
+				if (!tags.containsKey(tag.getReferencedObjectId().getName())) {
 					tags.put(tag.getReferencedObjectId().getName(), new ArrayList<String>());
 				}
 				tags.get(tag.getReferencedObjectId().getName()).add(tag.displayName);
