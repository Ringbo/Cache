diff --git a/platform/util/src/org/jdom/ImmutableElement.java b/platform/util/src/org/jdom/ImmutableElement.java
index 526f0c4..8019d12 100644
--- a/platform/util/src/org/jdom/ImmutableElement.java
+++ b/platform/util/src/org/jdom/ImmutableElement.java
@@ -304,7 +304,7 @@
 
   //////////////////////////////////////////////////////////////////////
   @Override
-  public Content detach() {
+  public Element detach() {
     throw immutableError(this);
   }
   @Override
