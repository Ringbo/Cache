diff --git a/src/main/groovy/lang/MetaFieldProperty.java b/src/main/groovy/lang/MetaFieldProperty.java
index f40447d..a97455a 100644
--- a/src/main/groovy/lang/MetaFieldProperty.java
+++ b/src/main/groovy/lang/MetaFieldProperty.java
@@ -79,7 +79,7 @@
                 field.set(object, InvokerHelper.asType(newValue, field.getType()));
             }
             catch (Exception ex) {
-                throw new TypeMissMatchException( "'" + toName(object.getClass()) + "." + field.getName()
+                throw new TypeMismatchException( "'" + toName(object.getClass()) + "." + field.getName()
                                                   + "' can not refer to the value '"
                                                   + newValue + "' (type " + toName(newValue.getClass())
                                                   + "), because it is of the type " + toName(field.getType()) );
