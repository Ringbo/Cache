diff --git a/org.springsource.loaded/src/main/java/org/springsource/loaded/NameRegistry.java b/org.springsource.loaded/src/main/java/org/springsource/loaded/NameRegistry.java
index 749484d..4976634 100644
--- a/org.springsource.loaded/src/main/java/org/springsource/loaded/NameRegistry.java
+++ b/org.springsource.loaded/src/main/java/org/springsource/loaded/NameRegistry.java
@@ -80,7 +80,7 @@
 		int id = getIdFor(slashedClassName);
 		if (id == -1) {
 			id = nextTypeId++;
-			if (id >= allocatedIds.length) {
+			if (nextTypeId >= allocatedIds.length) {
 				size = size + 10;
 				// need to make more room
 				String[] newAllocatedIds = new String[size];
