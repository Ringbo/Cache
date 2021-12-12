diff --git a/rxbinding-appcompat-v7/src/main/java/com/jakewharton/rxbinding2/support/v7/widget/SearchViewQueryTextChangeEventsObservable.java b/rxbinding-appcompat-v7/src/main/java/com/jakewharton/rxbinding2/support/v7/widget/SearchViewQueryTextChangeEventsObservable.java
index a87bc27..9589724 100644
--- a/rxbinding-appcompat-v7/src/main/java/com/jakewharton/rxbinding2/support/v7/widget/SearchViewQueryTextChangeEventsObservable.java
+++ b/rxbinding-appcompat-v7/src/main/java/com/jakewharton/rxbinding2/support/v7/widget/SearchViewQueryTextChangeEventsObservable.java
@@ -9,7 +9,7 @@
 
 final class SearchViewQueryTextChangeEventsObservable
     extends InitialValueObservable<SearchViewQueryTextEvent> {
-  private final SearchView view;
+  final SearchView view;
 
   SearchViewQueryTextChangeEventsObservable(SearchView view) {
     this.view = view;
