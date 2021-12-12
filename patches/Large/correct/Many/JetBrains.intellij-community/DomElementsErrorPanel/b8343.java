diff --git a/dom/impl/src/com/intellij/util/xml/highlighting/DomElementsErrorPanel.java b/dom/impl/src/com/intellij/util/xml/highlighting/DomElementsErrorPanel.java
index e68cb45..51eb8a7 100644
--- a/dom/impl/src/com/intellij/util/xml/highlighting/DomElementsErrorPanel.java
+++ b/dom/impl/src/com/intellij/util/xml/highlighting/DomElementsErrorPanel.java
@@ -57,7 +57,7 @@
     addUpdateRequest();
     domManager.addDomEventListener(new DomChangeAdapter() {
       protected void elementChanged(DomElement element) {
-        updatePanel();
+        addUpdateRequest();
       }
     }, this);
   }
