diff --git a/platform/lang-impl/src/com/intellij/ide/util/gotoByName/ChooseByNameBase.java b/platform/lang-impl/src/com/intellij/ide/util/gotoByName/ChooseByNameBase.java
index 6f4ed4f..8120573 100644
--- a/platform/lang-impl/src/com/intellij/ide/util/gotoByName/ChooseByNameBase.java
+++ b/platform/lang-impl/src/com/intellij/ide/util/gotoByName/ChooseByNameBase.java
@@ -1082,9 +1082,10 @@
     Matcher matcher = buildPatternMatcher(transformPattern(trimmedText));
     final String statContext = statisticsContext();
     Comparator<Object> itemComparator = Comparator.
-      comparing(e -> !trimmedText.equalsIgnoreCase(myModel.getElementName(e))).
+      comparing(e -> trimmedText.equalsIgnoreCase(myModel.getElementName(e))).
       thenComparing(e -> matchingDegree(matcher, e)).
-      thenComparing(e -> getUseCount(statContext, e));
+      thenComparing(e -> getUseCount(statContext, e)).
+      reversed();
 
     int bestPosition = 0;
     for (int i = 1; i < modelElements.length; i++) {
