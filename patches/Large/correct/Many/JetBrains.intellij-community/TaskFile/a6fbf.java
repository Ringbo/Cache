diff --git a/python/educational/src/com/jetbrains/edu/courseFormat/TaskFile.java b/python/educational/src/com/jetbrains/edu/courseFormat/TaskFile.java
index f22555d..0ebc4f0 100644
--- a/python/educational/src/com/jetbrains/edu/courseFormat/TaskFile.java
+++ b/python/educational/src/com/jetbrains/edu/courseFormat/TaskFile.java
@@ -164,7 +164,7 @@
     TaskFile that = (TaskFile)o;
 
     if (getIndex() != that.getIndex()) return false;
-    if (name.equals(that.name)) return false;
+    if (!name.equals(that.name)) return false;
 
     final List<AnswerPlaceholder> answerPlaceholders = getAnswerPlaceholders();
     final List<AnswerPlaceholder> thatAnswerPlaceholders = that.getAnswerPlaceholders();
