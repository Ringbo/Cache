diff --git a/src/java/org/jivesoftware/util/XMLProperties.java b/src/java/org/jivesoftware/util/XMLProperties.java
index 1fa170e..35e0795 100644
--- a/src/java/org/jivesoftware/util/XMLProperties.java
+++ b/src/java/org/jivesoftware/util/XMLProperties.java
@@ -233,7 +233,7 @@
         Iterator iter = element.elementIterator(propName[propName.length - 1]);
         ArrayList<String> props = new ArrayList<String>();
         while (iter.hasNext()) {
-            props.add(((Element)iter.next()).getName());
+            props.add(((Element)iter.next()).getText());
         }
         return props.iterator();
     }
