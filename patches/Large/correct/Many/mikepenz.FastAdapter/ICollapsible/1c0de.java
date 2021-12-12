diff --git a/library/src/main/java/com/mikepenz/fastadapter/ICollapsible.java b/library/src/main/java/com/mikepenz/fastadapter/ICollapsible.java
index 864a54e..72a14dd 100644
--- a/library/src/main/java/com/mikepenz/fastadapter/ICollapsible.java
+++ b/library/src/main/java/com/mikepenz/fastadapter/ICollapsible.java
@@ -5,7 +5,7 @@
 /**
  * Created by mikepenz on 30.12.15.
  */
-public interface ICollapsible<T> {
+public interface ICollapsible<T, Item extends IItem> {
     /**
      * @return true if collapsed (closed)
      */
@@ -22,5 +22,5 @@
     /**
      * @return the list of subItems
      */
-    List<IItem> getSubItems();
+    List<Item> getSubItems();
 }
