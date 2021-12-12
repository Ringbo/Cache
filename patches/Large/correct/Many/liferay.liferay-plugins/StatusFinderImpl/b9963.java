diff --git a/portlets/chat-portlet/docroot/WEB-INF/src/com/liferay/chat/service/persistence/impl/StatusFinderImpl.java b/portlets/chat-portlet/docroot/WEB-INF/src/com/liferay/chat/service/persistence/impl/StatusFinderImpl.java
index 2c22d0d..21223da 100644
--- a/portlets/chat-portlet/docroot/WEB-INF/src/com/liferay/chat/service/persistence/impl/StatusFinderImpl.java
+++ b/portlets/chat-portlet/docroot/WEB-INF/src/com/liferay/chat/service/persistence/impl/StatusFinderImpl.java
@@ -186,12 +186,11 @@
 
 			Object[] newObjectArray = new Object[objectArray.length + 1];
 
-			System.arraycopy(objectArray, 0, newObjectArray, 0, 3);
+			System.arraycopy(objectArray, 0, newObjectArray, 0, 4);
 
 			newObjectArray[4] = user.isMale();
 
-			System.arraycopy(
-				objectArray, 4, newObjectArray, 3, objectArray.length);
+			System.arraycopy(objectArray, 4, newObjectArray, 5, 5);
 
 			newObjectArrayList.add(newObjectArray);
 		}
