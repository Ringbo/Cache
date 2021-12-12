diff --git a/library/src/main/java/com/mikepenz/fastadapter/items/AbstractItem.java b/library/src/main/java/com/mikepenz/fastadapter/items/AbstractItem.java
index cf96c7f..98e2916 100644
--- a/library/src/main/java/com/mikepenz/fastadapter/items/AbstractItem.java
+++ b/library/src/main/java/com/mikepenz/fastadapter/items/AbstractItem.java
@@ -15,7 +15,7 @@
  * Created by mikepenz on 14.07.15.
  * Implements the general methods of the IItem interface to speed up development.
  */
-public abstract class AbstractItem<T, VH extends RecyclerView.ViewHolder> implements IItem<T, VH> {
+public abstract class AbstractItem<Item extends IItem, VH extends RecyclerView.ViewHolder> implements IItem<Item, VH> {
     // the identifier for this item
     protected long mIdentifier = -1;
 
@@ -25,9 +25,9 @@
      * @param identifier
      * @return
      */
-    public T withIdentifier(long identifier) {
+    public Item withIdentifier(long identifier) {
         this.mIdentifier = identifier;
-        return (T) this;
+        return (Item) this;
     }
 
     /**
@@ -47,9 +47,9 @@
      * @param object
      * @return
      */
-    public T withTag(Object object) {
+    public Item withTag(Object object) {
         this.mTag = object;
-        return (T) this;
+        return (Item) this;
     }
 
     /**
@@ -69,9 +69,9 @@
      * @param enabled true if this item is enabled
      * @return
      */
-    public T withEnabled(boolean enabled) {
+    public Item withEnabled(boolean enabled) {
         this.mEnabled = enabled;
-        return (T) this;
+        return (Item) this;
     }
 
     /**
@@ -92,9 +92,9 @@
      * @return
      */
     @Override
-    public T withSetSelected(boolean selected) {
+    public Item withSetSelected(boolean selected) {
         this.mSelected = selected;
-        return (T) this;
+        return (Item) this;
     }
 
     /**
@@ -115,9 +115,9 @@
      * @return
      */
     @Override
-    public T withSelectable(boolean selectable) {
+    public Item withSelectable(boolean selectable) {
         this.mSelectable = selectable;
-        return (T) this;
+        return (Item) this;
     }
 
     /**
