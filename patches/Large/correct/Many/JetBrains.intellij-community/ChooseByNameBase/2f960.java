diff --git a/platform/lang-impl/src/com/intellij/ide/util/gotoByName/ChooseByNameBase.java b/platform/lang-impl/src/com/intellij/ide/util/gotoByName/ChooseByNameBase.java
index 155caab..f08e407 100644
--- a/platform/lang-impl/src/com/intellij/ide/util/gotoByName/ChooseByNameBase.java
+++ b/platform/lang-impl/src/com/intellij/ide/util/gotoByName/ChooseByNameBase.java
@@ -1212,7 +1212,7 @@
       Collections.sort(namesList, new MatchesComparator(namePattern));
 
       for (String name : namesList) {
-        Set<Object> elems = myMatcher.getElementsByPattern(pattern, name, myCheckboxState,new Computable<Boolean>() {
+        Set<Object> elems = myMatcher.getElementsByPattern(namePattern, name, myCheckboxState,new Computable<Boolean>() {
           public Boolean compute() {
             return myCancelled;
           }
