diff --git a/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/Notebook.java b/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/Notebook.java
index 38ddf46..d961ac0 100644
--- a/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/Notebook.java
+++ b/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/Notebook.java
@@ -550,11 +550,11 @@
       }).toSortedList(new Comparator<Note>() {
         @Override
         public int compare(Note note1, Note note2) {
-          String name1 = note1.id();
+          String name1 = note1.getId();
           if (note1.getName() != null) {
             name1 = note1.getName();
           }
-          String name2 = note2.id();
+          String name2 = note2.getId();
           if (note2.getName() != null) {
             name2 = note2.getName();
           }
