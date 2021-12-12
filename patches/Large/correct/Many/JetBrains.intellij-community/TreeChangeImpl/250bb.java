diff --git a/source/com/intellij/pom/tree/events/impl/TreeChangeImpl.java b/source/com/intellij/pom/tree/events/impl/TreeChangeImpl.java
index 9f0b86c..5e958fe 100644
--- a/source/com/intellij/pom/tree/events/impl/TreeChangeImpl.java
+++ b/source/com/intellij/pom/tree/events/impl/TreeChangeImpl.java
@@ -284,8 +284,8 @@
     int currentOldOffset = 0;
     do{
       boolean counted = false;
-      while(currentChange != null &&
-            (currentOldOffset == currentChange.getSecond().intValue() && isAfter(currentChange.getFirst(), child))){
+      // child.getTreeNext() != currentChange.getFirst()
+      while(currentChange != null && (currentOldOffset == currentChange.getSecond().intValue() && !isAfter(currentChange.getFirst(), child))){
         if(current == currentChange.getFirst()){
           counted = true;
           current = current.getTreeNext();
