diff --git a/app/controllers/SearchController.java b/app/controllers/SearchController.java
index 062dc6b..70854e8 100755
--- a/app/controllers/SearchController.java
+++ b/app/controllers/SearchController.java
@@ -77,7 +77,7 @@
         if (searchResult.getTotalResultCount() > 0) {
             return ok(views.html.search.results.render(currentUser(), search, searchResult, histogramResult, q, page, null));
         } else {
-            return ok(views.html.search.noresults.render(currentUser(), q, searchResult));
+            return ok(views.html.search.noresults.render(currentUser(), q, searchResult, null));
         }
     }
 
