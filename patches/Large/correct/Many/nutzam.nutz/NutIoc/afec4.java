diff --git a/src/org/nutz/ioc/impl/NutIoc.java b/src/org/nutz/ioc/impl/NutIoc.java
index 48a2ee8..e02d508 100644
--- a/src/org/nutz/ioc/impl/NutIoc.java
+++ b/src/org/nutz/ioc/impl/NutIoc.java
@@ -326,7 +326,7 @@
 				IocObject iobj = loader.load(createLoading(), name);
 				if (iobj != null && iobj.getType() != null && klass.isAssignableFrom(iobj.getType()))
 					names.add(name);
-			} catch (ObjectLoadException e) {
+			} catch (Exception e) {
 			}
 		}
     	IocContext cntx;
