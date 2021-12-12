diff --git a/core/java/android/widget/TextView.java b/core/java/android/widget/TextView.java
index c38624f..359cfcc 100644
--- a/core/java/android/widget/TextView.java
+++ b/core/java/android/widget/TextView.java
@@ -8290,7 +8290,7 @@
                     suggestionInfo.spanEnd = spanEnd;
 
                     totalNbSuggestions++;
-                    if (totalNbSuggestions > MAX_NUMBER_SUGGESTIONS) {
+                    if (totalNbSuggestions == MAX_NUMBER_SUGGESTIONS) {
                         // Also end outer for loop
                         spanIndex = nbSpans;
                         break;
