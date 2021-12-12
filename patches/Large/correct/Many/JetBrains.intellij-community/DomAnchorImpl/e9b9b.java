diff --git a/xml/dom-impl/src/com/intellij/util/xml/impl/DomAnchorImpl.java b/xml/dom-impl/src/com/intellij/util/xml/impl/DomAnchorImpl.java
index 965f1bd..01c0bf7 100644
--- a/xml/dom-impl/src/com/intellij/util/xml/impl/DomAnchorImpl.java
+++ b/xml/dom-impl/src/com/intellij/util/xml/impl/DomAnchorImpl.java
@@ -64,7 +64,7 @@
       return new RootAnchor<T>(fileElement.getFile(), fileElement.getRootElementClass());
     }
 
-    final DomAnchorImpl<DomElement> parentAnchor = (DomAnchorImpl<DomElement>)createAnchor(parent);
+    final DomAnchor<DomElement> parentAnchor = createAnchor(parent);
     final String name = t.getGenericInfo().getElementName(t);
     final AbstractDomChildrenDescription description = t.getChildDescription();
     final List<? extends DomElement> values = description.getValues(parent);
@@ -146,12 +146,12 @@
   public abstract XmlFile getContainingFile();
 
   private static class NamedAnchor<T extends DomElement> extends DomAnchorImpl<T> {
-    private final DomAnchorImpl myParent;
+    private final DomAnchor myParent;
     private final AbstractDomChildrenDescription myDescr;
     private final String myName;
     private final int myIndex;
 
-    private NamedAnchor(final DomAnchorImpl parent, final AbstractDomChildrenDescription descr, final String id, int index) {
+    private NamedAnchor(final DomAnchor parent, final AbstractDomChildrenDescription descr, final String id, int index) {
       myParent = parent;
       myDescr = descr;
       myName = id;
@@ -209,11 +209,11 @@
   }
 
   private static class IndexedAnchor<T extends DomElement> extends DomAnchorImpl<T> {
-    private final DomAnchorImpl myParent;
+    private final DomAnchor myParent;
     private final AbstractDomChildrenDescription myDescr;
     private final int myIndex;
 
-    private IndexedAnchor(final DomAnchorImpl parent, final AbstractDomChildrenDescription descr, final int index) {
+    private IndexedAnchor(final DomAnchor parent, final AbstractDomChildrenDescription descr, final int index) {
       myParent = parent;
       myDescr = descr;
       myIndex = index;
