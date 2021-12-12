diff --git a/plugins/devkit/src/actions/ShowSerializedXmlAction.java b/plugins/devkit/src/actions/ShowSerializedXmlAction.java
index e8ac946..9ef05e3 100644
--- a/plugins/devkit/src/actions/ShowSerializedXmlAction.java
+++ b/plugins/devkit/src/actions/ShowSerializedXmlAction.java
@@ -204,7 +204,7 @@
 
     private Object createMap(ParameterizedType type, FList<Type> processedTypes) throws Exception {
       Type keyType = type.getActualTypeArguments()[0];
-      Type valueType = type.getActualTypeArguments()[0];
+      Type valueType = type.getActualTypeArguments()[1];
       final HashMap<Object, Object> map = new HashMap<Object, Object>();
       for (int i = 0; i < 2; i++) {
         Object key = createValue(keyType, processedTypes);
