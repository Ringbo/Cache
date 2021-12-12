diff --git a/check_api/src/main/java/com/google/errorprone/util/Comments.java b/check_api/src/main/java/com/google/errorprone/util/Comments.java
index 4116b43..52fb560 100644
--- a/check_api/src/main/java/com/google/errorprone/util/Comments.java
+++ b/check_api/src/main/java/com/google/errorprone/util/Comments.java
@@ -166,10 +166,11 @@
     return argumentTracker.build();
   }
 
-  private static ImmutableList noComments(List<? extends ExpressionTree> arguments) {
+  private static ImmutableList<Commented<ExpressionTree>> noComments(
+      List<? extends ExpressionTree> arguments) {
     return arguments
         .stream()
-        .map(a -> Commented.builder().setTree(a).build())
+        .map(a -> Commented.<ExpressionTree>builder().setTree(a).build())
         .collect(toImmutableList());
   }
 
@@ -261,7 +262,7 @@
    * @param target is the element to search for
    * @param iterable is the iterable to search
    * @param defaultValue will be returned if there is no item following the searched for item
-   * @return the item following {@code target} or {@code defaultvalue} if not found
+   * @return the item following {@code target} or {@code defaultValue} if not found
    */
   private static <T> T after(T target, Iterable<? extends T> iterable, T defaultValue) {
     Iterator<? extends T> iterator = iterable.iterator();
@@ -362,7 +363,7 @@
         resultBuilder.add(previousCommentedResultBuilder.build());
       }
       previousCommentedResultBuilder = currentCommentedResultBuilder;
-      currentCommentedResultBuilder = Commented.builder().setTree(nextArgument);
+      currentCommentedResultBuilder = Commented.<ExpressionTree>builder().setTree(nextArgument);
     }
 
     /** Returns the final result. The object should not be used after calling this method */
@@ -395,7 +396,7 @@
       currentCommentedResultBuilder.addAllComment(comments, currentArgumentStartPosition, offset);
     }
 
-    public boolean hasMoreArguments() {
+    boolean hasMoreArguments() {
       return argumentsIterator.hasNext();
     }
   }
