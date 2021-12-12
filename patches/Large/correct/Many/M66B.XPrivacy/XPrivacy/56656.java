diff --git a/src/biz/bokhorst/xprivacy/XPrivacy.java b/src/biz/bokhorst/xprivacy/XPrivacy.java
index 227357f..6c59021 100644
--- a/src/biz/bokhorst/xprivacy/XPrivacy.java
+++ b/src/biz/bokhorst/xprivacy/XPrivacy.java
@@ -459,7 +459,8 @@
 					}
 					clazz = clazz.getSuperclass();
 				} catch (Throwable ex) {
-					if (ex.getClass().equals(ClassNotFoundException.class))
+					if (ex.getClass().equals(ClassNotFoundException.class)
+							|| ex.getClass().equals(NoClassDefFoundError.class))
 						break;
 					else
 						throw ex;
