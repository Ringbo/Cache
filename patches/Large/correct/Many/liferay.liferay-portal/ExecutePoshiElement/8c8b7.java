diff --git a/modules/test/poshi-runner/poshi-runner/src/main/java/com/liferay/poshi/runner/elements/ExecutePoshiElement.java b/modules/test/poshi-runner/poshi-runner/src/main/java/com/liferay/poshi/runner/elements/ExecutePoshiElement.java
index a6a6870..20967e9 100644
--- a/modules/test/poshi-runner/poshi-runner/src/main/java/com/liferay/poshi/runner/elements/ExecutePoshiElement.java
+++ b/modules/test/poshi-runner/poshi-runner/src/main/java/com/liferay/poshi/runner/elements/ExecutePoshiElement.java
@@ -168,11 +168,11 @@
 
 		StringBuilder sb = new StringBuilder();
 
-		PoshiElement returnElement = null;
+		ReturnPoshiElement returnPoshiElement = null;
 
 		for (PoshiElement poshiElement : toPoshiElements(elements())) {
 			if (poshiElement instanceof ReturnPoshiElement) {
-				returnElement = poshiElement;
+				returnPoshiElement = (ReturnPoshiElement)poshiElement;
 
 				continue;
 			}
@@ -182,11 +182,11 @@
 
 		String readableBlock = createReadableBlock(sb.toString());
 
-		if (returnElement == null) {
+		if (returnPoshiElement == null) {
 			return readableBlock;
 		}
 
-		return returnElement.createReadableBlock(readableBlock);
+		return returnPoshiElement.createReadableBlock(readableBlock);
 	}
 
 	protected ExecutePoshiElement(Element element) {
