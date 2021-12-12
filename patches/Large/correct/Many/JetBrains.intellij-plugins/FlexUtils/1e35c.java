diff --git a/flex/src/com/intellij/lang/javascript/flex/FlexUtils.java b/flex/src/com/intellij/lang/javascript/flex/FlexUtils.java
index a287de2..139f3e1 100644
--- a/flex/src/com/intellij/lang/javascript/flex/FlexUtils.java
+++ b/flex/src/com/intellij/lang/javascript/flex/FlexUtils.java
@@ -772,13 +772,13 @@
   }
 
   public static <T> boolean equalLists(final List<T> list1, final List<T> list2) {
-    if (list1.size() != list2.size()) return true;
+    if (list1.size() != list2.size()) return false;
 
     final Iterator<T> iterator = list1.iterator();
     for (final T element : list2) {
-      if (!iterator.next().equals(element)) return true;
+      if (!iterator.next().equals(element)) return false;
     }
 
-    return false;
+    return true;
   }
 }
