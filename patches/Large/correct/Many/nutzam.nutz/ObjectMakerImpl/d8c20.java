diff --git a/src/org/nutz/ioc/impl/ObjectMakerImpl.java b/src/org/nutz/ioc/impl/ObjectMakerImpl.java
index fd9cd65..3fe6df8 100644
--- a/src/org/nutz/ioc/impl/ObjectMakerImpl.java
+++ b/src/org/nutz/ioc/impl/ObjectMakerImpl.java
@@ -93,7 +93,7 @@
                     if (iobj.getType() == null)
                         iobj.setType(m.getReturnType());
                 }
-                if (iobj.getType() == null)
+                if (iobj.getType() != null)
                     mirror = ing.getMirrors().getMirror(iobj.getType(), ing.getObjectName());
             } else {
                 mirror = ing.getMirrors().getMirror(iobj.getType(), ing.getObjectName());
