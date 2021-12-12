diff --git a/src/main/java/org/docx4j/model/listnumbering/ListNumberingDefinition.java b/src/main/java/org/docx4j/model/listnumbering/ListNumberingDefinition.java
index 7debe9c..2747c09 100644
--- a/src/main/java/org/docx4j/model/listnumbering/ListNumberingDefinition.java
+++ b/src/main/java/org/docx4j/model/listnumbering/ListNumberingDefinition.java
@@ -190,7 +190,7 @@
 						}
 
 						Lvl lvl = overrideNode.getLvl();
-						if (lvl != null) {
+						if (lvl != null && this.levels.get(overrideLevelId) != null) {
 							this.levels.get(overrideLevelId).SetOverrides(lvl);
 						}
 						
