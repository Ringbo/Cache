diff --git a/platform/lang-impl/src/com/intellij/codeInsight/completion/CompletionLookupArranger.java b/platform/lang-impl/src/com/intellij/codeInsight/completion/CompletionLookupArranger.java
index 05c219d..c2d168e 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/completion/CompletionLookupArranger.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/completion/CompletionLookupArranger.java
@@ -137,7 +137,7 @@
   }
 
   @Override
-  public Pair<List<LookupElement>, Integer> arrangeItems(@NotNull Lookup lookup) {
+  public Pair<List<LookupElement>, Integer> arrangeItems(@NotNull Lookup lookup, boolean onExplicitAction) {
     List<LookupElement> items = matchingItems(lookup);
     Collections.sort(items, new Comparator<LookupElement>() {
       public int compare(LookupElement o1, LookupElement o2) {
@@ -188,7 +188,7 @@
     }
     ArrayList<LookupElement> listModel = new ArrayList<LookupElement>(model);
 
-    return new Pair<List<LookupElement>, Integer>(listModel, getItemToSelect(lookup, listModel, inputBySorter));
+    return new Pair<List<LookupElement>, Integer>(listModel, getItemToSelect(lookup, listModel, inputBySorter, onExplicitAction));
   }
 
 
@@ -197,12 +197,12 @@
     return new CompletionLookupArranger(myParameters, myProcess);
   }
 
-  private int getItemToSelect(Lookup lookup, List<LookupElement> items, MultiMap<CompletionSorterImpl, LookupElement> inputBySorter) {
+  private int getItemToSelect(Lookup lookup, List<LookupElement> items, MultiMap<CompletionSorterImpl, LookupElement> inputBySorter, boolean onExplicitAction) {
     if (items.isEmpty() || !lookup.isFocused()) {
       return 0;
     }
 
-    if (lookup.isSelectionTouched()) {
+    if (lookup.isSelectionTouched() || !onExplicitAction) {
       LookupElement lastSelection = lookup.getCurrentItem();
       int old = items.indexOf(lastSelection);
       if (old >= 0) {
