diff --git a/ExtendedApi/src/com/intellij/testFramework/ExpectedHighlightingData.java b/ExtendedApi/src/com/intellij/testFramework/ExpectedHighlightingData.java
index 3001d3b..7608180 100644
--- a/ExtendedApi/src/com/intellij/testFramework/ExpectedHighlightingData.java
+++ b/ExtendedApi/src/com/intellij/testFramework/ExpectedHighlightingData.java
@@ -60,7 +60,7 @@
     highlightingTypes = new THashMap<String,ExpectedHighlightingSet>();
     highlightingTypes.put(ERROR_MARKER, new ExpectedHighlightingSet(ERROR_MARKER, HighlightInfoType.ERROR, HighlightSeverity.ERROR, false, true));
     highlightingTypes.put(WARNING_MARKER, new ExpectedHighlightingSet(WARNING_MARKER, HighlightInfoType.UNUSED_SYMBOL, HighlightSeverity.WARNING, false, checkWarnings));
-    highlightingTypes.put(WARNING_MARKER, new ExpectedHighlightingSet(INFORMATION_MARKER, HighlightInfoType.INFO, HighlightSeverity.INFO, false, checkWeakWarnings));
+    highlightingTypes.put(INFORMATION_MARKER, new ExpectedHighlightingSet(INFORMATION_MARKER, HighlightInfoType.INFO, HighlightSeverity.INFO, false, checkWeakWarnings));
     highlightingTypes.put(INFO_MARKER, new ExpectedHighlightingSet(INFO_MARKER, HighlightInfoType.TODO, HighlightSeverity.INFORMATION, false, checkInfos));
     highlightingTypes.put(END_LINE_HIGHLIGHT_MARKER, new ExpectedHighlightingSet(END_LINE_HIGHLIGHT_MARKER, HighlightInfoType.ERROR, HighlightSeverity.ERROR, true, true));
     highlightingTypes.put(END_LINE_WARNING_MARKER, new ExpectedHighlightingSet(END_LINE_WARNING_MARKER, HighlightInfoType.WARNING, HighlightSeverity.WARNING, true, checkWarnings));
