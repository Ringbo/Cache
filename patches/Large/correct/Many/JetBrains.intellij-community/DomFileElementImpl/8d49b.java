diff --git a/dom/impl/src/com/intellij/util/xml/impl/DomFileElementImpl.java b/dom/impl/src/com/intellij/util/xml/impl/DomFileElementImpl.java
index 6e377d0..2798669 100644
--- a/dom/impl/src/com/intellij/util/xml/impl/DomFileElementImpl.java
+++ b/dom/impl/src/com/intellij/util/xml/impl/DomFileElementImpl.java
@@ -206,7 +206,7 @@
 
   protected final DomRootInvocationHandler getRootHandler() {
     synchronized (PsiLock.LOCK) {
-      if (myRootHandler == null) {
+      if (myRootHandler == null || !myRootHandler.isValid()) {
         final XmlTag tag = getRootTag();
         myRootHandler = new DomRootInvocationHandler(myRootElementClass, tag, this, myRootTagName);
       }
