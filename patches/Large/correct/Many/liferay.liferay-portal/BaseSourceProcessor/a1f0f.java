diff --git a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/BaseSourceProcessor.java b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/BaseSourceProcessor.java
index ff9a9cc..d543275 100644
--- a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/BaseSourceProcessor.java
+++ b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/BaseSourceProcessor.java
@@ -109,9 +109,9 @@
 
 							return null;
 						}
-						catch (Exception e) {
+						catch (Throwable t) {
 							throw new RuntimeException(
-								"Unable to format " + fileName, e);
+								"Unable to format " + fileName, t);
 						}
 					}
 
