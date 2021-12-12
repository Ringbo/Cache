diff --git a/src/org/wordpress/android/models/CategoryNode.java b/src/org/wordpress/android/models/CategoryNode.java
index 20814cf..d425e7b 100644
--- a/src/org/wordpress/android/models/CategoryNode.java
+++ b/src/org/wordpress/android/models/CategoryNode.java
@@ -79,7 +79,7 @@
             if (category.getParentId() == 0) { // root node
                 currentRootNode = rootCategory;
             } else {
-                currentRootNode = categoryMap.get(category.getParentId());
+                currentRootNode = categoryMap.get(category.getParentId(), rootCategory);
             }
             currentRootNode.children.put(category.getName(), categoryMap.get(category.getCategoryId()));
         }
