diff --git a/platform/util/src/org/jdom/ImmutableCDATA.java b/platform/util/src/org/jdom/ImmutableCDATA.java
index 2060675..686224f 100644
--- a/platform/util/src/org/jdom/ImmutableCDATA.java
+++ b/platform/util/src/org/jdom/ImmutableCDATA.java
@@ -22,7 +22,7 @@
 
   @SuppressWarnings("MethodDoesntCallSuperMethod")
   @Override
-  public Text clone() {
+  public CDATA clone() {
     CDATA text = new CDATA();
     text.value = value;
     return text;
@@ -35,7 +35,7 @@
 
   //////////////////////////////////////////////////////////////////////////
   @Override
-  public Text setText(String str) {
+  public CDATA setText(String str) {
     throw ImmutableElement.immutableError(this);
   }
 
@@ -50,12 +50,12 @@
   }
 
   @Override
-  public Content detach() {
+  public CDATA detach() {
     throw ImmutableElement.immutableError(this);
   }
 
   @Override
-  protected Content setParent(Parent parent) {
+  protected CDATA setParent(Parent parent) {
     throw ImmutableElement.immutableError(this);
     //return null; // to be able to add this to the other element
   }
