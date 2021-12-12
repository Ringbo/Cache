diff --git a/check_api/src/main/java/com/google/errorprone/matchers/Matchers.java b/check_api/src/main/java/com/google/errorprone/matchers/Matchers.java
index 43adde1..1bc40d3 100644
--- a/check_api/src/main/java/com/google/errorprone/matchers/Matchers.java
+++ b/check_api/src/main/java/com/google/errorprone/matchers/Matchers.java
@@ -1264,7 +1264,7 @@
    * Converts the given matcher to one that can be applied to any tree but is only executed when run
    * on a tree of {@code type} and returns {@code false} for all other tree types.
    */
-  public static <S extends Tree, T extends Tree> Matcher<T> toType(
+  public static <S extends T, T extends Tree> Matcher<T> toType(
       final Class<S> type, final Matcher<? super S> matcher) {
     return new Matcher<T>() {
       @Override
