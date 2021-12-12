diff --git a/jodd-lagarto/src/main/java/jodd/lagarto/dom/Node.java b/jodd-lagarto/src/main/java/jodd/lagarto/dom/Node.java
index 3c156ee..ca4b14b 100644
--- a/jodd-lagarto/src/main/java/jodd/lagarto/dom/Node.java
+++ b/jodd-lagarto/src/main/java/jodd/lagarto/dom/Node.java
@@ -447,7 +447,7 @@
 				return;
 			}
 		}
-		attributes.add(new Attribute(rawAttributeName, name, value, false));
+		attributes.add(new Attribute(rawAttributeName, name, value));
 	}
 
 	/**
