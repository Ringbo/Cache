diff --git a/gdx/src/com/badlogic/gdx/utils/XmlReader.java b/gdx/src/com/badlogic/gdx/utils/XmlReader.java
index 211f59d..afc8155 100644
--- a/gdx/src/com/badlogic/gdx/utils/XmlReader.java
+++ b/gdx/src/com/badlogic/gdx/utils/XmlReader.java
@@ -587,7 +587,7 @@
 		}
 
 		public boolean hasChild (String name) {
-			if (attributes == null) return false;
+			if (children == null) return false;
 			return getChildByName(name) != null;
 		}
 
@@ -605,7 +605,7 @@
 		}
 
 		public boolean hasChildRecursive (String name) {
-			if (attributes == null) return false;
+			if (children == null) return false;
 			return getChildByNameRecursive(name) != null;
 		}
 
