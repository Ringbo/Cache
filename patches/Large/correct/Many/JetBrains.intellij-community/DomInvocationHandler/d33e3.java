diff --git a/xml/dom-impl/src/com/intellij/util/xml/impl/DomInvocationHandler.java b/xml/dom-impl/src/com/intellij/util/xml/impl/DomInvocationHandler.java
index af804af..9057339 100644
--- a/xml/dom-impl/src/com/intellij/util/xml/impl/DomInvocationHandler.java
+++ b/xml/dom-impl/src/com/intellij/util/xml/impl/DomInvocationHandler.java
@@ -207,7 +207,7 @@
   @Override
   public <T extends DomElement> T createStableCopy() {
     XmlTag tag = getXmlTag();
-    if (tag != null) {
+    if (tag != null && tag.isPhysical()) {
       DomInvocationHandler existing = myManager.getDomHandler(tag);
       if (!equals(existing)) {
         throw new IllegalStateException(this + " != " + existing);
