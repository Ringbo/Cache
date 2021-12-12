diff --git a/source/com/intellij/util/xml/impl/AddChildInvocation.java b/source/com/intellij/util/xml/impl/AddChildInvocation.java
index 09e9f73..9e5fed6 100644
--- a/source/com/intellij/util/xml/impl/AddChildInvocation.java
+++ b/source/com/intellij/util/xml/impl/AddChildInvocation.java
@@ -40,7 +40,7 @@
     final DomElement domElement = handler.addChild(myTagName, type, myIndexGetter.fun(args));
     final boolean b = handler.getManager().setChanging(true);
     try {
-      ClassChooserManager.getClassChooser(DomUtil.getRawType(type)).distinguishTag(domElement.getXmlTag(), DomUtil.getRawType(type));
+      ClassChooserManager.getClassChooser(DomUtil.getRawType(myType)).distinguishTag(domElement.getXmlTag(), DomUtil.getRawType(type));
     }
     finally {
       handler.getManager().setChanging(b);
