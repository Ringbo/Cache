diff --git a/subprojects/groovy-xml/src/main/java/groovy/util/slurpersupport/NodeChildren.java b/subprojects/groovy-xml/src/main/java/groovy/util/slurpersupport/NodeChildren.java
index 4ae231a..8e15e31 100644
--- a/subprojects/groovy-xml/src/main/java/groovy/util/slurpersupport/NodeChildren.java
+++ b/subprojects/groovy-xml/src/main/java/groovy/util/slurpersupport/NodeChildren.java
@@ -162,7 +162,7 @@
     }
 
     public String text() {
-        final StringBuffer buf = new StringBuffer();
+        final StringBuilder buf = new StringBuilder();
         final Iterator iter = nodeIterator();
         while (iter.hasNext()) {
             buf.append(((Node) iter.next()).text());
