diff --git a/platform/util/src/org/jdom/ImmutableText.java b/platform/util/src/org/jdom/ImmutableText.java
index fdedbb5..629a43e 100644
--- a/platform/util/src/org/jdom/ImmutableText.java
+++ b/platform/util/src/org/jdom/ImmutableText.java
@@ -50,12 +50,12 @@
   }
 
   @Override
-  public Content detach() {
+  public Text detach() {
     throw ImmutableElement.immutableError(this);
   }
 
   @Override
-  protected Content setParent(Parent parent) {
+  protected Text setParent(Parent parent) {
     throw ImmutableElement.immutableError(this);
     //return null; // to be able to add this to the other element
   }
