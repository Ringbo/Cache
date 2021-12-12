diff --git a/src/com/activeandroid/ModelInfo.java b/src/com/activeandroid/ModelInfo.java
index f86d05c..0790073 100644
--- a/src/com/activeandroid/ModelInfo.java
+++ b/src/com/activeandroid/ModelInfo.java
@@ -156,7 +156,7 @@
 				}
 				else if (ReflectionUtils.isTypeSerializer(discoveredClass)) {
 					TypeSerializer typeSerializer = (TypeSerializer) discoveredClass.newInstance();
-					mTypeSerializers.put(typeSerializer.getClass(), typeSerializer);
+					mTypeSerializers.put(typeSerializer.getDeserializedType(), typeSerializer);
 				}
 			}
 			catch (ClassNotFoundException e) {
