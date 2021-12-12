diff --git a/app/controllers/StreamSearchController.java b/app/controllers/StreamSearchController.java
index ac7eb19..6dd7649 100644
--- a/app/controllers/StreamSearchController.java
+++ b/app/controllers/StreamSearchController.java
@@ -71,7 +71,7 @@
         if (searchResult.getTotalResultCount() > 0) {
             return ok(views.html.search.results.render(currentUser(), search, searchResult, histogramResult, q, page, stream));
         } else {
-            return ok(views.html.search.noresults.render(currentUser(), q, searchResult));
+            return ok(views.html.search.noresults.render(currentUser(), q, searchResult, stream));
         }
     }
 }
