diff --git a/src/main/java/org/jsoup/select/ng/ElementSelector.java b/src/main/java/org/jsoup/select/ng/ElementSelector.java
index 5b2f016..c56be7b 100644
--- a/src/main/java/org/jsoup/select/ng/ElementSelector.java
+++ b/src/main/java/org/jsoup/select/ng/ElementSelector.java
@@ -28,7 +28,8 @@
 			if(tag != null && !el.tagName().equals(tag))
 				return false;
 			
-			if(cls != null && !el.className().equals(cls))
+			
+			if(cls != null && !el.classNames().contains(cls))
 				return false;
 			
 			if(id != null && !el.id().equals(id))
